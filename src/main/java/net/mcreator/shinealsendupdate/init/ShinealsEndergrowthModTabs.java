
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendndergrowth.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.shinealsendndergrowth.ShinealsEndergrowthMod;

public class ShinealsEndergrowthModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShinealsEndergrowthMod.MODID);
	public static final RegistryObject<CreativeModeTab> SHINEALS_ENDERGROWTH = REGISTRY.register("shineals_endergrowth",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.shineals_endergrowth.shineals_endergrowth")).icon(() -> new ItemStack(ShinealsEndergrowthModItems.ENDERIUM_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ShinealsEndergrowthModBlocks.END_STONE_PILLAR.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.COBBLED_END_STONE.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.SMOOTH_END_STONE.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.ENDERIUM_ORE.get().asItem());
				tabData.accept(ShinealsEndergrowthModItems.RAW_ENDERIUM.get());
				tabData.accept(ShinealsEndergrowthModItems.ENDERIUM_INGOT.get());
				tabData.accept(ShinealsEndergrowthModBlocks.END_STONE_LAMP.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.ENDERIUM_CRYSTAL_BLOCK.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.CHISELED_END_STONE.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.ENDERITE_BLOCK.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.PORTAL_TABLE.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.PORTAL_TABLE_EMPTY.get().asItem());
				tabData.accept(ShinealsEndergrowthModItems.ENDERIUM_ARMOR_HELMET.get());
				tabData.accept(ShinealsEndergrowthModItems.ENDERIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(ShinealsEndergrowthModItems.ENDERIUM_ARMOR_LEGGINGS.get());
				tabData.accept(ShinealsEndergrowthModItems.ENDERIUM_ARMOR_BOOTS.get());
				tabData.accept(ShinealsEndergrowthModBlocks.CHORUS_LOG.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.CHORUS_PLANKS.get().asItem());
				tabData.accept(ShinealsEndergrowthModItems.ENDERIUM_SWORD.get());
				tabData.accept(ShinealsEndergrowthModItems.ENDERIUM_PICKAXE.get());
				tabData.accept(ShinealsEndergrowthModItems.ENDERIUM_AXE.get());
				tabData.accept(ShinealsEndergrowthModItems.ENDERIUM_SHOVEL.get());
				tabData.accept(ShinealsEndergrowthModItems.ENDERIUM_HOE.get());
				tabData.accept(ShinealsEndergrowthModBlocks.PURPUR_BORDERED_PILLAR.get().asItem());
				tabData.accept(ShinealsEndergrowthModItems.VOIDIAL_WATER_BUCKET.get());
				tabData.accept(ShinealsEndergrowthModBlocks.CHORUS_WOOD.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.PURPUR_LEAVES_DEAD.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.PURPUR_LEAVES.get().asItem());
				tabData.accept(ShinealsEndergrowthModBlocks.FLOWERING_PURPUR_LEAVES.get().asItem());
				tabData.accept(ShinealsEndergrowthModItems.SNAIL_SLUDGE.get());
				tabData.accept(ShinealsEndergrowthModItems.ENDER_MAGE_SPAWN_EGG.get());
				tabData.accept(ShinealsEndergrowthModItems.ENDER_PHANTOM_SPAWN_EGG.get());
				tabData.accept(ShinealsEndergrowthModItems.END_STRIDER_SPAWN_EGG.get());
				tabData.accept(ShinealsEndergrowthModItems.CHORUS_BEE_SPAWN_EGG.get());
				tabData.accept(ShinealsEndergrowthModItems.CHORUS_SNAIL_SPAWN_EGG.get());
			})

					.build());
}
