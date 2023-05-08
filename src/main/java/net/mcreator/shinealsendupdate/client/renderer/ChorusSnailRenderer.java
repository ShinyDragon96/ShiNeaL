
package net.mcreator.shinealsendupdate.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.shinealsendupdate.entity.model.ChorusSnailModel;
import net.mcreator.shinealsendupdate.entity.ChorusSnailEntity;

public class ChorusSnailRenderer extends GeoEntityRenderer<ChorusSnailEntity> {
	public ChorusSnailRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ChorusSnailModel());
		this.shadowRadius = 1.25f;
	}

	@Override
	public RenderType getRenderType(ChorusSnailEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public GeoEntityRenderer<ChorusSnailEntity> withScale(float amount) {
		amount = 1f;
		return withScale(amount, amount);
	}
}
