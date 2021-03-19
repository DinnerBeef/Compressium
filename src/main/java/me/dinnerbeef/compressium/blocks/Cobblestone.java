package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Cobblestone extends Block {
    public Cobblestone() {
        super(Properties.create(Material.ROCK)
                      .sound(SoundType.STONE)
                      .hardnessAndResistance(2.0f, 6.0F)
                      .harvestTool(ToolType.PICKAXE)
                      .setRequiresTool());
    }
}