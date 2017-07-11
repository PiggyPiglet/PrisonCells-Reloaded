package me.piggypiglet.prisoncells;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.*;

// ------------------------------
// Copyright (c) PiggyPiglet 2017
// https://www.piggypiglet.me
// ------------------------------
public class Config {
    private FileConfiguration fileConfig;

    public Config(String path, String fileName) {
        Main main = Main.getInstance();
        File file = new File(path, fileName);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            main.saveResource(fileName, false);
        }
        FileConfiguration filesConfig = new YamlConfiguration();
        try {
            filesConfig.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        fileConfig = filesConfig;
    }

    public FileConfiguration getConfig(){
        return fileConfig;
    }
}
