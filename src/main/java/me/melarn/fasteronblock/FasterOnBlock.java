package me.melarn.fasteronblock;

import org.bukkit.plugin.java.JavaPlugin;

public final class FasterOnBlock extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new FasterBlockEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
