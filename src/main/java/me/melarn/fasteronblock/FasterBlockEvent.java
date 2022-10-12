package me.melarn.fasteronblock;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FasterBlockEvent implements Listener {

    @EventHandler
    public void onPlayerWalk(PlayerMoveEvent event){
        Player player = event.getPlayer();
        if (player.getLocation().getBlock().getType().equals(Material.DIRT_PATH)){
//            player.sendMessage("you stood on block");
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 25, (int) 0.3f).withParticles(false).withIcon(false));
        }
    }
}
