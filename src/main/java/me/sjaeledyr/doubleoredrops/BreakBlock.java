package me.sjaeledyr.doubleoredrops;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import java.util.Random;

public class BreakBlock implements Listener {
    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {
        Block blockBroken = event.getBlock();
        int dropRate = 1;
        // Check if the Pickaxe has the Fortune Enchantment
        if ((event.getPlayer().getInventory().getItemInMainHand().getType() == Material.IRON_PICKAXE)
            || (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.GOLDEN_PICKAXE)
            || (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.DIAMOND_PICKAXE)
            || (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.STONE_PICKAXE)
            || (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.WOODEN_PICKAXE)
            || (event.getPlayer().getInventory().getItemInMainHand().getType() == Material.NETHERITE_PICKAXE))
        {
            int enchantLevel = (event.getPlayer().getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS));
            // Check Enchant Level + Return New Drop Rate
            if (enchantLevel >= 0) {
                dropRate = new Random().nextInt(enchantLevel+2);
                if (dropRate == 0) {
                    dropRate = 1;
                }
        }
            else {
                dropRate = 1;
            }
        }
        // Diamond Block Break Event
        if (blockBroken.getType() == Material.DIAMOND_ORE) {
            event.setCancelled(true);
            blockBroken.setType(Material.AIR);
            ItemStack diamonds = new ItemStack(Material.DIAMOND, 2 * dropRate);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), diamonds);
        }
        // Iron Block Break Event
        if (blockBroken.getType() == Material.IRON_ORE) {
            event.setCancelled(true);
            blockBroken.setType(Material.AIR);
            ItemStack iron = new ItemStack(Material.IRON_INGOT, 3 * dropRate);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), iron);
        }
        // Gold Block Break Event
        if (blockBroken.getType() == Material.GOLD_ORE) {
            event.setCancelled(true);
            blockBroken.setType(Material.AIR);
            ItemStack gold = new ItemStack(Material.GOLD_INGOT, 3 * dropRate);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), gold);
        }
        // Lapis Block Break Event
        if (blockBroken.getType() == Material.LAPIS_ORE) {
            event.setCancelled(true);
            blockBroken.setType(Material.AIR);
            ItemStack lapis = new ItemStack(Material.LAPIS_LAZULI, 4 * dropRate);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), lapis);
        }
        // Redstone Block Break Event
        if (blockBroken.getType() == Material.REDSTONE_ORE) {
            event.setCancelled(true);
            blockBroken.setType(Material.AIR);
            ItemStack redstone = new ItemStack(Material.REDSTONE, 4 * dropRate);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), redstone);
        }
        // Emerald Block Break Event
        if (blockBroken.getType() == Material.EMERALD_ORE) {
            event.setCancelled(true);
            blockBroken.setType(Material.AIR);
            ItemStack emerald = new ItemStack(Material.EMERALD, 4 * dropRate);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), emerald);
        }
        // Coal Block Break Event
        if (blockBroken.getType() == Material.COAL_ORE) {
            event.setCancelled(true);
            blockBroken.setType(Material.AIR);
            ItemStack coal = new ItemStack(Material.COAL, 5 * dropRate);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), coal);
        }

    }

}

