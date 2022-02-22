package net.mcreator.shinealsendupdate.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

import javax.annotation.Nullable;

import java.util.Collections;

@Mod.EventBusSubscriber
public class VoidialWaterMobplayerCollidesBlockProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static void execute(double x, double y, double z, Entity entity) {
		execute(null, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(x, (y + 0.2), z);
			if (_ent instanceof ServerPlayer _serverPlayer) {
				_serverPlayer.connection.teleport(x, (y + 0.2), z, _ent.getYRot(), _ent.getXRot(), Collections.emptySet());
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 200, 0, (false), (true)));
	}
}
