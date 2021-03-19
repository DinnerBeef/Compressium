package me.dinnerbeef.compressium.blocks;

import me.dinnerbeef.compressium.Compressium;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.INBT;
import net.minecraft.network.play.server.SChatPacket;
import net.minecraft.potion.HealthBoostEffect;
import net.minecraft.tileentity.MobSpawnerTileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.GameType;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.server.permission.context.IContext;
import org.apache.commons.codec.language.bm.Lang;
import org.lwjgl.system.CallbackI;

import javax.xml.soap.Text;
import java.awt.*;

public class Emerald extends Block {
	public Emerald() {
		super(Properties.create(Material.IRON, MaterialColor.EMERALD)
					  .sound(SoundType.METAL)
					  .hardnessAndResistance(5.0f, 6.0f)
					  .harvestTool(ToolType.PICKAXE)
					  .setRequiresTool());
	}
}


