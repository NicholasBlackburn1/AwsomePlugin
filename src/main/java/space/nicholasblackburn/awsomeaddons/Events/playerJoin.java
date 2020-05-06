package space.nicholasblackburn.awsomeaddons.Events;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import space.nicholasblackburn.awsomeaddons.main;

public class playerJoin {
    
    private final String Welcome = "Want's To Survive!";
    private final String Logedip = "Got Ip of ";

    @EventHandler

    public void onPlayerJoin(final PlayerJoinEvent event){
        final Player player = event.getPlayer();
        final String playername = player.getPlayer().getDisplayName();

        joinMessage(player, playername);
        PlayerIp(player, playername);
    }

    public void joinMessage(final Player player, final String playername) {
        Bukkit.broadcastMessage(ChatColor.AQUA + playername + ChatColor.GOLD + Welcome + "(" + ChatColor.AQUA
                + Bukkit.getOnlinePlayers() + "/" + ChatColor.AQUA + Bukkit.getMaxPlayers());

    }

    public void PlayerIp(final Player player, final String playername) {
        
        main.Logger.warning(Logedip + playername +"who's ip is"+ player.getAddress());
    }
    
}