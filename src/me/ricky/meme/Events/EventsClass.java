package me.ricky.meme.Events;

import me.ricky.meme.Meme;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.Plugin;


public class EventsClass implements Listener {
    Plugin plugin = Meme.getPlugin(Meme.class);

    @EventHandler
    public void onBreak(BlockBreakEvent event){
        Block block = event.getBlock();
        Player player = event.getPlayer();


        Location bLocation = block.getLocation();
        player.sendMessage(ChatColor.GOLD + "You broke: " + ChatColor.AQUA + block.getType().toString().toUpperCase());
        player.sendMessage(ChatColor.GOLD + "Location:");
        player.sendMessage(ChatColor.BLUE + "     World: " + ChatColor.WHITE + bLocation.getWorld().getName());
        player.sendMessage(ChatColor.BLUE + "     X: " + ChatColor.WHITE + bLocation.getBlockX());
        player.sendMessage(ChatColor.BLUE + "     Y: " + ChatColor.WHITE + bLocation.getBlockY());
        player.sendMessage(ChatColor.BLUE + "     Z: " + ChatColor.WHITE + bLocation.getBlockZ());

    }

    @EventHandler
    public void onPlace(BlockPlaceEvent event){
        Block block = event.getBlock();
        Player player = event.getPlayer();


        Location bLocation = block.getLocation();
        player.sendMessage(ChatColor.BLUE + "You placed: " + ChatColor.LIGHT_PURPLE + block.getType().toString().toUpperCase());
        player.sendMessage(ChatColor.BLUE + "Location:");
        player.sendMessage(ChatColor.GOLD + "     World: " + ChatColor.WHITE + bLocation.getWorld().getName());
        player.sendMessage(ChatColor.GOLD + "     X: " + ChatColor.WHITE + bLocation.getBlockX());
        player.sendMessage(ChatColor.GOLD + "     Y: " + ChatColor.WHITE + bLocation.getBlockY());
        player.sendMessage(ChatColor.GOLD + "     Z: " + ChatColor.WHITE + bLocation.getBlockZ());

        if(block.getType().equals(Material.TNT)){
            plugin.getServer().broadcastMessage(ChatColor.GREEN + player.getName() + " Placed: " + ChatColor.LIGHT_PURPLE + block.getType().toString().toUpperCase());

        }

    }
}