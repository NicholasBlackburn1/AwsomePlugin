package space.nicholasblackburn.awsomeaddons.Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;

public class playerDeath {
    
    private String message = "Died At the Hands of";

    @EventHandler

    public void onPlayerDeath(PlayerDeathEvent event){
        Player player = event.getEntity().getPlayer();
        String playername = player.getPlayer().getDisplayName();
        
        playerDies(player, playername);
        
    }

    public void playerDies(Player player, String playername){
        if(player.isDead()){
            player.getWorld().strikeLightningEffect(player.getLocation());
            player.playSound(player.getLocation(), Sound.ENTITY_HORSE_DEATH, SoundCategory.MASTER, 1.5F, 1.5F);
            Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + playername+ ChatColor.YELLOW + message + player.getKiller());
        }
    }


}