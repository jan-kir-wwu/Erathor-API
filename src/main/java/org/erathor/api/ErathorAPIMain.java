package org.erathor.api;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class ErathorAPIMain extends JavaPlugin {

    private static ErathorAPI erathorCore;

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
            erathorCore = (ErathorAPI) npl;
        } catch (Exception e) {
            Bukkit.getLogger()
                    .info(ChatColor.RED + "[ErathorAPI] [Error] : ErathorCore not existent.");
            Bukkit.shutdown();
            return;
        }

        Bukkit.getLogger().info("ErathorAPI enabled!");
    }

    public static ErathorAPI getInstance() {
        return erathorCore;
    }
}
