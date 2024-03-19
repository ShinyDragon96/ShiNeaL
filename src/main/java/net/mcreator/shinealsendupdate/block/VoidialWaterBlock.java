
package net.mcreator.shinealsendndergrowth.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.shinealsendndergrowth.procedures.VoidialWaterMobplayerCollidesBlockProcedure;
import net.mcreator.shinealsendndergrowth.init.ShinealsEndergrowthModFluids;

public class VoidialWaterBlock extends LiquidBlock {
	public VoidialWaterBlock() {
		super(() -> ShinealsEndergrowthModFluids.VOIDIAL_WATER.get(), BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_PURPLE).strength(100f).noCollission().noLootTable());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		VoidialWaterMobplayerCollidesBlockProcedure.execute(entity);
	}
}
