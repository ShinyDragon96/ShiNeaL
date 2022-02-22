
package net.mcreator.shinealsendupdate.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModItems;
import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModFluids;
import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModBlocks;

public abstract class VoidialWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ShinealsEndUpdateModFluids.VOIDIAL_WATER,
			() -> ShinealsEndUpdateModFluids.FLOWING_VOIDIAL_WATER,
			FluidAttributes.builder(new ResourceLocation("shineals_end_update:blocks/voidial_water_still"),
					new ResourceLocation("shineals_end_update:blocks/voidial_water_flow"))

	).explosionResistance(100f)

			.bucket(() -> ShinealsEndUpdateModItems.VOIDIAL_WATER_BUCKET).block(() -> (LiquidBlock) ShinealsEndUpdateModBlocks.VOIDIAL_WATER);

	private VoidialWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends VoidialWaterFluid {
		public Source() {
			super();
			setRegistryName("voidial_water");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends VoidialWaterFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_voidial_water");
		}

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
