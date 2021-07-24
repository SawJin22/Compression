package me.sawjin.compression.items;

import me.sawjin.compression.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import java.util.ArrayList;

public class ItemStackCrafting implements Listener {

    private static Main plugin;

    public ItemStackCrafting(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPrepareCraftEvent(PrepareItemCraftEvent event) {

        int j = event.getInventory().getMatrix().length + 1;
        ArrayList<Integer> count = new ArrayList<Integer>();

        for (int i = 1; i < j; i++) {
            if (event.getInventory().getItem(i) != null) {
                count.add(i);
            }
        }
        if (count.size() == 1) {
            for (int i = 1; i < j; i++) {
                if (event.getInventory().getItem(i) != null) {
                    if (event.getInventory().getItem(i).getItemMeta() != null) {
                        if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Emerald Block")) {
                            event.getInventory().setResult(new ItemStack(Material.EMERALD_BLOCK, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Cobblestone")) {
                            event.getInventory().setResult(new ItemStack(Material.COBBLESTONE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Clay")) {
                            event.getInventory().setResult(new ItemStack(Material.CLAY, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Sandstone")) {
                            event.getInventory().setResult(new ItemStack(Material.SANDSTONE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Stone")) {
                            event.getInventory().setResult(new ItemStack(Material.STONE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Sand")) {
                            event.getInventory().setResult(new ItemStack(Material.SAND, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Cobbled Deepslate")) {
                            event.getInventory().setResult(new ItemStack(Material.COBBLED_DEEPSLATE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Dirt")) {
                            event.getInventory().setResult(new ItemStack(Material.DIRT, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Purpur Block")) {
                            event.getInventory().setResult(new ItemStack(Material.PURPUR_BLOCK, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Mossy Cobblestone")) {
                            event.getInventory().setResult(new ItemStack(Material.MOSSY_COBBLESTONE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed End Stone")) {
                            event.getInventory().setResult(new ItemStack(Material.END_STONE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Deepslate")) {
                            event.getInventory().setResult(new ItemStack(Material.DEEPSLATE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Gravel")) {
                            event.getInventory().setResult(new ItemStack(Material.GRAVEL, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Granite")) {
                            event.getInventory().setResult(new ItemStack(Material.GRANITE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Diorite")) {
                            event.getInventory().setResult(new ItemStack(Material.DIORITE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Andesite")) {
                            event.getInventory().setResult(new ItemStack(Material.ANDESITE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Prismarine")) {
                            event.getInventory().setResult(new ItemStack(Material.PRISMARINE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Dark Prismarine")) {
                            event.getInventory().setResult(new ItemStack(Material.DARK_PRISMARINE, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Prismarine Brick")) {
                            event.getInventory().setResult(new ItemStack(Material.PRISMARINE_BRICKS, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed Terracotta")) {
                            event.getInventory().setResult(new ItemStack(Material.TERRACOTTA, 9));
                        } else if (event.getInventory().getItem(i).getItemMeta().getDisplayName().equals("Compressed End Stone Bricks")) {
                            event.getInventory().setResult(new ItemStack(Material.END_STONE_BRICKS, 9));
                        }
                    }
                }
            }

        }

    }

    @EventHandler
    public void onPlayerCraft(CraftItemEvent event){
        ArrayList<Integer> count = new ArrayList<Integer>();
        int j = event.getInventory().getMatrix().length + 1;
        for(HumanEntity entity : event.getViewers()){
            if (entity instanceof Player){
                Player player = (Player) entity;

                for(int i = 0; i < j; i++){
                    if(event.getInventory().getItem(i) != null) {
                        if (event.getInventory().getItem(i).getItemMeta() != null) {
                            if (event.getInventory().getItem(i).getItemMeta().getDisplayName() != null) {
                                if (event.getInventory().getItem(i).getItemMeta().getDisplayName().contains("Compressed")) {
                                    count.add(i);
                                }
                            }
                        }
                    }
                }
                if(count.size() > 1){
                    event.setCancelled(true);
                    player.sendMessage("You cannot craft items with compressed blocks.");
                }
            }
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event){
        Player player = event.getPlayer();
        ItemStack item = event.getItemInHand();
        Block block = event.getBlockPlaced();
        if(event.getItemInHand().getItemMeta().getDisplayName() != null) {
            if (event.getItemInHand().getItemMeta().getDisplayName().contains("Compressed")) {
                event.setCancelled(true);
                ((Player) player).sendMessage("You cannot place compressed blocks on the ground.");
            }
        }
    }

    @EventHandler
    public void onClick(InventoryClickEvent event){
        menu inv = new menu();
        if(event.getClickedInventory() != null){
            if(event.getClickedInventory().getHolder() instanceof menu){
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                if(event.getCurrentItem() != null){
                    Material mat = event.getCurrentItem().getType();
                    switch(mat){
                        case COBBLESTONE:
                            player.openInventory(menu.cobblemenu);
                            break;
                        case MOSSY_COBBLESTONE:
                            player.openInventory(menu.mossycobblemenu);
                            break;
                        case YELLOW_STAINED_GLASS_PANE:
                            player.openInventory(inv.getInventory());
                            break;
                        case STONE:
                            player.openInventory(menu.stonemenu);
                            break;
                        case DIRT:
                            player.openInventory(menu.dirtmenu);
                            break;
                        case GRAVEL:
                            player.openInventory(menu.gravelmenu);
                            break;
                        case SAND:
                            player.openInventory(menu.sandmenu);
                            break;
                        case SANDSTONE:
                            player.openInventory(menu.sandstonemenu);
                            break;
                        case DIORITE:
                            player.openInventory(menu.dioritemenu);
                            break;
                        case GRANITE:
                            player.openInventory(menu.granitemenu);
                            break;
                        case ANDESITE:
                            player.openInventory(menu.andesitemenu);
                            break;
                        case CLAY:
                            player.openInventory(menu.claymenu);
                            break;
                        case COBBLED_DEEPSLATE:
                            player.openInventory(menu.cobbledeepmenu);
                            break;
                        case DEEPSLATE:
                            player.openInventory(menu.deepmenu);
                            break;
                        case TERRACOTTA:
                            player.openInventory(menu.terracottamenu);
                            break;
                        case PRISMARINE:
                            player.openInventory(menu.prismarinemenu);
                            break;
                        case DARK_PRISMARINE:
                            player.openInventory(menu.darkprismarinemenu);
                            break;
                        case PRISMARINE_BRICKS:
                            player.openInventory(menu.prismarinebrickmenu);
                            break;
                        case PURPUR_BLOCK:
                            player.openInventory(menu.purpurmenu);
                            break;
                        case EMERALD_BLOCK:
                            player.openInventory(menu.emeraldmenu);
                            break;
                        case DIAMOND_BLOCK:
                            player.openInventory(menu.diamondmenu);
                            break;
                        case GOLD_BLOCK:
                            player.openInventory(menu.goldmenu);
                            break;
                        case IRON_BLOCK:
                            player.openInventory(menu.ironmenu);
                            break;
                        case NETHERRACK:
                            player.openInventory(menu.netherrackmenu);
                            break;
                        case NETHER_BRICKS:
                            player.openInventory(menu.netherbrickmenu);
                            break;
                        case RED_NETHER_BRICKS:
                            player.openInventory(menu.rednetherbrickmenu);
                            break;
                        case BLACKSTONE:
                            player.openInventory(menu.blackstonemenu);
                            break;
                        case END_STONE:
                            player.openInventory(menu.endstonemenu);
                            break;
                        case END_STONE_BRICKS:
                            player.openInventory(menu.endstonebrickmenu);
                            break;
                        default:
                            break;
                    }

                }
            }
        }
    }

}
