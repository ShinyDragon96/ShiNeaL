
package net.mcreator.shinealsendndergrowth.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.shinealsendndergrowth.init.ShinealsEndergrowthModItems;
import net.mcreator.shinealsendndergrowth.init.ShinealsEndergrowthModFluids;
import net.mcreator.shinealsendndergrowth.init.ShinealsEndergrowthModFluidTypes;
import net.mcreator.shinealsendndergrowth.init.ShinealsEndergrowthModBlocks;

public abstract class VoidialWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ShinealsEndergrowthModFluidTypes.VOIDIAL_WATER_TYPE.get(), () -> ShinealsEndergrowthModFluids.VOIDIAL_WATER.get(),
			() -> ShinealsEndergrowthModFluids.FLOWING_VOIDIAL_WATER.get()).explosionResistance(100f).bucket(() -> ShinealsEndergrowthModItems.VOIDIAL_WATER_BUCKET.get()).block(() -> (LiquidBlock) ShinealsEndergrowthModBlocks.VOIDIAL_WATER.get());

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
