
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.naturesexpert.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.naturesexpert.block.ShamrockBlock;
import net.mcreator.naturesexpert.block.LuckyShamrockBlock;
import net.mcreator.naturesexpert.block.LavenderBlock;
import net.mcreator.naturesexpert.block.HyacinthBlock;
import net.mcreator.naturesexpert.block.ForgetMeNotsBlock;
import net.mcreator.naturesexpert.block.CarnationBlock;
import net.mcreator.naturesexpert.block.CallaLilyBlock;
import net.mcreator.naturesexpert.block.BluePassionFlowerBlock;
import net.mcreator.naturesexpert.block.AstilbeBlock;
import net.mcreator.naturesexpert.block.AnemoneBlock;
import net.mcreator.naturesexpert.block.AmaryllisBlock;
import net.mcreator.naturesexpert.NaturesExpertMod;

public class NaturesExpertModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, NaturesExpertMod.MODID);
	public static final DeferredHolder<Block, Block> AMARYLLIS = REGISTRY.register("amaryllis", () -> new AmaryllisBlock());
	public static final DeferredHolder<Block, Block> ANEMONE = REGISTRY.register("anemone", () -> new AnemoneBlock());
	public static final DeferredHolder<Block, Block> ASTILBE = REGISTRY.register("astilbe", () -> new AstilbeBlock());
	public static final DeferredHolder<Block, Block> CARNATION = REGISTRY.register("carnation", () -> new CarnationBlock());
	public static final DeferredHolder<Block, Block> BLUE_PASSION_FLOWER = REGISTRY.register("blue_passion_flower", () -> new BluePassionFlowerBlock());
	public static final DeferredHolder<Block, Block> CALLA_LILY = REGISTRY.register("calla_lily", () -> new CallaLilyBlock());
	public static final DeferredHolder<Block, Block> FORGET_ME_NOTS = REGISTRY.register("forget_me_nots", () -> new ForgetMeNotsBlock());
	public static final DeferredHolder<Block, Block> HYACINTH = REGISTRY.register("hyacinth", () -> new HyacinthBlock());
	public static final DeferredHolder<Block, Block> LAVENDER = REGISTRY.register("lavender", () -> new LavenderBlock());
	public static final DeferredHolder<Block, Block> SHAMROCK = REGISTRY.register("shamrock", () -> new ShamrockBlock());
	public static final DeferredHolder<Block, Block> LUCKY_SHAMROCK = REGISTRY.register("lucky_shamrock", () -> new LuckyShamrockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
