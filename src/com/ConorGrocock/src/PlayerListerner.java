package com.ConorGrocock.src;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;

public class PlayerListerner implements Listener{
	public PlayerListerner(Events plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void AcheivmentRewards(PlayerAchievementAwardedEvent event){
		Player player = event.getPlayer();
		player.sendMessage("Congratulations on getting " + event.getAchievement().name());
		player.giveExp(1);
		player.setHealth(20);
	}
}
