package me.sawjin.compression;

import me.sawjin.compression.commands.commands;
import me.sawjin.compression.items.ItemManager;
import me.sawjin.compression.items.ItemStackCrafting;
import me.sawjin.compression.items.Smelting;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemManager.init();
        new Smelting(this);
        new ItemStackCrafting(this);
        getCommand("recipes").setExecutor(new commands());


    }

    @Override
    public void onDisable() {

    }



    }


