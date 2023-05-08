
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShinealsEndUpdateModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("shineals_end_update", "shiny_creepers_end_update"),
				builder -> builder.title(Component.translatable("item_group.shineals_end_update.shiny_creepers_end_update")).icon(() -> new ItemStack(ShinealsEndUpdateModItems.ENDERITE_INGOT.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ShinealsEndUpdateModBlocks.END_STONE_PILLAR.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.COBBLED_END_STONE.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.SMOOTH_END_STONE.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.ENDERITE_ORE.get().asItem());
					tabData.accept(ShinealsEndUpdateModItems.RAW_ENDERITE.get());
					tabData.accept(ShinealsEndUpdateModItems.ENDERITE_INGOT.get());
					tabData.accept(ShinealsEndUpdateModBlocks.END_STONE_LAMP.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.ENDERITE_CRYSTAL_BLOCK.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.CHISELED_END_STONE.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.ENDERITE_BLOCK.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.PORTAL_TABLE.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.PORTAL_TABLE_EMPTY.get().asItem());
					tabData.accept(ShinealsEndUpdateModItems.ENDERITE_ARMOR_HELMET.get());
					tabData.accept(ShinealsEndUpdateModItems.ENDERITE_ARMOR_CHESTPLATE.get());
					tabData.accept(ShinealsEndUpdateModItems.ENDERITE_ARMOR_LEGGINGS.get());
					tabData.accept(ShinealsEndUpdateModItems.ENDERITE_ARMOR_BOOTS.get());
					tabData.accept(ShinealsEndUpdateModBlocks.CHORUS_LOG.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.CHORUS_PLANKS.get().asItem());
					tabData.accept(ShinealsEndUpdateModItems.ENDERITE_SWORD.get());
					tabData.accept(ShinealsEndUpdateModItems.ENDERITE_PICKAXE.get());
					tabData.accept(ShinealsEndUpdateModItems.ENDERITE_AXE.get());
					tabData.accept(ShinealsEndUpdateModItems.ENDERITE_SHOVEL.get());
					tabData.accept(ShinealsEndUpdateModItems.ENDERITE_HOE.get());
					tabData.accept(ShinealsEndUpdateModBlocks.PURPUR_BORDERED_PILLAR.get().asItem());
					tabData.accept(ShinealsEndUpdateModItems.VOIDIAL_WATER_BUCKET.get());
					tabData.accept(ShinealsEndUpdateModBlocks.CHORUS_WOOD.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.PURPUR_LEAVES_DEAD.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.PURPUR_LEAVES.get().asItem());
					tabData.accept(ShinealsEndUpdateModBlocks.FLOWERING_PURPUR_LEAVES.get().asItem());
					tabData.accept(ShinealsEndUpdateModItems.END_STRIDER_SPAWN_EGG.get());
					tabData.accept(ShinealsEndUpdateModItems.ENDMAGE_SPAWN_EGG.get());
					tabData.accept(ShinealsEndUpdateModItems.CHORUSSNAIL_SPAWN_EGG.get());
					tabData.accept(ShinealsEndUpdateModItems.CHORUSBEE_SPAWN_EGG.get());
					tabData.accept(ShinealsEndUpdateModItems.ENDERPHANTOM_SPAWN_EGG.get());
				})

		);
	}
}
