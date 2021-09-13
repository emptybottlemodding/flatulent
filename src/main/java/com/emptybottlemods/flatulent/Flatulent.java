package com.emptybottlemods.flatulent;

import com.emptybottlemods.flatulent.registry.FItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;

import static com.emptybottlemods.flatulent.registry.FBlocks.blocks;
import static com.emptybottlemods.flatulent.registry.FItems.items;

public class Flatulent implements ModInitializer {
    public static void log(String message)
    {
        System.out.println("[Flatulent] " + message);
    }
    public static String MODID = "flatulent";
    @Override
    public void onInitialize() {
        blocks();
        items();
        FuelRegistry.INSTANCE.add(FItems.FART_BOTTLE, 2400);
    }
}
