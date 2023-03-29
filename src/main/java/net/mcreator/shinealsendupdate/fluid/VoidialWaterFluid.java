
package net.mcreator.shinealsendupdate.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModItems;
import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModFluids;
import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModFluidTypes;
import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModBlocks;

public abstract class VoidialWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ShinealsEndUpdateModFluidTypes.VOIDIAL_WATER_TYPE.get(), () -> ShinealsEndUpdateModFluids.VOIDIAL_WATER.get(),
			() -> ShinealsEndUpdateModFluids.FLOWING_VOIDIAL_WATER.get()).explosionResistance(100f).bucket(() -> ShinealsEndUpdateModItems.VOIDIAL_WATER_BUCKET.get()).block(() -> (LiquidBlock) ShinealsEndUpdateModBlocks.VOIDIAL_WATER.get());

	private VoidialWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends VoidialWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends VoidialWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
