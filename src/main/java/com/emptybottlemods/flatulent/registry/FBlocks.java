package com.emptybottlemods.flatulent.registry;

import com.emptybottlemods.flatulent.Flatulent;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.emptybottlemods.flatulent.Flatulent.log;

public class FBlocks
{
    public static Block SILAGE_BLOCK = new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC).sounds(BlockSoundGroup.GRASS));

    public static void blocks()
    {
        log("Loading Blocks!");
        block("silage_block", SILAGE_BLOCK, true, ItemGroup.FOOD);
    }
    public static void block(String id, Block block, Boolean blockItem, ItemGroup tab)
    {
        Registry.register(Registry.BLOCK, new Identifier(Flatulent.MODID, id), block);
        if (blockItem) {
            Registry.register(Registry.ITEM, new Identifier(Flatulent.MODID, id), new BlockItem(block, new FabricItemSettings().group(tab)));
        }
    }
}
