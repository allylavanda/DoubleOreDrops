package me.sjaeledyr.doubleoredrops;

import org.bukkit.plugin.java.JavaPlugin;

public final class DoubleOreDrops extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[DoubleOreDrops] DoubleOreDrops by Sjaeledyr has been Loaded!");
        System.out.println("[DoubleOreDrops] Plugin Version 1.2");

        getServer().getPluginManager().registerEvents(new BreakBlock(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[DoubleOreDrops] DoubleOreDrops has been disabled!");
    }
}

