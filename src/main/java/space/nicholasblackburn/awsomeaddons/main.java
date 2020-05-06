package space.nicholasblackburn.awsomeaddons;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main Spigot plugin class
 */

public class main extends JavaPlugin{

    public static java.util.logging.Logger Logger = Bukkit.getLogger();

    @Override
    public void onEnable() {
        Logger.warning("_____________________________________________");
        Logger.warning("___   custo Plugin running                 __");
        Logger.warning("_____________________________________________");

    }

    @Override
    public void onDisable(){
    
    }

    @Override
    public void onLoad(){

    }

}