
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendndergrowth.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.shinealsendndergrowth.item.VoidialWaterItem;
import net.mcreator.shinealsendndergrowth.item.SnailSludgeItem;
import net.mcreator.shinealsendndergrowth.item.RawEnderiteItem;
import net.mcreator.shinealsendndergrowth.item.EnderiteSwordItem;
import net.mcreator.shinealsendndergrowth.item.EnderiteShovelItem;
import net.mcreator.shinealsendndergrowth.item.EnderitePickaxeItem;
import net.mcreator.shinealsendndergrowth.item.EnderiteIngotItem;
import net.mcreator.shinealsendndergrowth.item.EnderiteHoeItem;
import net.mcreator.shinealsendndergrowth.item.EnderiteAxeItem;
import net.mcreator.shinealsendndergrowth.item.EnderiteArmorItem;
import net.mcreator.shinealsendndergrowth.ShinealsEndergrowthMod;

public class ShinealsEndergrowthModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ShinealsEndergrowthMod.MODID);
	public static final RegistryObject<Item> END_STONE_PILLAR = block(ShinealsEndergrowthModBlocks.END_STONE_PILLAR);
	public static final RegistryObject<Item> COBBLED_END_STONE = block(ShinealsEndergrowthModBlocks.COBBLED_END_STONE);
	public static final RegistryObject<Item> SMOOTH_END_STONE = block(ShinealsEndergrowthModBlocks.SMOOTH_END_STONE);
	public static final RegistryObject<Item> ENDERIUM_ORE = block(ShinealsEndergrowthModBlocks.ENDERIUM_ORE);
	public static final RegistryObject<Item> RAW_ENDERIUM = REGISTRY.register("raw_enderium", () -> new RawEnderiteItem());
	public static final RegistryObject<Item> ENDERIUM_INGOT = REGISTRY.register("enderium_ingot", () -> new EnderiteIngotItem());
	public static final RegistryObject<Item> END_STONE_LAMP = block(ShinealsEndergrowthModBlocks.END_STONE_LAMP);
	public static final RegistryObject<Item> ENDERIUM_CRYSTAL_BLOCK = block(ShinealsEndergrowthModBlocks.ENDERIUM_CRYSTAL_BLOCK);
	public static final RegistryObject<Item> CHISELED_END_STONE = block(ShinealsEndergrowthModBlocks.CHISELED_END_STONE);
	public static final RegistryObject<Item> ENDERITE_BLOCK = block(ShinealsEndergrowthModBlocks.ENDERITE_BLOCK);
	public static final RegistryObject<Item> PORTAL_TABLE = block(ShinealsEndergrowthModBlocks.PORTAL_TABLE);
	public static final RegistryObject<Item> PORTAL_TABLE_EMPTY = block(ShinealsEndergrowthModBlocks.PORTAL_TABLE_EMPTY);
	public static final RegistryObject<Item> ENDERIUM_ARMOR_HELMET = REGISTRY.register("enderium_armor_helmet", () -> new EnderiteArmorItem.Helmet());
	public static final RegistryObject<Item> ENDERIUM_ARMOR_CHESTPLATE = REGISTRY.register("enderium_armor_chestplate", () -> new EnderiteArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDERIUM_ARMOR_LEGGINGS = REGISTRY.register("enderium_armor_leggings", () -> new EnderiteArmorItem.Leggings());
	public static final RegistryObject<Item> ENDERIUM_ARMOR_BOOTS = REGISTRY.register("enderium_armor_boots", () -> new EnderiteArmorItem.Boots());
	public static final RegistryObject<Item> CHORUS_LOG = block(ShinealsEndergrowthModBlocks.CHORUS_LOG);
	public static final RegistryObject<Item> CHORUS_PLANKS = block(ShinealsEndergrowthModBlocks.CHORUS_PLANKS);
	public static final RegistryObject<Item> ENDERIUM_SWORD = REGISTRY.register("enderium_sword", () -> new EnderiteSwordItem());
	public static final RegistryObject<Item> ENDERIUM_PICKAXE = REGISTRY.register("enderium_pickaxe", () -> new EnderitePickaxeItem());
	public static final RegistryObject<Item> ENDERIUM_AXE = REGISTRY.register("enderium_axe", () -> new EnderiteAxeItem());
	public static final RegistryObject<Item> ENDERIUM_SHOVEL = REGISTRY.register("enderium_shovel", () -> new EnderiteShovelItem());
	public static final RegistryObject<Item> ENDERIUM_HOE = REGISTRY.register("enderium_hoe", () -> new EnderiteHoeItem());
	public static final RegistryObject<Item> PURPUR_BORDERED_PILLAR = block(ShinealsEndergrowthModBlocks.PURPUR_BORDERED_PILLAR);
	public static final RegistryObject<Item> VOIDIAL_WATER_BUCKET = REGISTRY.register("voidial_water_bucket", () -> new VoidialWaterItem());
	public static final RegistryObject<Item> CHORUS_WOOD = block(ShinealsEndergrowthModBlocks.CHORUS_WOOD);
	public static final RegistryObject<Item> PURPUR_LEAVES_DEAD = block(ShinealsEndergrowthModBlocks.PURPUR_LEAVES_DEAD);
	public static final RegistryObject<Item> PURPUR_LEAVES = block(ShinealsEndergrowthModBlocks.PURPUR_LEAVES);
	public static final RegistryObject<Item> FLOWERING_PURPUR_LEAVES = block(ShinealsEndergrowthModBlocks.FLOWERING_PURPUR_LEAVES);
	public static final RegistryObject<Item> SNAIL_SLUDGE = REGISTRY.register("snail_sludge", () -> new SnailSludgeItem());
	public static final RegistryObject<Item> ENDER_MAGE_SPAWN_EGG = REGISTRY.register("ender_mage_spawn_egg", () -> new ForgeSpawnEggItem(ShinealsEndergrowthModEntities.ENDER_MAGE, -13434829, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> ENDER_PHANTOM_SPAWN_EGG = REGISTRY.register("ender_phantom_spawn_egg", () -> new ForgeSpawnEggItem(ShinealsEndergrowthModEntities.ENDER_PHANTOM, -6750055, -3368449, new Item.Properties()));
	public static final RegistryObject<Item> END_STRIDER_SPAWN_EGG = REGISTRY.register("end_strider_spawn_egg", () -> new ForgeSpawnEggItem(ShinealsEndergrowthModEntities.END_STRIDER, -6749953, -3355648, new Item.Properties()));
	public static final RegistryObject<Item> CHORUS_BEE_SPAWN_EGG = REGISTRY.register("chorus_bee_spawn_egg", () -> new ForgeSpawnEggItem(ShinealsEndergrowthModEntities.CHORUS_BEE, -16777216, -3355393, new Item.Properties()));
	public static final RegistryObject<Item> CHORUS_SNAIL_SPAWN_EGG = REGISTRY.register("chorus_snail_spawn_egg", () -> new ForgeSpawnEggItem(ShinealsEndergrowthModEntities.CHORUS_SNAIL, -6750055, -6749953, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
