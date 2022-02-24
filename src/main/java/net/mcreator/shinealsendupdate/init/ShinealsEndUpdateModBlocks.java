
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendupdate.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
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

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShinealsEndUpdateModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block END_STONE_PILLAR = register(new EndStonePillarBlock());
	public static final Block COBBLED_END_STONE = register(new CobbledEndStoneBlock());
	public static final Block SMOOTH_END_STONE = register(new SmoothEndStoneBlock());
	public static final Block ENDERITE_ORE = register(new EnderiteOreBlock());
	public static final Block END_STONE_LAMP = register(new EndStoneLampBlock());
	public static final Block ENDERITE_CRYSTAL_BLOCK = register(new RawEnderiteBlockBlock());
	public static final Block CHISELED_END_STONE = register(new ChiseledEndStoneBlock());
	public static final Block ENDERITE_BLOCK = register(new EnderiteBlockBlock());
	public static final Block PORTAL_TABLE = register(new PortalTableBlock());
	public static final Block PORTAL_TABLE_EMPTY = register(new PortalTableEmptyBlock());
	public static final Block CHORUS_LOG = register(new ChorusLogBlock());
	public static final Block CHORUS_PLANKS = register(new ChorusPlanksBlock());
	public static final Block PURPUR_BORDERED_PILLAR = register(new PurpurBorderedPillarBlock());
	public static final Block VOIDIAL_WATER = register(new VoidialWaterBlock());
	public static final Block CHORUS_WOOD = register(new ChorusWoodBlock());
	public static final Block PURPUR_LEAVES_DEAD = register(new PurpurLeavesDeadBlock());
	public static final Block PURPUR_LEAVES = register(new PurpurLeavesBlock());
	public static final Block FLOWERING_PURPUR_LEAVES = register(new FloweringPurpurLeavesBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

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
