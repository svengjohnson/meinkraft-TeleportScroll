package io.sjohnson.teleportscroll.helpers;

import io.sjohnson.teleportscroll.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class CreateRecipe {

    Server server;
    Main plugin;

    public static String BLANK_TELEPORT_SCROLL = "blank_teleport_scroll";
    public static String BLANK_TELEPORT_SCROLL_T2 = "blank_teleport_scroll_t2";
    public static String BLANK_TELEPORT_SCROLL_T3 = "blank_teleport_scroll_t3";
    public static String BED_TELEPORT_SCROLL = "bed_teleport_scroll";
    public static String BED_TELEPORT_SCROLL_T2 = "bed_teleport_scroll_t2";
    public static String BED_TELEPORT_SCROLL_T3 = "bed_teleport_scroll_t3";
    public static String LIFESAVER = "lifesaver";
    public static String EMPTY_TELEPORT_BOOK = "empty_teleport_book";


    public CreateRecipe(Server server, Main plugin) {
        this.server = server;
        this.plugin = plugin;
    }

    public void registerAll()
    {
        this.server.addRecipe(this.teleportScroll());
        this.server.addRecipe(this.enhancedTeleportScroll());
        this.server.addRecipe(this.eternalTeleportScroll());
        this.server.addRecipe(this.bedScroll());
        this.server.addRecipe(this.bedScrollT2());
        this.server.addRecipe(this.bedScrollT3());
        this.server.addRecipe(this.lifesaver());
        this.server.addRecipe(this.teleportBook());
    }

    public static void discoverAll(Plugin plugin, Player player)
    {
        player.discoverRecipe(new NamespacedKey(plugin, BLANK_TELEPORT_SCROLL));
        player.discoverRecipe(new NamespacedKey(plugin, BLANK_TELEPORT_SCROLL_T2));
        player.discoverRecipe(new NamespacedKey(plugin, BLANK_TELEPORT_SCROLL_T3));
        player.discoverRecipe(new NamespacedKey(plugin, BED_TELEPORT_SCROLL));
        player.discoverRecipe(new NamespacedKey(plugin, BED_TELEPORT_SCROLL_T2));
        player.discoverRecipe(new NamespacedKey(plugin, BED_TELEPORT_SCROLL_T3));
        player.discoverRecipe(new NamespacedKey(plugin, EMPTY_TELEPORT_BOOK));
    }

    public ShapedRecipe teleportScroll() {
        NamespacedKey key = new NamespacedKey(plugin, BLANK_TELEPORT_SCROLL);

        ItemStack teleportScroll = CreateItem.createTeleportScroll(1);
        teleportScroll.setAmount(8);

        ShapedRecipe Recipe = new ShapedRecipe(key, teleportScroll);
        Recipe.shape(
                "PPP",
                "PEP",
                "PPP"
        );

        Recipe.setIngredient('P', new RecipeChoice.ExactChoice(new ItemStack(Material.PAPER)));
        Recipe.setIngredient('E', new RecipeChoice.ExactChoice(new ItemStack(Material.ENDER_PEARL)));
        return Recipe;
    }

    public ShapedRecipe enhancedTeleportScroll() {
        NamespacedKey key = new NamespacedKey(plugin, BLANK_TELEPORT_SCROLL_T2);

        ItemStack enhancedTeleportScroll = CreateItem.createTeleportScroll(2);
        enhancedTeleportScroll.setAmount(8);

        ShapedRecipe Recipe = new ShapedRecipe(key, enhancedTeleportScroll);
        Recipe.shape(
                "PPP",
                "PEP",
                "PGP"
        );

        Recipe.setIngredient('G', new RecipeChoice.ExactChoice(new ItemStack(Material.GOLD_INGOT)));
        Recipe.setIngredient('P', new RecipeChoice.ExactChoice(new ItemStack(Material.PAPER)));
        Recipe.setIngredient('E', new RecipeChoice.ExactChoice(new ItemStack(Material.ENDER_EYE)));
        return Recipe;
    }

    public ShapedRecipe eternalTeleportScroll() {
        NamespacedKey key = new NamespacedKey(plugin, BLANK_TELEPORT_SCROLL_T3);
        ItemStack eternalTeleportScroll = CreateItem.createTeleportScroll(3);

        ShapedRecipe Recipe = new ShapedRecipe(key, eternalTeleportScroll);
        Recipe.shape(
                "FDF",
                "EPE",
                "EEE"
        );

        Recipe.setIngredient('P', new RecipeChoice.ExactChoice(new ItemStack(Material.PAPER)));
        Recipe.setIngredient('E', new RecipeChoice.ExactChoice(new ItemStack(Material.ENDER_EYE)));
        Recipe.setIngredient('D', new RecipeChoice.ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)));
        Recipe.setIngredient('F', new RecipeChoice.ExactChoice(new ItemStack(Material.CHORUS_FRUIT)));
        return Recipe;
    }

    public ShapedRecipe bedScroll() {
        NamespacedKey key = new NamespacedKey(plugin, BED_TELEPORT_SCROLL);

        ItemStack teleportScroll = CreateItem.createBedTeleportScroll(1);
        teleportScroll.setAmount(8);

        ShapedRecipe Recipe = new ShapedRecipe(key, teleportScroll);
        Recipe.shape(
                "PPP",
                "PCP",
                "PPP"
        );

        Recipe.setIngredient('P', new RecipeChoice.ExactChoice(new ItemStack(Material.PAPER)));
        Recipe.setIngredient('C', new RecipeChoice.ExactChoice(new ItemStack(Material.COMPASS)));
        return Recipe;
    }

    public ShapedRecipe bedScrollT2() {
        NamespacedKey key = new NamespacedKey(plugin, BED_TELEPORT_SCROLL_T2);

        ItemStack teleportScroll = CreateItem.createBedTeleportScroll(2);
        teleportScroll.setAmount(8);

        ShapedRecipe Recipe = new ShapedRecipe(key, teleportScroll);
        Recipe.shape(
                "PEP",
                "PCP",
                "PGP"
        );

        Recipe.setIngredient('P', new RecipeChoice.ExactChoice(new ItemStack(Material.PAPER)));
        Recipe.setIngredient('C', new RecipeChoice.ExactChoice(new ItemStack(Material.COMPASS)));
        Recipe.setIngredient('E', new RecipeChoice.ExactChoice(new ItemStack(Material.ENDER_EYE)));
        Recipe.setIngredient('G', new RecipeChoice.ExactChoice(new ItemStack(Material.GOLD_INGOT)));
        return Recipe;
    }

    public ShapedRecipe bedScrollT3() {
        NamespacedKey key = new NamespacedKey(plugin, BED_TELEPORT_SCROLL_T3);

        ItemStack teleportScroll = CreateItem.createBedTeleportScroll(3);
        teleportScroll.setAmount(1);

        ShapedRecipe Recipe = new ShapedRecipe(key, teleportScroll);
        Recipe.shape(
                "PEP",
                "PCP",
                "FDF"
        );

        Recipe.setIngredient('P', new RecipeChoice.ExactChoice(new ItemStack(Material.PAPER)));
        Recipe.setIngredient('C', new RecipeChoice.ExactChoice(new ItemStack(Material.COMPASS)));
        Recipe.setIngredient('E', new RecipeChoice.ExactChoice(new ItemStack(Material.ENDER_EYE)));
        Recipe.setIngredient('D', new RecipeChoice.ExactChoice(new ItemStack(Material.DIAMOND_BLOCK)));
        Recipe.setIngredient('F', new RecipeChoice.ExactChoice(new ItemStack(Material.CHORUS_FRUIT)));
        return Recipe;
    }

    public ShapedRecipe lifesaver() {
        NamespacedKey key = new NamespacedKey(plugin, LIFESAVER);

        ItemStack lifesaver = CreateItem.createLifesaver();

        ShapedRecipe Recipe = new ShapedRecipe(key, lifesaver);
        Recipe.shape(
                "DCD",
                "EGE",
                "DCD"
        );

        Recipe.setIngredient('D', new RecipeChoice.ExactChoice(new ItemStack(Material.DIAMOND)));
        Recipe.setIngredient('G', new RecipeChoice.ExactChoice(new ItemStack(Material.EMERALD)));
        Recipe.setIngredient('C', new RecipeChoice.ExactChoice(new ItemStack(Material.CHORUS_FRUIT)));
        Recipe.setIngredient('E', new RecipeChoice.ExactChoice(new ItemStack(Material.ENDER_EYE)));
        return Recipe;
    }

    public ShapedRecipe teleportBook() {
        NamespacedKey key = new NamespacedKey(plugin, EMPTY_TELEPORT_BOOK);

        ItemStack teleportBook = CreateItem.createEmptyTeleportBook(false);

        ShapedRecipe Recipe = new ShapedRecipe(key, teleportBook);
        Recipe.shape(
                "CEC",
                "DBD",
                "CEC"
        );

        Recipe.setIngredient('D', new RecipeChoice.ExactChoice(new ItemStack(Material.DIAMOND)));
        Recipe.setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.BOOK)));
        Recipe.setIngredient('C', new RecipeChoice.ExactChoice(new ItemStack(Material.CHORUS_FRUIT)));
        Recipe.setIngredient('E', new RecipeChoice.ExactChoice(new ItemStack(Material.ENDER_EYE)));
        return Recipe;
    }
}
