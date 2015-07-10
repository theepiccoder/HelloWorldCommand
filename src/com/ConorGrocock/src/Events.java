package com.ConorGrocock.src;

import org.bukkit.plugin.java.JavaPlugin;


public class Events extends JavaPlugin{
	
	public void onEnable(){
		new PlayerListerner(this);
	}
}
