package net.mcreator.shinealsendupdate.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModItems;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class EnderiteSwordVoidProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		Entity entity = event.getEntityLiving();
		execute(event, entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level.dimension()) == (Level.END)) {
			if (world instanceof ServerLevel _origLevel) {
				LevelAccessor _worldorig = world;
				world = _origLevel.getServer().getLevel(Level.END);
				if (world != null) {
					{
						List<? extends Player> _players = new ArrayList<>(world.players());
						for (Entity entityiterator : _players) {
							if (entity.getY() < 0) {
								if ((entity instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)
										.getItem() == ShinealsEndUpdateModItems.ENDERITE_SWORD) {
									{
										Entity _ent = entity;
										_ent.teleportTo(x, (y + 1), z);
										if (_ent instanceof ServerPlayer _serverPlayer) {
											_serverPlayer.connection.teleport(x, (y + 1), z, _ent.getYRot(), _ent.getXRot(), Collections.emptySet());
										}
									}
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
												new ItemStack(ShinealsEndUpdateModItems.ENDERITE_SWORD));
										entityToSpawn.setPickUpDelay(10);
										entityToSpawn.setUnlimitedLifetime();
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					}
				}
				world = _worldorig;
			}
		}
	}
}
