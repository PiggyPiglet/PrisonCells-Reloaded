package me.piggypiglet.prisoncells.handlers;

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
    public ConfigHandler() {
        plugin = Main.getInstance();
    }
    String getMessages(String before, Messages m) {
        FileConfiguration cfg = getConfig(plugin, plugin.getDataFolder().getPath(), "lang.yml");
        return cfg.getString(before + m.toString());
    }
    public FileConfiguration getConfig(JavaPlugin main, String path, String fileName) {
        File file = new File(path, fileName);
        if (!file.exists()) {
            main.getLogger().info(fileName + " isn't a config!");
        }
        FileConfiguration fileConfig = new YamlConfiguration();
        try {
            fileConfig.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileConfig;
    }
}
