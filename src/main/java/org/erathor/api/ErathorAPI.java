package org.erathor.api;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class ErathorAPI extends JavaPlugin {

    private static Erathor erathorCore;

    @Override
    public void onEnable() {
        Plugin npl = Bukkit.getPluginManager().getPlugin("ErathorCore");
        if (npl == null) {
            Bukkit.getLogger()
                    .info(ChatColor.RED + "[ErathorAPI] [Error] : ErathorCore not existent.");
            Bukkit.shutdown();
            return;
        }

        try {
            erathorCore = (Erathor) npl;
        } catch (Exception e) {
            Bukkit.getLogger()
                    .info(ChatColor.RED + "[ErathorAPI] [Error] : ErathorCore not existent.");
            Bukkit.shutdown();
            return;
        }

        Bukkit.getLogger().info("ErathorAPI enabled!");
    }

    public static Erathor getInstance() {
        return erathorCore;
    }
}
