
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.shinealsendupdate.block.VoidialWaterBlock;
import net.mcreator.shinealsendupdate.block.SmoothEndStoneBlock;
import net.mcreator.shinealsendupdate.block.RawEnderiteBlockBlock;
import net.mcreator.shinealsendupdate.block.PurpurLeavesDeadBlock;
import net.mcreator.shinealsendupdate.block.PurpurLeavesBlock;
import net.mcreator.shinealsendupdate.block.PurpurBorderedPillarBlock;
import net.mcreator.shinealsendupdate.block.PortalTableEmptyBlock;
import net.mcreator.shinealsendupdate.block.PortalTableBlock;
import net.mcreator.shinealsendupdate.block.FloweringPurpurLeavesBlock;
import net.mcreator.shinealsendupdate.block.EnderiteOreBlock;
import net.mcreator.shinealsendupdate.block.EnderiteBlockBlock;
import net.mcreator.shinealsendupdate.block.EndStonePillarBlock;
import net.mcreator.shinealsendupdate.block.EndStoneLampBlock;
import net.mcreator.shinealsendupdate.block.CobbledEndStoneBlock;
import net.mcreator.shinealsendupdate.block.ChorusWoodBlock;
import net.mcreator.shinealsendupdate.block.ChorusPlanksBlock;
import net.mcreator.shinealsendupdate.block.ChorusLogBlock;
import net.mcreator.shinealsendupdate.block.ChiseledEndStoneBlock;
import net.mcreator.shinealsendupdate.ShinealsEndUpdateMod;

public class ShinealsEndUpdateModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ShinealsEndUpdateMod.MODID);
	public static final RegistryObject<Block> END_STONE_PILLAR = REGISTRY.register("end_stone_pillar", () -> new EndStonePillarBlock());
	public static final RegistryObject<Block> COBBLED_END_STONE = REGISTRY.register("cobbled_end_stone", () -> new CobbledEndStoneBlock());
	public static final RegistryObject<Block> SMOOTH_END_STONE = REGISTRY.register("smooth_end_stone", () -> new SmoothEndStoneBlock());
	public static final RegistryObject<Block> ENDERITE_ORE = REGISTRY.register("enderite_ore", () -> new EnderiteOreBlock());
	public static final RegistryObject<Block> END_STONE_LAMP = REGISTRY.register("end_stone_lamp", () -> new EndStoneLampBlock());
	public static final RegistryObject<Block> ENDERITE_CRYSTAL_BLOCK = REGISTRY.register("enderite_crystal_block", () -> new RawEnderiteBlockBlock());
	public static final RegistryObject<Block> CHISELED_END_STONE = REGISTRY.register("chiseled_end_stone", () -> new ChiseledEndStoneBlock());
	public static final RegistryObject<Block> ENDERITE_BLOCK = REGISTRY.register("enderite_block", () -> new EnderiteBlockBlock());
	public static final RegistryObject<Block> PORTAL_TABLE = REGISTRY.register("portal_table", () -> new PortalTableBlock());
	public static final RegistryObject<Block> PORTAL_TABLE_EMPTY = REGISTRY.register("portal_table_empty", () -> new PortalTableEmptyBlock());
	public static final RegistryObject<Block> CHORUS_LOG = REGISTRY.register("chorus_log", () -> new ChorusLogBlock());
	public static final RegistryObject<Block> CHORUS_PLANKS = REGISTRY.register("chorus_planks", () -> new ChorusPlanksBlock());
	public static final RegistryObject<Block> PURPUR_BORDERED_PILLAR = REGISTRY.register("purpur_bordered_pillar",
			() -> new PurpurBorderedPillarBlock());
	public static final RegistryObject<Block> VOIDIAL_WATER = REGISTRY.register("voidial_water", () -> new VoidialWaterBlock());
	public static final RegistryObject<Block> CHORUS_WOOD = REGISTRY.register("chorus_wood", () -> new ChorusWoodBlock());
	public static final RegistryObject<Block> PURPUR_LEAVES_DEAD = REGISTRY.register("purpur_leaves_dead", () -> new PurpurLeavesDeadBlock());
	public static final RegistryObject<Block> PURPUR_LEAVES = REGISTRY.register("purpur_leaves", () -> new PurpurLeavesBlock());
	public static final RegistryObject<Block> FLOWERING_PURPUR_LEAVES = REGISTRY.register("flowering_purpur_leaves",
			() -> new FloweringPurpurLeavesBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PortalTableBlock.registerRenderLayer();
			PortalTableEmptyBlock.registerRenderLayer();
			PurpurLeavesDeadBlock.registerRenderLayer();
			PurpurLeavesBlock.registerRenderLayer();
			FloweringPurpurLeavesBlock.registerRenderLayer();
		}
	}
}
