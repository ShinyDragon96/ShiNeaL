package net.mcreator.shinealsendndergrowth.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.shinealsendndergrowth.entity.EnderPhantomEntity;

public class EnderPhantomModel extends GeoModel<EnderPhantomEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnderPhantomEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "animations/enderphantom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnderPhantomEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "geo/enderphantom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnderPhantomEntity entity) {
		return new ResourceLocation("shineals_endergrowth", "textures/entities/" + entity.getTexture() + ".png");
	}

}
