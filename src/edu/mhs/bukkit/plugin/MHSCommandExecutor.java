package edu.mhs.bukkit.plugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MHSCommandExecutor implements CommandExecutor {
	
	private TestPlugin plugin; // pointer to your main class, unrequired if you don't need methods from the main class
	 
	public MHSCommandExecutor(TestPlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] commandArgs) {
		Bukkit.getLogger().info("in command executor");
		return true;
	}

}
