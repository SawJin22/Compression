package me.sawjin.compression.items;

import me.sawjin.compression.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.inventory.ItemStack;

public class Smelting implements Listener {
    private static Main plugin;
    public Smelting(Main plugin){
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void smeltcobble(FurnaceSmeltEvent event) {
        ItemStack stone = new ItemStack(Material.STONE, 9);
        ItemStack glass = new ItemStack(Material.GLASS, 9);
        ItemStack smoothstone = new ItemStack(Material.SMOOTH_STONE, 9);
        ItemStack terracotta = new ItemStack(Material.TERRACOTTA, 9);
        ItemStack smoothsandstone = new ItemStack(Material.SMOOTH_SANDSTONE, 9);
        ItemStack deepslate = new ItemStack(Material.DEEPSLATE, 9);
        ItemStack netherbricks = new ItemStack(Material.NETHER_BRICK, 9);
        if (event.getSource().getItemMeta().getDisplayName().equals("Compressed Cobblestone")) {
            event.setResult(stone);
        } else if (event.getSource().getItemMeta().getDisplayName().equals("Compressed Sand")) {
            event.setResult(glass);
        } else if (event.getSource().getItemMeta().getDisplayName().equals("Compressed Stone")) {
            event.setResult(smoothstone);
        } else if (event.getSource().getItemMeta().getDisplayName().equals("Compressed Clay")) {
            event.setResult(terracotta);
        } else if (event.getSource().getItemMeta().getDisplayName().equals("Compressed Sandstone")) {
            event.setResult(smoothsandstone);
        } else if (event.getSource().getItemMeta().getDisplayName().equals("Compressed Cobbled Deepslate")) {
            event.setResult(deepslate);
        } else if (event.getSource().getItemMeta().getDisplayName().equals("Compressed Netherrack")) {
            event.setResult(netherbricks);
        }
    }
}

