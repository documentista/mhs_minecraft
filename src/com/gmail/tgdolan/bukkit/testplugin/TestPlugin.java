package com.gmail.tgdolan.bukkit.testplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.tgdolan.bukkit.listeners.LoginListener;

public class TestPlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		MHSCommandExecutor commandExecutor = new MHSCommandExecutor(this);
		getCommand("basic").setExecutor(commandExecutor);
		
		getServer().getPluginManager().registerEvents(new LoginListener(), this);
	}

	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}

	

	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if (command.getName().equalsIgnoreCase("showPlayers")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("This command can only be run by a player.");
			} else {
				
				getLogger().info("custom command");
				
			}
			return true;
		}
		return false;
	}	
	
}
