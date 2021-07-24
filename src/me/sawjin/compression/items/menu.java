package me.sawjin.compression.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class menu implements InventoryHolder {

    public static Inventory cobblemenu;
    public static Inventory mossycobblemenu;
    public static Inventory stonemenu;
    public static Inventory dirtmenu;
    public static Inventory gravelmenu;
    public static Inventory sandmenu;
    public static Inventory sandstonemenu;
    public static Inventory dioritemenu;
    public static Inventory granitemenu;
    public static Inventory andesitemenu;
    public static Inventory claymenu;
    public static Inventory cobbledeepmenu;
    public static Inventory deepmenu;
    public static Inventory terracottamenu;
    public static Inventory prismarinemenu;
    public static Inventory prismarinebrickmenu;
    public static Inventory darkprismarinemenu;
    public static Inventory purpurmenu;
    public static Inventory emeraldmenu;
    public static Inventory diamondmenu;
    public static Inventory goldmenu;
    public static Inventory ironmenu;
    public static Inventory netherrackmenu;
    public static Inventory netherbrickmenu;
    public static Inventory rednetherbrickmenu;
    public static Inventory blackstonemenu;
    public static Inventory endstonemenu;
    public static Inventory endstonebrickmenu;


    private Inventory inv;

    public menu(){
        ArrayList<Inventory> inventories = new ArrayList<Inventory>();

        inv = Bukkit.createInventory(this, 36, "§3Compressed Blocks");
        cobblemenu = Bukkit.createInventory(this, 27, "§9Compressed Cobblestone"); inventories.add(cobblemenu);
        mossycobblemenu = Bukkit.createInventory(this, 27, "§9Compressed Mossy Cobblestone"); inventories.add(mossycobblemenu);
        stonemenu = Bukkit.createInventory(this, 27, "§9Compressed Stone"); inventories.add(stonemenu);
        dirtmenu = Bukkit.createInventory(this, 27, "§9Compressed Dirt"); inventories.add(dirtmenu);
        gravelmenu = Bukkit.createInventory(this, 27, "§9Compressed Gravel"); inventories.add(gravelmenu);
        sandmenu = Bukkit.createInventory(this, 27, "§9Compressed Sand"); inventories.add(sandmenu);
        sandstonemenu = Bukkit.createInventory(this, 27, "§9Compressed Sandstone"); inventories.add(sandstonemenu);
        dioritemenu = Bukkit.createInventory(this, 27, "§9Compressed Diorite"); inventories.add(dioritemenu);
        granitemenu = Bukkit.createInventory(this, 27, "§9Compressed Granite"); inventories.add(granitemenu);
        andesitemenu = Bukkit.createInventory(this, 27, "§9Compressed Andesite"); inventories.add(andesitemenu);
        claymenu = Bukkit.createInventory(this, 27, "§9Compressed Clay"); inventories.add(claymenu);
        cobbledeepmenu = Bukkit.createInventory(this, 27, "§9Compressed Cobbled Deepslate"); inventories.add(cobbledeepmenu);
        deepmenu = Bukkit.createInventory(this, 27, "§9Compressed Deepslate"); inventories.add(deepmenu);
        terracottamenu = Bukkit.createInventory(this, 27, "§9Compressed Terracotta"); inventories.add(terracottamenu);
        prismarinemenu = Bukkit.createInventory(this, 27, "§9Compressed Prismarine"); inventories.add(prismarinemenu);
        darkprismarinemenu = Bukkit.createInventory(this, 27, "§9Compressed Dark Prismarine"); inventories.add(darkprismarinemenu);
        prismarinebrickmenu = Bukkit.createInventory(this, 27, "§9Compressed Prismarine Brick"); inventories.add(prismarinebrickmenu);
        purpurmenu = Bukkit.createInventory(this, 27, "§9Compressed Purpur Block"); inventories.add(purpurmenu);
        emeraldmenu = Bukkit.createInventory(this, 27, "§9Compressed Emerald Block"); inventories.add(emeraldmenu);
        diamondmenu = Bukkit.createInventory(this, 27, "§9Compressed Diamond Block"); inventories.add(diamondmenu);
        goldmenu = Bukkit.createInventory(this, 27, "§9Compressed Gold Block"); inventories.add(goldmenu);
        ironmenu = Bukkit.createInventory(this, 27, "§9Compressed Iron Block"); inventories.add(ironmenu);
        netherrackmenu = Bukkit.createInventory(this, 27, "§9Compressed Netherrack"); inventories.add(netherrackmenu);
        netherbrickmenu = Bukkit.createInventory(this, 27, "§9Compressed Nether Bricks"); inventories.add(netherbrickmenu);
        rednetherbrickmenu = Bukkit.createInventory(this, 27, "§9Compressed Red Nether Bricks"); inventories.add(rednetherbrickmenu);
        blackstonemenu = Bukkit.createInventory(this, 27, "§9Compressed Blackstone"); inventories.add(blackstonemenu);
        endstonemenu = Bukkit.createInventory(this, 27, "§9Compressed End Stone"); inventories.add(endstonemenu);
        endstonebrickmenu = Bukkit.createInventory(this, 27, "§9Compressed End Stone Brick"); inventories.add(endstonemenu);
        init();

    }

    private void init() {
        ArrayList<ItemStack> items = new ArrayList<ItemStack>();
        ItemStack item1; ItemStack item2; ItemStack item3; ItemStack item4; ItemStack item5; ItemStack item6; ItemStack item7; ItemStack item8; ItemStack item9;
        ItemStack item10; ItemStack item11; ItemStack item12; ItemStack item13; ItemStack item14; ItemStack item15; ItemStack item16; ItemStack item17;
        ItemStack item18; ItemStack item19; ItemStack item20; ItemStack item21; ItemStack item22; ItemStack item23; ItemStack item24; ItemStack item25;
        ItemStack item26; ItemStack item27; ItemStack item28;
        item1 = createItem("§dCompressed Cobblestone", Material.COBBLESTONE, Collections.singletonList("§7The cobblestone is very dense")); items.add(item1);
        item2 = createItem("§dCompressed Mossy Cobblestone", Material.MOSSY_COBBLESTONE, Collections.singletonList("§7The mossy cobblestone is very dense")); items.add(item2);
        item3 = createItem("§dCompressed Stone", Material.STONE, Collections.singletonList("§7The stone is very dense")); items.add(item3);
        item4 = createItem("§dCompressed Dirt", Material.DIRT, Collections.singletonList("§7The dirt is very dense")); items.add(item4);
        item5 = createItem("§dCompressed Gravel", Material.GRAVEL, Collections.singletonList("§7The gravel is very dense")); items.add(item5);
        item6 = createItem("§dCompressed Sand", Material.SAND, Collections.singletonList("§7The sand is very dense")); items.add(item6);
        item7 = createItem("§dCompressed Sandstone", Material.SANDSTONE, Collections.singletonList("§7The sandstone is very dense")); items.add(item7);
        item8 = createItem("§dCompressed Diorite", Material.DIORITE, Collections.singletonList("§7The diorite is very dense")); items.add(item8);
        item9 = createItem("§dCompressed Granite", Material.GRANITE, Collections.singletonList("§7The granite is very dense")); items.add(item9);
        item10 = createItem("§dCompressed Andesite", Material.ANDESITE, Collections.singletonList("§7The andesite is very dense")); items.add(item10);
        item11 = createItem("§dCompressed Clay", Material.CLAY, Collections.singletonList("§7The clay is very dense")); items.add(item11);
        item12 = createItem("§dCompressed Cobbled Deepslate", Material.COBBLED_DEEPSLATE, Collections.singletonList("§7The cobbled deepslate is very dense")); items.add(item12);
        item13 = createItem("§dCompressed Deepslate", Material.DEEPSLATE, Collections.singletonList("§7The deepslate is very dense")); items.add(item13);
        item14 = createItem("§dCompressed Terracotta", Material.TERRACOTTA, Collections.singletonList("§7The terracotta is very dense")); items.add(item14);
        item15 = createItem("§dCompressed Prismarine", Material.PRISMARINE, Collections.singletonList("§7The prismarine is very dense")); items.add(item15);
        item16 = createItem("§dCompressed Prismarine Brick", Material.PRISMARINE_BRICKS, Collections.singletonList("§7The prismarine brick is very dense")); items.add(item16);
        item17 = createItem("§dCompressed Dark Prismarine", Material.DARK_PRISMARINE, Collections.singletonList("§7The dark prismarine is very dense")); items.add(item17);
        item18 = createItem("§dCompressed Purpur", Material.PURPUR_BLOCK, Collections.singletonList("§7The purpur is very dense")); items.add(item18);
        item19 = createItem("§dCompressed Emerald Block", Material.EMERALD_BLOCK, Collections.singletonList("§7The emerald block is very dense")); items.add(item19);
        item20 = createItem("§dCompressed Diamond Block", Material.DIAMOND_BLOCK, Collections.singletonList("§7The diamond block is very dense")); items.add(item20);
        item21 = createItem("§dCompressed Gold Block", Material.GOLD_BLOCK, Collections.singletonList("§7The gold block is very dense")); items.add(item21);
        item22 = createItem("§dCompressed Iron Block", Material.IRON_BLOCK, Collections.singletonList("§7The iron block is very dense")); items.add(item22);
        item23 = createItem("§dCompressed Netherrack", Material.NETHERRACK, Collections.singletonList("§7The netherrack is very dense")); items.add(item23);
        item24 = createItem("§dCompressed Nether Bricks", Material.NETHER_BRICKS, Collections.singletonList("§7The nether brick is very dense")); items.add(item24);
        item25 = createItem("§dCompressed Red Nether Bricks", Material.RED_NETHER_BRICKS, Collections.singletonList("§7The red nether brick is very dense")); items.add(item25);
        item26 = createItem("§dCompressed Blackstone", Material.BLACKSTONE, Collections.singletonList("§7The blackstone is very dense")); items.add(item26);
        item27 = createItem("§dCompressed End Stone", Material.END_STONE, Collections.singletonList("§7The end stone is very dense")); items.add(item27);
        item28 = createItem("§dCompressed End Stone Bricks", Material.END_STONE_BRICKS, Collections.singletonList("§7The end stone brick is very dense")); items.add(item28);



        for (int i = 0; i < items.size(); i++){
            inv.setItem(inv.firstEmpty(), items.get(i));
            //items.get(i) = ;
        }

        cobblemenu = fillInventory(cobblemenu, item1, Material.COBBLESTONE);
        mossycobblemenu = fillInventory(mossycobblemenu, item2, Material.MOSSY_COBBLESTONE);
        stonemenu = fillInventory(stonemenu, item3, Material.STONE);
        dirtmenu = fillInventory(dirtmenu, item4, Material.DIRT);
        gravelmenu = fillInventory(gravelmenu, item5, Material.GRAVEL);
        sandmenu = fillInventory(sandmenu, item6, Material.SAND);
        sandstonemenu = fillInventory(sandstonemenu, item7, Material.SANDSTONE);
        dioritemenu = fillInventory(dioritemenu, item8, Material.DIORITE);
        granitemenu = fillInventory(granitemenu, item9, Material.GRANITE);
        andesitemenu = fillInventory(andesitemenu, item10, Material.ANDESITE);
        claymenu = fillInventory(claymenu, item11, Material.CLAY);
        cobbledeepmenu = fillInventory(cobbledeepmenu, item12, Material.COBBLED_DEEPSLATE);
        deepmenu = fillInventory(deepmenu, item13, Material.DEEPSLATE);
        terracottamenu = fillInventory(terracottamenu, item14, Material.TERRACOTTA);
        prismarinemenu = fillInventory(prismarinemenu, item15, Material.PRISMARINE);
        prismarinebrickmenu = fillInventory(prismarinebrickmenu, item16, Material.PRISMARINE_BRICKS);
        darkprismarinemenu = fillInventory(darkprismarinemenu, item17, Material.DARK_PRISMARINE);
        purpurmenu = fillInventory(purpurmenu, item18, Material.PURPUR_BLOCK);
        emeraldmenu = fillInventory(emeraldmenu, item19, Material.EMERALD_BLOCK);
        diamondmenu = fillInventory(diamondmenu, item20, Material.DIAMOND_BLOCK);
        goldmenu = fillInventory(goldmenu, item21, Material.GOLD_BLOCK);
        ironmenu = fillInventory(ironmenu, item22, Material.IRON_BLOCK);
        netherrackmenu = fillInventory(netherrackmenu, item23, Material.NETHERRACK);
        netherbrickmenu = fillInventory(netherbrickmenu, item24, Material.NETHER_BRICKS);
        rednetherbrickmenu = fillInventory(rednetherbrickmenu, item25, Material.RED_NETHER_BRICKS);
        blackstonemenu = fillInventory(blackstonemenu, item26, Material.BLACKSTONE);
        endstonemenu = fillInventory(endstonemenu, item27, Material.END_STONE);
        endstonebrickmenu = fillInventory(endstonebrickmenu, item28, Material.END_STONE_BRICKS);

    }

    private Inventory fillInventory(Inventory inv, ItemStack compress, Material mat){
        ItemStack item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemStack item2;
        item2 = createItem("§6Go Back", Material.YELLOW_STAINED_GLASS_PANE, Collections.singletonList("§4Click here to return to main menu"));
        ItemStack mat1 = new ItemStack(mat);
        int size = inv.getSize();

        for(int i = 0; i < size; i++){
            inv.setItem(i, item);
        }
        if(size == 27) {
            inv.setItem(1, mat1);
            inv.setItem(2, mat1);
            inv.setItem(3, mat1);
            inv.setItem(10, mat1);
            inv.setItem(11, mat1);
            inv.setItem(12, mat1);
            inv.setItem(16, compress);
            inv.setItem(18, item2);
            inv.setItem(19, mat1);
            inv.setItem(20, mat1);
            inv.setItem(21, mat1);
        }

        return inv;
    }


    private ItemStack createItem(String name, Material mat, List<String> lore){
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public Inventory getInventory() {
        return inv;
    }
}
