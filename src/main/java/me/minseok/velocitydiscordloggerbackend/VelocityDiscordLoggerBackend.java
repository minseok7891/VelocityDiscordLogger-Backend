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

public class VelocityDiscordLoggerBackend extends JavaPlugin implements Listener {

    private static final String CHANNEL = "velocitydiscordlogger:channel";

    @Override
    public void onEnable() {
        getServer().getMessenger().registerOutgoingPluginChannel(this, CHANNEL);
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("VelocityDiscordLogger-Backend enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("VelocityDiscordLogger-Backend disabled!");
    }

    @EventHandler
    public void onAchievement(PlayerAdvancementDoneEvent event) {
        Advancement advancement = event.getAdvancement();
        // Filter out recipes and root advancements
        if (advancement.getKey().getKey().startsWith("recipes/"))
            return;
        if (event.getPlayer().getAdvancementProgress(advancement).getRemainingCriteria().size() > 0)
            return; // Not fully completed

        // Simple check for displayable advancements
        if (advancement.getDisplay() == null)
            return;

        String title = advancement.getDisplay().getTitle();
        String description = advancement.getDisplay().getDescription();

        sendPluginMessage(event.getPlayer(), "achievement", title, description);
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        String deathMessage = event.getDeathMessage();
        if (deathMessage == null || deathMessage.isEmpty())
            return;

        sendPluginMessage(event.getEntity(), "death", deathMessage);
    }

    private void sendPluginMessage(Player player, String subChannel, String... args) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF(subChannel);
        out.writeUTF(player.getName());
        out.writeUTF(player.getUniqueId().toString());

        for (String arg : args) {
            out.writeUTF(arg);
        }

        player.sendPluginMessage(this, CHANNEL, out.toByteArray());
    }
}
