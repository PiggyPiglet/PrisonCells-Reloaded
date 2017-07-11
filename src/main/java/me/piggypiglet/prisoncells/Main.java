package me.piggypiglet.prisoncells;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

// ------------------------------
// Copyright (c) PiggyPiglet 2017
// https://www.piggypiglet.me
// ------------------------------
public class Main extends JavaPlugin {

    private static Main instance;
    public static Main getInstance() {
        return instance;
    }

    private Config cfg() {
        return new Config(getDataFolder().getPath(), "config.yml");
    }
    private Config lang() {
        return new Config(getDataFolder().getPath(), "lang.yml");
    }
    @Override
    public void onEnable() {
        instance = this;

        cfg();
        lang();

        final FileConfiguration cfg = cfg().getConfig();
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
