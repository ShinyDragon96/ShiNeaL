package net.mcreator.shinealsendupdate.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.shinealsendupdate.entity.EnderPhantomEntity;

public class EnderPhantomModel extends AnimatedGeoModel<EnderPhantomEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnderPhantomEntity entity) {
		return new ResourceLocation("shineals_end_update", "animations/enderphantom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnderPhantomEntity entity) {
		return new ResourceLocation("shineals_end_update", "geo/enderphantom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnderPhantomEntity entity) {
		return new ResourceLocation("shineals_end_update", "textures/entities/" + entity.getTexture() + ".png");
	}

}
