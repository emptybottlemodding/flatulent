package com.emptybottlemods.flatulent.registry;

import com.emptybottlemods.flatulent.Flatulent;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.emptybottlemods.flatulent.Flatulent.log;

public class FItems
{
    public static Item SILAGE = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
    public static Item FART_BOTTLE = new BoneMealItem(new FabricItemSettings().group(ItemGroup.FOOD));

    public static void items()
    {
        log("Loading Items!");

        item("silage", SILAGE);
        item("fart_in_a_bottle", FART_BOTTLE);
    }
    public static void item(String id, Item item)
    {
        Registry.register(Registry.ITEM, new Identifier(Flatulent.MODID, id), item);
    }
}
