
package net.mcreator.shinealsendupdate.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.shinealsendupdate.entity.model.ChorusSnailModel;
import net.mcreator.shinealsendupdate.entity.ChorusSnailEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ChorusSnailRenderer extends GeoEntityRenderer<ChorusSnailEntity> {
	public ChorusSnailRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ChorusSnailModel());
		this.shadowRadius = 1.25f;
	}

	@Override
	public RenderType getRenderType(ChorusSnailEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
