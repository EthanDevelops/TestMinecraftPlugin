package me.bennun.testminecraftplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class TestMinecraftPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable was called!");
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable was called!");
    }
}
