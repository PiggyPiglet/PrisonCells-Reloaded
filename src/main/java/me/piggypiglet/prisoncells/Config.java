package me.piggypiglet.prisoncells;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;

// ------------------------------
// Copyright (c) PiggyPiglet 2017
// https://www.piggypiglet.me
// ------------------------------
class Config {
    Config(JavaPlugin main, String path, String fileName) {
        File file = new File(path, fileName);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            main.saveResource(fileName, false);
        }
        FileConfiguration fileConfig = new YamlConfiguration();
        try {
            fileConfig.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
