
package net.mcreator.shinealsendupdate.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.shinealsendupdate.entity.model.ChorusBeeModel;
import net.mcreator.shinealsendupdate.entity.ChorusBeeEntity;

public class ChorusBeeRenderer extends GeoEntityRenderer<ChorusBeeEntity> {
	public ChorusBeeRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ChorusBeeModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(ChorusBeeEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public GeoEntityRenderer<ChorusBeeEntity> withScale(float amount) {
		amount = 1f;
		return withScale(amount, amount);
	}
}
