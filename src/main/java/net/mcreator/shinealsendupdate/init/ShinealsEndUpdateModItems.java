
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.shinealsendupdate.item.VoidialWaterItem;
import net.mcreator.shinealsendupdate.item.RawEnderiteItem;
import net.mcreator.shinealsendupdate.item.EnderiteSwordItem;
import net.mcreator.shinealsendupdate.item.EnderiteShovelItem;
import net.mcreator.shinealsendupdate.item.EnderitePickaxeItem;
import net.mcreator.shinealsendupdate.item.EnderiteIngotItem;
import net.mcreator.shinealsendupdate.item.EnderiteHoeItem;
import net.mcreator.shinealsendupdate.item.EnderiteAxeItem;
import net.mcreator.shinealsendupdate.item.EnderiteArmorItem;
import net.mcreator.shinealsendupdate.ShinealsEndUpdateMod;

public class ShinealsEndUpdateModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ShinealsEndUpdateMod.MODID);
	public static final RegistryObject<Item> END_STONE_PILLAR = block(ShinealsEndUpdateModBlocks.END_STONE_PILLAR);
	public static final RegistryObject<Item> COBBLED_END_STONE = block(ShinealsEndUpdateModBlocks.COBBLED_END_STONE);
	public static final RegistryObject<Item> SMOOTH_END_STONE = block(ShinealsEndUpdateModBlocks.SMOOTH_END_STONE);
	public static final RegistryObject<Item> ENDERITE_ORE = block(ShinealsEndUpdateModBlocks.ENDERITE_ORE);
	public static final RegistryObject<Item> RAW_ENDERITE = REGISTRY.register("raw_enderite", () -> new RawEnderiteItem());
	public static final RegistryObject<Item> ENDERITE_INGOT = REGISTRY.register("enderite_ingot", () -> new EnderiteIngotItem());
	public static final RegistryObject<Item> END_STONE_LAMP = block(ShinealsEndUpdateModBlocks.END_STONE_LAMP);
	public static final RegistryObject<Item> ENDERITE_CRYSTAL_BLOCK = block(ShinealsEndUpdateModBlocks.ENDERITE_CRYSTAL_BLOCK);
	public static final RegistryObject<Item> CHISELED_END_STONE = block(ShinealsEndUpdateModBlocks.CHISELED_END_STONE);
	public static final RegistryObject<Item> ENDERITE_BLOCK = block(ShinealsEndUpdateModBlocks.ENDERITE_BLOCK);
	public static final RegistryObject<Item> PORTAL_TABLE = block(ShinealsEndUpdateModBlocks.PORTAL_TABLE);
	public static final RegistryObject<Item> PORTAL_TABLE_EMPTY = block(ShinealsEndUpdateModBlocks.PORTAL_TABLE_EMPTY);
	public static final RegistryObject<Item> ENDERITE_ARMOR_HELMET = REGISTRY.register("enderite_armor_helmet", () -> new EnderiteArmorItem.Helmet());
	public static final RegistryObject<Item> ENDERITE_ARMOR_CHESTPLATE = REGISTRY.register("enderite_armor_chestplate", () -> new EnderiteArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDERITE_ARMOR_LEGGINGS = REGISTRY.register("enderite_armor_leggings", () -> new EnderiteArmorItem.Leggings());
	public static final RegistryObject<Item> ENDERITE_ARMOR_BOOTS = REGISTRY.register("enderite_armor_boots", () -> new EnderiteArmorItem.Boots());
	public static final RegistryObject<Item> CHORUS_LOG = block(ShinealsEndUpdateModBlocks.CHORUS_LOG);
	public static final RegistryObject<Item> CHORUS_PLANKS = block(ShinealsEndUpdateModBlocks.CHORUS_PLANKS);
	public static final RegistryObject<Item> ENDERITE_SWORD = REGISTRY.register("enderite_sword", () -> new EnderiteSwordItem());
	public static final RegistryObject<Item> ENDERITE_PICKAXE = REGISTRY.register("enderite_pickaxe", () -> new EnderitePickaxeItem());
	public static final RegistryObject<Item> ENDERITE_AXE = REGISTRY.register("enderite_axe", () -> new EnderiteAxeItem());
	public static final RegistryObject<Item> ENDERITE_SHOVEL = REGISTRY.register("enderite_shovel", () -> new EnderiteShovelItem());
	public static final RegistryObject<Item> ENDERITE_HOE = REGISTRY.register("enderite_hoe", () -> new EnderiteHoeItem());
	public static final RegistryObject<Item> PURPUR_BORDERED_PILLAR = block(ShinealsEndUpdateModBlocks.PURPUR_BORDERED_PILLAR);
	public static final RegistryObject<Item> VOIDIAL_WATER_BUCKET = REGISTRY.register("voidial_water_bucket", () -> new VoidialWaterItem());
	public static final RegistryObject<Item> CHORUS_WOOD = block(ShinealsEndUpdateModBlocks.CHORUS_WOOD);
	public static final RegistryObject<Item> PURPUR_LEAVES_DEAD = block(ShinealsEndUpdateModBlocks.PURPUR_LEAVES_DEAD);
	public static final RegistryObject<Item> PURPUR_LEAVES = block(ShinealsEndUpdateModBlocks.PURPUR_LEAVES);
	public static final RegistryObject<Item> FLOWERING_PURPUR_LEAVES = block(ShinealsEndUpdateModBlocks.FLOWERING_PURPUR_LEAVES);
	public static final RegistryObject<Item> END_STRIDER_SPAWN_EGG = REGISTRY.register("end_strider_spawn_egg", () -> new ForgeSpawnEggItem(ShinealsEndUpdateModEntities.END_STRIDER, -10092442, -13395712, new Item.Properties()));
	public static final RegistryObject<Item> ENDMAGE_SPAWN_EGG = REGISTRY.register("endmage_spawn_egg", () -> new ForgeSpawnEggItem(ShinealsEndUpdateModEntities.ENDMAGE, -10066432, -6750055, new Item.Properties()));
	public static final RegistryObject<Item> CHORUSSNAIL_SPAWN_EGG = REGISTRY.register("chorussnail_spawn_egg", () -> new ForgeSpawnEggItem(ShinealsEndUpdateModEntities.CHORUSSNAIL, -3407668, -6749953, new Item.Properties()));
	public static final RegistryObject<Item> CHORUSBEE_SPAWN_EGG = REGISTRY.register("chorusbee_spawn_egg", () -> new ForgeSpawnEggItem(ShinealsEndUpdateModEntities.CHORUSBEE, -6750055, -3407617, new Item.Properties()));
	public static final RegistryObject<Item> ENDERPHANTOM_SPAWN_EGG = REGISTRY.register("enderphantom_spawn_egg", () -> new ForgeSpawnEggItem(ShinealsEndUpdateModEntities.ENDERPHANTOM, -6750055, -6736897, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
