package me.minseok.velocitydiscordloggerbackend;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.bukkit.plugin.java.JavaPlugin;
import com.google.gson.JsonObject;

public class VelocityDiscordLoggerBackend extends JavaPlugin implements Listener {

    private static final String CHANNEL = "velocitydiscordlogger:main";

    @Override
    public void onEnable() {
        getServer().getMessenger().registerOutgoingPluginChannel(this, CHANNEL);
        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("server").setExecutor(new ServerCommand(this));
        getLogger().info("VelocityDiscordLogger-Backend enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("VelocityDiscordLogger-Backend disabled!");
    }

    @EventHandler
    public void onAchievement(PlayerAdvancementDoneEvent event) {
        Advancement advancement = event.getAdvancement();
        if (advancement.getKey().getKey().startsWith("recipes/"))
            return;
        if (event.getPlayer().getAdvancementProgress(advancement).getRemainingCriteria().size() > 0)
            return;

        if (advancement.getDisplay() == null)
            return;

        String title = advancement.getDisplay().getTitle();
        String description = advancement.getDisplay().getDescription();
        String key = advancement.getKey().toString();

        JsonObject json = new JsonObject();
        json.addProperty("type", "achievement");
        json.addProperty("username", event.getPlayer().getName());
        json.addProperty("uuid", event.getPlayer().getUniqueId().toString());
        json.addProperty("title", title);
        json.addProperty("description", description);
        json.addProperty("key", key);

        sendPluginMessage(event.getPlayer(), json.toString());
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        String deathMessage = event.getDeathMessage();
        if (deathMessage == null || deathMessage.isEmpty())
            return;

        JsonObject json = new JsonObject();
        json.addProperty("type", "death");
        json.addProperty("username", event.getEntity().getName());
        json.addProperty("uuid", event.getEntity().getUniqueId().toString());
        json.addProperty("message", deathMessage);

        sendPluginMessage(event.getEntity(), json.toString());
    }

    private void sendPluginMessage(Player player, String message) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF(message);
        player.sendPluginMessage(this, CHANNEL, out.toByteArray());
    }
}
