package me.bennun.testminecraftplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class TestMinecraftPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable was called EJM!");
        // getLogger().warning("This is a test error that is called when onEnable was called.");
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable was called EJM!");
        // getLogger().warning("This is a test error that is called when onDisable was called.");
    }
}
