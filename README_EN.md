<div align="center">

# Velocity Discord Logger - Backend

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Minecraft](https://img.shields.io/badge/Minecraft-1.21.10-green?style=for-the-badge&logo=minecraft)
![Velocity](https://img.shields.io/badge/Platform-Velocity-0066CC?style=for-the-badge&logo=velocity&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

[한국어](README.md) | [English](README_EN.md)

</div>

---

**VelocityDiscordLogger-Backend** is a **lightweight backend plugin** for Spigot/Paper/Purpur servers that works in conjunction with [VelocityDiscordLogger](https://github.com/minseok7891/VelocityDiscordLogger).

This plugin does not work alone; the main plugin must be installed on the Velocity proxy.

## ✨ Key Features

### 📡 Data Bridge
Detects events on the backend server and forwards them to the Velocity proxy via **Plugin Messaging Channel**.

- **🏆 Achievement Detection**: Detects when a player completes an advancement and sends the title and description to the proxy.
- **☠️ Death Detection**: Detects player death messages and sends them to the proxy.

---

## 📥 Installation

1. Download the latest version from [Releases](https://github.com/minseok7891/VelocityDiscordLogger-Backend/releases).
2. Place the `VelocityDiscordLogger-Backend.jar` file into the `plugins` folder of your backend servers (Lobby, Survival, Creative, etc.).
3. Restart the server.

**⚠️ Requirement**: `VelocityDiscordLogger` must be installed and running on your Velocity proxy.

---

## ⚙️ Configuration

**No configuration required!** 🎉  
This plugin simply forwards data.  
All Discord channel settings, message formatting, and toggles are managed centrally in the Velocity proxy's `config.toml`.

---

<div align="center">
  Made with ❤️ by minseok
</div>
