package me.sawjin.compression.commands;

import me.sawjin.compression.items.menu;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (!(sender instanceof Player)){
            sender.sendMessage("Only players can use this command");
            return true;
        }
        Player player = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("recipes")){
            menu gui = new menu();
            player.openInventory(gui.getInventory());
            player.sendMessage(ChatColor.AQUA + "Take a look at all the compressable blocks.");
        }
        return false;
    }

}
