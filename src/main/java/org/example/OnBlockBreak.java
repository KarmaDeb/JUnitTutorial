package org.example;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class OnBlockBreak implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Block block = e.getBlock();
        Material material = block.getType();

        if (material.equals(Material.BAMBOO_BLOCK)) {
            block.setType(Material.DIRT);
            e.setCancelled(true);
        }
    }
}
