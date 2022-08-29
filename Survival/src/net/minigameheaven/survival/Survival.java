package net.minigameheaven.survival;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import net.minigameheaven.survival.events.Join;

public class Survival extends JavaPlugin {

	@Override
	public void onEnable() {
		registerListeners();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public void registerListeners() {
		Bukkit.getPluginManager().registerEvents(new Join(), this);
	}
}
