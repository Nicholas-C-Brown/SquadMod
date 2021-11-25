package com.squad.squadmod;

import com.squad.squadmod.block.ModBlocks;
import com.squad.squadmod.registry.ModItems;
import com.squad.squadmod.worldgen.OreGeneration;
import net.fabricmc.api.ModInitializer;

public class SquadMod implements ModInitializer {

    public static final String MOD_ID = "squadmod";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        OreGeneration.registerOreGeneration();
    }
}
