package net.minigameheaven.survival.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent j) {
		Player p = (Player) j.getPlayer();
		String name = p.getName();
		j.setJoinMessage(ChatColor.LIGHT_PURPLE + name + " joined the server.");
		
		// Send player welcome message
		p.sendMessage(ChatColor.GREEN + "Welcome " + name + ". " + "We hope you enjoy your time on " + ChatColor.DARK_BLUE + ChatColor.BOLD + "MINIGAME HEAVEN!");
	}
}
