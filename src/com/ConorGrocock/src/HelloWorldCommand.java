package com.ConorGrocock.src;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class HelloWorldCommand extends JavaPlugin{
	
	public void onEnable(){
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("hello") && sender instanceof Player){
			
			Player player = (Player) sender;
			player.sendMessage("Hello World!");
			return true;
		}
		return super.onCommand(sender, cmd, label, args);
	}
}
