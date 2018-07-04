package me.ricky.meme;

import me.ricky.meme.Events.EventsClass;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Meme extends JavaPlugin {

    public void onEnable(){
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nMeme has been Enabled\n\n");
        getServer().getPluginManager().registerEvents(new EventsClass(), this);
    }

    public void onDisable(){
        //update
        
        //nigger
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nMeme has been Disabled\n\n");
    }

}

