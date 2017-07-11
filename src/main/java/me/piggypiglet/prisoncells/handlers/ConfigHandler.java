package me.piggypiglet.prisoncells.handlers;

import me.piggypiglet.prisoncells.Config;
import me.piggypiglet.prisoncells.Main;
import me.piggypiglet.prisoncells.enums.Messages;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

// ------------------------------
// Copyright (c) PiggyPiglet 2017
// https://www.piggypiglet.me
// ------------------------------
public class ConfigHandler {
    private Main plugin;
    private Config config;

    public ConfigHandler() {
        plugin = Main.getInstance();
        config = new Config(plugin.getDataFolder().getPath(), "lang.yml");
    }
    String getMessages(String before, Messages m) {
        FileConfiguration cfg = config.getConfig();
        return cfg.getString(before + m.toString());
    }
}
