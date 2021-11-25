package com.squad.squadmod.block;

import com.squad.squadmod.SquadMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks extends Blocks {
    public static final Block PLATINUM_ORE = new OreBlock(FabricBlockSettings.of(Material.STONE)
            .requiresTool()
            .strength(3.0f, 3.0f)
            .sounds(BlockSoundGroup.STONE));


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(SquadMod.MOD_ID, "platinum_ore"), PLATINUM_ORE);

    }

}

