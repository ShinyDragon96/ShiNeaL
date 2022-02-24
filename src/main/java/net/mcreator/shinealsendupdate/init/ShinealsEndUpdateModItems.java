
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
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

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShinealsEndUpdateModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item END_STONE_PILLAR = register(ShinealsEndUpdateModBlocks.END_STONE_PILLAR,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item COBBLED_END_STONE = register(ShinealsEndUpdateModBlocks.COBBLED_END_STONE,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item SMOOTH_END_STONE = register(ShinealsEndUpdateModBlocks.SMOOTH_END_STONE,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item ENDERITE_ORE = register(ShinealsEndUpdateModBlocks.ENDERITE_ORE, ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item RAW_ENDERITE = register(new RawEnderiteItem());
	public static final Item ENDERITE_INGOT = register(new EnderiteIngotItem());
	public static final Item END_STONE_LAMP = register(ShinealsEndUpdateModBlocks.END_STONE_LAMP,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item ENDERITE_CRYSTAL_BLOCK = register(ShinealsEndUpdateModBlocks.ENDERITE_CRYSTAL_BLOCK,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item CHISELED_END_STONE = register(ShinealsEndUpdateModBlocks.CHISELED_END_STONE,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item ENDERITE_BLOCK = register(ShinealsEndUpdateModBlocks.ENDERITE_BLOCK,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item PORTAL_TABLE = register(ShinealsEndUpdateModBlocks.PORTAL_TABLE, ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item PORTAL_TABLE_EMPTY = register(ShinealsEndUpdateModBlocks.PORTAL_TABLE_EMPTY,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item ENDERITE_ARMOR_HELMET = register(new EnderiteArmorItem.Helmet());
	public static final Item ENDERITE_ARMOR_CHESTPLATE = register(new EnderiteArmorItem.Chestplate());
	public static final Item ENDERITE_ARMOR_LEGGINGS = register(new EnderiteArmorItem.Leggings());
	public static final Item ENDERITE_ARMOR_BOOTS = register(new EnderiteArmorItem.Boots());
	public static final Item CHORUS_LOG = register(ShinealsEndUpdateModBlocks.CHORUS_LOG, ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item CHORUS_PLANKS = register(ShinealsEndUpdateModBlocks.CHORUS_PLANKS,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item ENDERITE_SWORD = register(new EnderiteSwordItem());
	public static final Item ENDERITE_PICKAXE = register(new EnderitePickaxeItem());
	public static final Item ENDERITE_AXE = register(new EnderiteAxeItem());
	public static final Item ENDERITE_SHOVEL = register(new EnderiteShovelItem());
	public static final Item ENDERITE_HOE = register(new EnderiteHoeItem());
	public static final Item PURPUR_BORDERED_PILLAR = register(ShinealsEndUpdateModBlocks.PURPUR_BORDERED_PILLAR,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item VOIDIAL_WATER_BUCKET = register(new VoidialWaterItem());
	public static final Item CHORUS_WOOD = register(ShinealsEndUpdateModBlocks.CHORUS_WOOD, ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item PURPUR_LEAVES_DEAD = register(ShinealsEndUpdateModBlocks.PURPUR_LEAVES_DEAD,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item PURPUR_LEAVES = register(ShinealsEndUpdateModBlocks.PURPUR_LEAVES,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item FLOWERING_PURPUR_LEAVES = register(ShinealsEndUpdateModBlocks.FLOWERING_PURPUR_LEAVES,
			ShinealsEndUpdateModTabs.TAB_SHINY_CREEPERS_END_UPDATE);
	public static final Item END_STRIDER = register(
			new SpawnEggItem(ShinealsEndUpdateModEntities.END_STRIDER, -10092442, -16751104, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("end_strider_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
