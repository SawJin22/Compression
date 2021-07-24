package me.sawjin.compression.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class ItemManager extends JavaPlugin {
    public static ItemStack compressedcobble;
    public static ItemStack compresseddirt;
    public static ItemStack compressedpurpur;
    public static ItemStack compressedmossycobble;
    public static ItemStack compressedendstone;
    public static ItemStack compressedsandstone;
    public static ItemStack compressedgravel;
    public static ItemStack compressedgranite;
    public static ItemStack compresseddiorite;
    public static ItemStack compressedandesite;
    public static ItemStack compressedprismarine;
    public static ItemStack compresseddarkprismarine;
    public static ItemStack compressedprismarinebrick;
    public static ItemStack compressedclay;
    public static ItemStack compressedstone;
    public static ItemStack compressedsand;
    public static ItemStack compressedcobbledeepslate;
    public static ItemStack compresseddeepslate;
    public static ItemStack compressedterracota;
    public static ItemStack compressedemerald;
    public static ItemStack compresseddiamond;
    public static ItemStack compressedgold;
    public static ItemStack compressediron;
    public static ItemStack compressednetherrack;
    public static ItemStack compressednetherbrick;
    public static ItemStack compressedredbnetherbrick;
    public static ItemStack compressedblackstone;
    public static ItemStack compressedendstonebrick;



    public static void init(){
        createCompressedCobble();
        createCompressedDirt();
        createCompressedPurpur();
        createCompressedMossyCobble();
        createCompressedEndStone();
        createCompressedSandstone();
        createCompressedGravel();
        createCompressedGranite();
        createCompressedDiorite();
        createCompressedAndesite();
        createCompressedPrismarine();
        createCompressedDarkPrismarine();
        createCompressedPrismarineBrick();
        createCompressedClay();
        createCompressedStone();
        createCompressedSand();
        createCompressedCobbleDeepslate();
        createCompressedDeepslate();
        createCompressedTerracota();
        createCompressedEmerald();
        createCompressedDiamond();
        createCompressedGold();
        createCompressedIron();
        createCompressedNetherrack();
        createCompressedNetherBrick();
        createCompressedRedNetherBrick();
        createCompressedBlackstone();
        createCompressedEndStoneBrick();
    }

    private static void createCompressedEmerald() {
        ItemStack item = new ItemStack(Material.EMERALD_BLOCK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Emerald Block");
        List<String> lore = new ArrayList<>();
        lore.add("The emerald is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedemerald = item;


        //Shaped Recipe
        ShapedRecipe srcompressemerald = new ShapedRecipe(NamespacedKey.minecraft("compressedemerald"), item);
        srcompressemerald.shape("XXX",
                "XXX",
                "XXX");
        srcompressemerald.setIngredient('X', Material.EMERALD_BLOCK);

        Bukkit.getServer().addRecipe(srcompressemerald);
    }

    private static void createCompressedDiamond() {
        ItemStack item = new ItemStack(Material.DIAMOND_BLOCK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Diamond Block");
        List<String> lore = new ArrayList<>();
        lore.add("The diamond is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compresseddiamond = item;


        //Shaped Recipe
        ShapedRecipe srcompressdiamond = new ShapedRecipe(NamespacedKey.minecraft("compresseddiamond"), item);
        srcompressdiamond.shape("XXX",
                "XXX",
                "XXX");
        srcompressdiamond.setIngredient('X', Material.DIAMOND_BLOCK);

        Bukkit.getServer().addRecipe(srcompressdiamond);
    }

    private static void createCompressedGold() {
        ItemStack item = new ItemStack(Material.GOLD_BLOCK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Gold Block");
        List<String> lore = new ArrayList<>();
        lore.add("The gold is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedgold = item;


        //Shaped Recipe
        ShapedRecipe srcompressgold = new ShapedRecipe(NamespacedKey.minecraft("compressedgold"), item);
        srcompressgold.shape("XXX",
                "XXX",
                "XXX");
        srcompressgold.setIngredient('X', Material.GOLD_BLOCK);

        Bukkit.getServer().addRecipe(srcompressgold);
    }

    private static void createCompressedIron() {
        ItemStack item = new ItemStack(Material.IRON_BLOCK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Iron Block");
        List<String> lore = new ArrayList<>();
        lore.add("The iron is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressediron = item;


        //Shaped Recipe
        ShapedRecipe srcompressiron = new ShapedRecipe(NamespacedKey.minecraft("compressediron"), item);
        srcompressiron.shape("XXX",
                "XXX",
                "XXX");
        srcompressiron.setIngredient('X', Material.IRON_BLOCK);

        Bukkit.getServer().addRecipe(srcompressiron);
    }

    private static void createCompressedNetherrack() {
        ItemStack item = new ItemStack(Material.NETHERRACK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Netherrack");
        List<String> lore = new ArrayList<>();
        lore.add("The netherrack is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressednetherrack = item;


        //Shaped Recipe
        ShapedRecipe srcompressnetherrack = new ShapedRecipe(NamespacedKey.minecraft("compressnetherrack"), item);
        srcompressnetherrack.shape("XXX",
                "XXX",
                "XXX");
        srcompressnetherrack.setIngredient('X', Material.NETHERRACK);

        Bukkit.getServer().addRecipe(srcompressnetherrack);
    }

    private static void createCompressedNetherBrick() {
        ItemStack item = new ItemStack(Material.NETHER_BRICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Nether Bricks");
        List<String> lore = new ArrayList<>();
        lore.add("The nether brick is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressednetherbrick = item;


        //Shaped Recipe
        ShapedRecipe srcompressnetherbrick = new ShapedRecipe(NamespacedKey.minecraft("compressnethbrick"), item);
        srcompressnetherbrick.shape("XXX",
                "XXX",
                "XXX");
        srcompressnetherbrick.setIngredient('X', Material.NETHER_BRICKS);

        Bukkit.getServer().addRecipe(srcompressnetherbrick);
    }

    private static void createCompressedRedNetherBrick() {
        ItemStack item = new ItemStack(Material.RED_NETHER_BRICKS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Red Nether Bricks");
        List<String> lore = new ArrayList<>();
        lore.add("The red nether brick is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedredbnetherbrick = item;


        //Shaped Recipe
        ShapedRecipe srcompressrednetherbrick = new ShapedRecipe(NamespacedKey.minecraft("compressrednetherbrick"), item);
        srcompressrednetherbrick.shape("XXX",
                "XXX",
                "XXX");
        srcompressrednetherbrick.setIngredient('X', Material.RED_NETHER_BRICKS);

        Bukkit.getServer().addRecipe(srcompressrednetherbrick);
    }

    private static void createCompressedBlackstone() {
        ItemStack item = new ItemStack(Material.BLACKSTONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Blackstone");
        List<String> lore = new ArrayList<>();
        lore.add("The blackstone is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedblackstone = item;


        //Shaped Recipe
        ShapedRecipe srcompressblackstone = new ShapedRecipe(NamespacedKey.minecraft("compressblackstone"), item);
        srcompressblackstone.shape("XXX",
                "XXX",
                "XXX");
        srcompressblackstone.setIngredient('X', Material.BLACKSTONE);

        Bukkit.getServer().addRecipe(srcompressblackstone);
    }

    private static void createCompressedCobble() {
        ItemStack item = new ItemStack(Material.COBBLESTONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Cobblestone");
        List<String> lore = new ArrayList<>();
        lore.add("The cobblestone is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedcobble = item;


        //Shaped Recipe
        ShapedRecipe srcompresscobble = new ShapedRecipe(NamespacedKey.minecraft("compressedcobblestone"), item);
        srcompresscobble.shape("XXX",
                 "XXX",
                 "XXX");
        srcompresscobble.setIngredient('X', Material.COBBLESTONE);

        Bukkit.getServer().addRecipe(srcompresscobble);
    }

    private static void createCompressedClay() {
        ItemStack item = new ItemStack(Material.CLAY, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Clay");
        List<String> lore = new ArrayList<>();
        lore.add("The clay is pretty dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedclay = item;

        //Shaped Recipe
        ShapedRecipe srcompressclay = new ShapedRecipe(NamespacedKey.minecraft("compressedclay"), item);
        srcompressclay.shape("XXX",
                "XXX",
                "XXX");

        srcompressclay.setIngredient('X', Material.CLAY);

        Bukkit.getServer().addRecipe(srcompressclay);
    }

    private static void createCompressedSandstone() {
        ItemStack item = new ItemStack(Material.SANDSTONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Sandstone");
        List<String> lore = new ArrayList<>();
        lore.add("The sandstone is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedsandstone = item;

        //Shaped Recipe
        ShapedRecipe srcompresscsandstone = new ShapedRecipe(NamespacedKey.minecraft("compressedsandstone"), item);
        srcompresscsandstone.shape("XXX",
                "XXX",
                "XXX");
        srcompresscsandstone.setIngredient('X', Material.SANDSTONE);

        Bukkit.getServer().addRecipe(srcompresscsandstone);
    }

    private static void createCompressedStone() {
        ItemStack item = new ItemStack(Material.STONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Stone");
        List<String> lore = new ArrayList<>();
        lore.add("The stone is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedstone = item;

        //Shaped Recipe
        ShapedRecipe srcompressstone = new ShapedRecipe(NamespacedKey.minecraft("compressedstone"), item);
        srcompressstone.shape("XXX",
                "XXX",
                "XXX");
        srcompressstone.setIngredient('X', Material.STONE);

        Bukkit.getServer().addRecipe(srcompressstone);
    }

    private static void createCompressedSand() {
        ItemStack item = new ItemStack(Material.SAND, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Sand");
        List<String> lore = new ArrayList<>();
        lore.add("The sand is slightly dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedsand = item;

        //Shaped Recipe
        ShapedRecipe srcompresssand = new ShapedRecipe(NamespacedKey.minecraft("compressedsand"), item);
        srcompresssand.shape("XXX",
                "XXX",
                "XXX");
        srcompresssand.setIngredient('X', Material.SAND);

        Bukkit.getServer().addRecipe(srcompresssand);
    }

    private static void createCompressedCobbleDeepslate() {
        ItemStack item = new ItemStack(Material.COBBLED_DEEPSLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Cobbled Deepslate");
        List<String> lore = new ArrayList<>();
        lore.add("The cobbled deepslate is EXTREMELY dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedcobbledeepslate = item;

        //Shaped Recipe
        ShapedRecipe srcompresscobbledeepslate = new ShapedRecipe(NamespacedKey.minecraft("compressedcobbledeepslate"), item);
        srcompresscobbledeepslate.shape("XXX",
                "XXX",
                "XXX");
        srcompresscobbledeepslate.setIngredient('X', Material.COBBLED_DEEPSLATE);

        Bukkit.getServer().addRecipe(srcompresscobbledeepslate);
    }

    private static void createCompressedDirt() {
        ItemStack item = new ItemStack(Material.DIRT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Dirt");
        List<String> lore = new ArrayList<>();
        lore.add("The dirt is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compresseddirt = item;

        //Shaped Recipe
        ShapedRecipe srcompressdirt = new ShapedRecipe(NamespacedKey.minecraft("compresseddirt"), item);
        srcompressdirt.shape("XXX",
                             "XXX",
                             "XXX");
        srcompressdirt.setIngredient('X', Material.DIRT);

        Bukkit.getServer().addRecipe(srcompressdirt);
    }

    private static void createCompressedPurpur() {
        ItemStack item = new ItemStack(Material.PURPUR_BLOCK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Purpur Block");
        List<String> lore = new ArrayList<>();
        lore.add("The purpur is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedpurpur = item;

        //Shaped Recipe
        ShapedRecipe srcompresspurpur = new ShapedRecipe(NamespacedKey.minecraft("compressedpurpur"), item);
        srcompresspurpur.shape("XXX",
                "XXX",
                "XXX");
        srcompresspurpur.setIngredient('X', Material.PURPUR_BLOCK);

        Bukkit.getServer().addRecipe(srcompresspurpur);
    }

    private static void createCompressedMossyCobble() {
        ItemStack item = new ItemStack(Material.MOSSY_COBBLESTONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Mossy Cobblestone");
        List<String> lore = new ArrayList<>();
        lore.add("The mossy cobble is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedmossycobble = item;

        //Shaped Recipe
        ShapedRecipe srcompressmossycobble = new ShapedRecipe(NamespacedKey.minecraft("compressedmosycobble"), item);
        srcompressmossycobble.shape("XXX",
                "XXX",
                "XXX");
        srcompressmossycobble.setIngredient('X', Material.MOSSY_COBBLESTONE);

        Bukkit.getServer().addRecipe(srcompressmossycobble);
    }

    private static void createCompressedEndStone() {
        ItemStack item = new ItemStack(Material.END_STONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed End Stone");
        List<String> lore = new ArrayList<>();
        lore.add("The end stone is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedendstone = item;

        //Shaped Recipe
        ShapedRecipe srcompressendstone = new ShapedRecipe(NamespacedKey.minecraft("compressedendstone"), item);
        srcompressendstone.shape("XXX",
                "XXX",
                "XXX");
        srcompressendstone.setIngredient('X', Material.END_STONE);

        Bukkit.getServer().addRecipe(srcompressendstone);
    }

    private static void createCompressedDeepslate() {
        ItemStack item = new ItemStack(Material.DEEPSLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Deepslate");
        List<String> lore = new ArrayList<>();
        lore.add("The deepslate is EXTREMELY dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compresseddeepslate = item;

        //Shaped Recipe
        ShapedRecipe srcompressdeepslate = new ShapedRecipe(NamespacedKey.minecraft("compresseddeepslate"), item);
        srcompressdeepslate.shape("XXX",
                "XXX",
                "XXX");
        srcompressdeepslate.setIngredient('X', Material.DEEPSLATE);

        Bukkit.getServer().addRecipe(srcompressdeepslate);
    }

    private static void createCompressedGravel() {
        ItemStack item = new ItemStack(Material.GRAVEL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Gravel");
        List<String> lore = new ArrayList<>();
        lore.add("The gravel is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedgravel = item;

        //Shaped Recipe
        ShapedRecipe srcompressgravel = new ShapedRecipe(NamespacedKey.minecraft("compressedgravel"), item);
        srcompressgravel.shape("XXX",
                "XXX",
                "XXX");
        srcompressgravel.setIngredient('X', Material.GRAVEL);

        Bukkit.getServer().addRecipe(srcompressgravel);
    }

    private static void createCompressedGranite() {
        ItemStack item = new ItemStack(Material.GRANITE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Granite");
        List<String> lore = new ArrayList<>();
        lore.add("The granite is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedgranite = item;

        //Shaped Recipe
        ShapedRecipe srcompressgranite = new ShapedRecipe(NamespacedKey.minecraft("compressedgranite"), item);
        srcompressgranite.shape("XXX",
                "XXX",
                "XXX");
        srcompressgranite.setIngredient('X', Material.GRANITE);

        Bukkit.getServer().addRecipe(srcompressgranite);
    }

    private static void createCompressedDiorite() {
        ItemStack item = new ItemStack(Material.DIORITE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Diorite");
        List<String> lore = new ArrayList<>();
        lore.add("The diorite is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compresseddiorite = item;

        //Shaped Recipe
        ShapedRecipe srcompressdiorite = new ShapedRecipe(NamespacedKey.minecraft("compresseddiorite"), item);
        srcompressdiorite.shape("XXX",
                "XXX",
                "XXX");
        srcompressdiorite.setIngredient('X', Material.DIORITE);

        Bukkit.getServer().addRecipe(srcompressdiorite);
    }

    private static void createCompressedAndesite() {
        ItemStack item = new ItemStack(Material.ANDESITE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Andesite");
        List<String> lore = new ArrayList<>();
        lore.add("The andesite is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedandesite = item;

        //Shaped Recipe
        ShapedRecipe srcompressandesite = new ShapedRecipe(NamespacedKey.minecraft("compressedandesite"), item);
        srcompressandesite.shape("XXX",
                "XXX",
                "XXX");
        srcompressandesite.setIngredient('X', Material.ANDESITE);

        Bukkit.getServer().addRecipe(srcompressandesite);
    }

    private static void createCompressedPrismarine() {
        ItemStack item = new ItemStack(Material.PRISMARINE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Prismarine");
        List<String> lore = new ArrayList<>();
        lore.add("The prismarine is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedprismarine = item;

        //Shaped Recipe
        ShapedRecipe srcompressprismarine = new ShapedRecipe(NamespacedKey.minecraft("compressedprismarine"), item);
        srcompressprismarine.shape("XXX",
                "XXX",
                "XXX");
        srcompressprismarine.setIngredient('X', Material.PRISMARINE);

        Bukkit.getServer().addRecipe(srcompressprismarine);
    }

    private static void createCompressedDarkPrismarine() {
        ItemStack item = new ItemStack(Material.DARK_PRISMARINE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Dark Prismarine");
        List<String> lore = new ArrayList<>();
        lore.add("The dark prismarine is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compresseddarkprismarine = item;

        //Shaped Recipe
        ShapedRecipe srcompressdarkprismarine = new ShapedRecipe(NamespacedKey.minecraft("compresseddarkprismarine"), item);
        srcompressdarkprismarine.shape("XXX",
                "XXX",
                "XXX");
        srcompressdarkprismarine.setIngredient('X', Material.DARK_PRISMARINE);

        Bukkit.getServer().addRecipe(srcompressdarkprismarine);
    }

    private static void createCompressedPrismarineBrick() {
        ItemStack item = new ItemStack(Material.PRISMARINE_BRICKS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Prismarine Brick");
        List<String> lore = new ArrayList<>();
        lore.add("The prismarine brick is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedprismarinebrick = item;

        //Shaped Recipe
        ShapedRecipe srcompressprismarinebrick = new ShapedRecipe(NamespacedKey.minecraft("compressedprismarinebrick"), item);
        srcompressprismarinebrick.shape("XXX",
                "XXX",
                "XXX");
        srcompressprismarinebrick.setIngredient('X', Material.PRISMARINE_BRICKS);

        Bukkit.getServer().addRecipe(srcompressprismarinebrick);
    }

    private static void createCompressedTerracota() {
        ItemStack item = new ItemStack(Material.TERRACOTTA, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed Terracotta");
        List<String> lore = new ArrayList<>();
        lore.add("The terracota is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedterracota = item;

        //Shaped Recipe
        ShapedRecipe srcompressterracota = new ShapedRecipe(NamespacedKey.minecraft("compressedterracota"), item);
        srcompressterracota.shape("XXX",
                "XXX",
                "XXX");
        srcompressterracota.setIngredient('X', Material.TERRACOTTA);

        Bukkit.getServer().addRecipe(srcompressterracota);
    }

    private static void createCompressedEndStoneBrick() {
        ItemStack item = new ItemStack(Material.END_STONE_BRICKS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Compressed End Stone Bricks");
        List<String> lore = new ArrayList<>();
        lore.add("The end stone brick is very dense");
        meta.setLore(lore);
        item.setItemMeta(meta);
        compressedendstonebrick = item;

        //Shaped Recipe
        ShapedRecipe srcompressendstonebrick = new ShapedRecipe(NamespacedKey.minecraft("compressedendstonebrick"), item);
        srcompressendstonebrick.shape("XXX",
                "XXX",
                "XXX");
        srcompressendstonebrick.setIngredient('X', Material.END_STONE_BRICKS);

        Bukkit.getServer().addRecipe(srcompressendstonebrick);
    }

}
