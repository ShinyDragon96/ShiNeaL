
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.shinealsendndergrowth.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.shinealsendndergrowth.block.VoidialWaterBlock;
import net.mcreator.shinealsendndergrowth.block.SmoothEndStoneBlock;
import net.mcreator.shinealsendndergrowth.block.RawEnderiteBlockBlock;
import net.mcreator.shinealsendndergrowth.block.PurpurLeavesDeadBlock;
import net.mcreator.shinealsendndergrowth.block.PurpurLeavesBlock;
import net.mcreator.shinealsendndergrowth.block.PurpurBorderedPillarBlock;
import net.mcreator.shinealsendndergrowth.block.PortalTableEmptyBlock;
import net.mcreator.shinealsendndergrowth.block.PortalTableBlock;
import net.mcreator.shinealsendndergrowth.block.FloweringPurpurLeavesBlock;
import net.mcreator.shinealsendndergrowth.block.EnderiteOreBlock;
import net.mcreator.shinealsendndergrowth.block.EnderiteBlockBlock;
import net.mcreator.shinealsendndergrowth.block.EndStonePillarBlock;
import net.mcreator.shinealsendndergrowth.block.EndStoneLampBlock;
import net.mcreator.shinealsendndergrowth.block.CobbledEndStoneBlock;
import net.mcreator.shinealsendndergrowth.block.ChorusWoodBlock;
import net.mcreator.shinealsendndergrowth.block.ChorusPlanksBlock;
import net.mcreator.shinealsendndergrowth.block.ChorusLogBlock;
import net.mcreator.shinealsendndergrowth.block.ChiseledEndStoneBlock;
import net.mcreator.shinealsendndergrowth.ShinealsEndergrowthMod;

public class ShinealsEndergrowthModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ShinealsEndergrowthMod.MODID);
	public static final RegistryObject<Block> END_STONE_PILLAR = REGISTRY.register("end_stone_pillar", () -> new EndStonePillarBlock());
	public static final RegistryObject<Block> COBBLED_END_STONE = REGISTRY.register("cobbled_end_stone", () -> new CobbledEndStoneBlock());
	public static final RegistryObject<Block> SMOOTH_END_STONE = REGISTRY.register("smooth_end_stone", () -> new SmoothEndStoneBlock());
	public static final RegistryObject<Block> ENDERIUM_ORE = REGISTRY.register("enderium_ore", () -> new EnderiteOreBlock());
	public static final RegistryObject<Block> END_STONE_LAMP = REGISTRY.register("end_stone_lamp", () -> new EndStoneLampBlock());
	public static final RegistryObject<Block> ENDERIUM_CRYSTAL_BLOCK = REGISTRY.register("enderium_crystal_block", () -> new RawEnderiteBlockBlock());
	public static final RegistryObject<Block> CHISELED_END_STONE = REGISTRY.register("chiseled_end_stone", () -> new ChiseledEndStoneBlock());
	public static final RegistryObject<Block> ENDERITE_BLOCK = REGISTRY.register("enderite_block", () -> new EnderiteBlockBlock());
	public static final RegistryObject<Block> PORTAL_TABLE = REGISTRY.register("portal_table", () -> new PortalTableBlock());
	public static final RegistryObject<Block> PORTAL_TABLE_EMPTY = REGISTRY.register("portal_table_empty", () -> new PortalTableEmptyBlock());
	public static final RegistryObject<Block> CHORUS_LOG = REGISTRY.register("chorus_log", () -> new ChorusLogBlock());
	public static final RegistryObject<Block> CHORUS_PLANKS = REGISTRY.register("chorus_planks", () -> new ChorusPlanksBlock());
	public static final RegistryObject<Block> PURPUR_BORDERED_PILLAR = REGISTRY.register("purpur_bordered_pillar", () -> new PurpurBorderedPillarBlock());
	public static final RegistryObject<Block> VOIDIAL_WATER = REGISTRY.register("voidial_water", () -> new VoidialWaterBlock());
	public static final RegistryObject<Block> CHORUS_WOOD = REGISTRY.register("chorus_wood", () -> new ChorusWoodBlock());
	public static final RegistryObject<Block> PURPUR_LEAVES_DEAD = REGISTRY.register("purpur_leaves_dead", () -> new PurpurLeavesDeadBlock());
	public static final RegistryObject<Block> PURPUR_LEAVES = REGISTRY.register("purpur_leaves", () -> new PurpurLeavesBlock());
	public static final RegistryObject<Block> FLOWERING_PURPUR_LEAVES = REGISTRY.register("flowering_purpur_leaves", () -> new FloweringPurpurLeavesBlock());
}
