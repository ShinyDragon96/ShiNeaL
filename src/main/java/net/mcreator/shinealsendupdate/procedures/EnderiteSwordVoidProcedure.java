package net.mcreator.shinealsendupdate.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.shinealsendupdate.init.ShinealsEndUpdateModItems;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class EnderiteSwordVoidProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level.dimension()) == (Level.END)) {
			if (world instanceof ServerLevel _origLevel) {
				LevelAccessor _worldorig = world;
				world = _origLevel.getServer().getLevel(Level.END);
				if (world != null) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entity.getY() < 0) {
								if ((entity instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == ShinealsEndUpdateModItems.ENDERITE_SWORD.get()) {
									{
										Entity _ent = entity;
										_ent.teleportTo(x, (y + 1), z);
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport(x, (y + 1), z, _ent.getYRot(), _ent.getXRot());
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
