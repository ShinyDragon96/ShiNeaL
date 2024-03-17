package net.mcreator.shinealsendndergrowth.mixins;

import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;

@Mixin(BiomeSource.class)
public abstract class BiomeSourceMixin {
	@Redirect(method = "possibleBiomes", at = @At(value = "INVOKE", target = "Ljava/util/function/Supplier;get()Ljava/lang/Object;"))
	private Object getBiomes(Supplier<Set<Holder<Biome>>> instance) {
		return modifyBiomeSet(instance.get());
	}

	protected Set<Holder<Biome>> modifyBiomeSet(Set<Holder<Biome>> biomes) {
		return biomes;
	}
}
