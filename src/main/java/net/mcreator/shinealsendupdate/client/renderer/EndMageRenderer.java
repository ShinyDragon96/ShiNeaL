
package net.mcreator.shinealsendupdate.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.shinealsendupdate.entity.model.EndMageModel;
import net.mcreator.shinealsendupdate.entity.EndMageEntity;

public class EndMageRenderer extends GeoEntityRenderer<EndMageEntity> {
	public EndMageRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EndMageModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(EndMageEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public GeoEntityRenderer<EndMageEntity> withScale(float amount) {
		amount = 1f;
		return withScale(amount, amount);
	}
}
