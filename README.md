# VelocityDiscordLogger-Backend

A lightweight backend plugin for Spigot/Paper/Purpur servers that works in conjunction with [VelocityDiscordLogger](https://github.com/minseok7891/VelocityDiscordLogger).

## Purpose

This plugin listens for specific events on the backend server and forwards them to the Velocity proxy via Plugin Messaging. The main `VelocityDiscordLogger` plugin on the proxy then handles sending these events to Discord.

## Features

- **Achievement Logging**: Detects when a player completes an advancement and sends the title and description to the proxy.
- **Death Logging**: Detects player death messages and sends them to the proxy.

## Installation

1. Download the latest release.
2. Place the `VelocityDiscordLogger-Backend.jar` file into the `plugins` folder of your backend servers (Lobby, Survival, Creative, etc.).
3. **Requirement**: Ensure `VelocityDiscordLogger` is installed and running on your Velocity proxy.

## Configuration

No configuration is required! This plugin simply forwards data. All Discord channel settings and message formatting are handled by the main plugin on the Velocity proxy.
