
package net.mcreator.shinealsendupdate.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.shinealsendupdate.entity.model.EndStriderModel;
import net.mcreator.shinealsendupdate.entity.EndStriderEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EndStriderRenderer extends GeoEntityRenderer<EndStriderEntity> {
	public EndStriderRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EndStriderModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(EndStriderEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(EndStriderEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
