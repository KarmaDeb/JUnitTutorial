package org.example;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class JUnitTutorialPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager manager = this.getServer().getPluginManager();
        manager.registerEvents(new OnBlockBreak(), this);
    }
}
