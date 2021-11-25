package com.squad.squadmod.registry;

import com.squad.squadmod.SquadMod;
import com.squad.squadmod.block.ModBlocks;
import com.squad.squadmod.item.CustomPickaxeItem;
import com.squad.squadmod.item.CustomToolMaterials;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ModItems {

    private ModItems() {}

    //Platinum
    public static final Item RAW_PLATINUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item PLATINUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final ToolItem PLATINUM_PICKAXE = new CustomPickaxeItem(CustomToolMaterials.PLATINUM, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));


    public static final ToolItem ENHANCED_WOODEN_PICKAXE = new CustomPickaxeItem(CustomToolMaterials.ENHANCED_WOOD, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));


    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(SquadMod.MOD_ID, "enhanced_wooden_pickaxe"), ENHANCED_WOODEN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(SquadMod.MOD_ID, "platinum_ore"), new BlockItem(ModBlocks.PLATINUM_ORE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(SquadMod.MOD_ID, "raw_platinum"), RAW_PLATINUM);
        Registry.register(Registry.ITEM, new Identifier(SquadMod.MOD_ID, "platinum_ingot"), PLATINUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SquadMod.MOD_ID, "platinum_pickaxe"), PLATINUM_PICKAXE);

    }
    
}
