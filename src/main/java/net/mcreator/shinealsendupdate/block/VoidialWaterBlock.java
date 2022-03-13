
package net.mcreator.shinealsendupdate.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.shinealsendupdate.procedures.VoidialWaterMobplayerCollidesBlockProcedure;
import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModFluids;

public class VoidialWaterBlock extends LiquidBlock {
	public VoidialWaterBlock() {
		super(() -> (FlowingFluid) ShinealsEndUpdateModFluids.VOIDIAL_WATER.get(),
				BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_PURPLE).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		VoidialWaterMobplayerCollidesBlockProcedure.execute(pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}
