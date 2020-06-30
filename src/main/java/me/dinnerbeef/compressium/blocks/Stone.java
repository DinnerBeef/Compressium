package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Stone extends Block
{
	public Stone()
	{
		super(Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.5f,6.0f));
	}
}