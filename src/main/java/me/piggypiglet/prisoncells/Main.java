package me.piggypiglet.prisoncells;

import me.piggypiglet.prisoncells.handlers.ConfigHandler;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

// ------------------------------
// Copyright (c) PiggyPiglet 2017
// https://www.piggypiglet.me
// ------------------------------
public class Main extends JavaPlugin {
    private ConfigHandler config;

    private static Main instance;
    public static Main getInstance() {
        return instance;
    }

    public Main() {
        config = new ConfigHandler();
    }
    @Override
    public void onEnable() {
        instance = this;

        new Config(this, getDataFolder().getPath(), "config.yml");
        new Config(this, getDataFolder().getPath(), "lang.yml");

        final FileConfiguration cfg = config.getConfig(this, getDataFolder().getPath(), "config.yml");
        cfg.addDefault("banana", 1);
        cfg.options().copyDefaults(true);
        try {
            cfg.save(new File(getDataFolder().getPath(), "config.yml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onDisable() {
        instance = null;
    }
}
