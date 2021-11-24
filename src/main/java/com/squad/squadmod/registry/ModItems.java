package com.squad.squadmod.registry;

import com.squad.squadmod.SquadMod;
import com.squad.squadmod.item.CustomPickaxeItem;
import com.squad.squadmod.item.CustomToolMaterials;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    private ModItems() {}

    public static final ToolItem ENHANCED_WOODEN_PICKAXE = new CustomPickaxeItem(CustomToolMaterials.ENHANCED_WOOD, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(SquadMod.MOD_ID, "enhanced_wooden_pickaxe"), ENHANCED_WOODEN_PICKAXE);
    }
    
}
