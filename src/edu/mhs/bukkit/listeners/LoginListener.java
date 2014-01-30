package edu.mhs.bukkit.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;

public final class LoginListener implements Listener {
	@EventHandler
	public void normalLogin(PlayerLoginEvent event) {
		Bukkit.getLogger().info("Normal Hello, " + event.getPlayer().getDisplayName());
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void highLogin(PlayerLoginEvent event) {
		Bukkit.getLogger().info("High Hello, " + event.getPlayer().getDisplayName());
	}
}