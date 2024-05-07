
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.naturesexpert.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.naturesexpert.block.YellowHyacinthBlock;
import net.mcreator.naturesexpert.block.ShamrockBlock;
import net.mcreator.naturesexpert.block.RhododendronBushBlock;
import net.mcreator.naturesexpert.block.RedHyacinthBlock;
import net.mcreator.naturesexpert.block.PurpleHyacinthBlock;
import net.mcreator.naturesexpert.block.PinkHyacinthBlock;
import net.mcreator.naturesexpert.block.OrangeHyacinthBlock;
import net.mcreator.naturesexpert.block.MarigoldBlock;
import net.mcreator.naturesexpert.block.LuckyShamrockBlock;
import net.mcreator.naturesexpert.block.LightBlueHyacinthBlock;
import net.mcreator.naturesexpert.block.LavenderBlock;
import net.mcreator.naturesexpert.block.ForgetMeNotsBlock;
import net.mcreator.naturesexpert.block.CarnationBlock;
import net.mcreator.naturesexpert.block.CallaLilyBlock;
import net.mcreator.naturesexpert.block.BrittlebushBlock;
import net.mcreator.naturesexpert.block.BluePassionFlowerBlock;
import net.mcreator.naturesexpert.block.BlueHyacinthBlock;
import net.mcreator.naturesexpert.block.BirdOfParadiseBlock;
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
	public static final DeferredHolder<Block, Block> LAVENDER = REGISTRY.register("lavender", () -> new LavenderBlock());
	public static final DeferredHolder<Block, Block> SHAMROCK = REGISTRY.register("shamrock", () -> new ShamrockBlock());
	public static final DeferredHolder<Block, Block> LUCKY_SHAMROCK = REGISTRY.register("lucky_shamrock", () -> new LuckyShamrockBlock());
	public static final DeferredHolder<Block, Block> MARIGOLD = REGISTRY.register("marigold", () -> new MarigoldBlock());
	public static final DeferredHolder<Block, Block> BRITTLEBUSH = REGISTRY.register("brittlebush", () -> new BrittlebushBlock());
	public static final DeferredHolder<Block, Block> BIRD_OF_PARADISE = REGISTRY.register("bird_of_paradise", () -> new BirdOfParadiseBlock());
	public static final DeferredHolder<Block, Block> RHODODENDRON_BUSH = REGISTRY.register("rhododendron_bush", () -> new RhododendronBushBlock());
	public static final DeferredHolder<Block, Block> BLUE_HYACINTH = REGISTRY.register("blue_hyacinth", () -> new BlueHyacinthBlock());
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_HYACINTH = REGISTRY.register("light_blue_hyacinth", () -> new LightBlueHyacinthBlock());
	public static final DeferredHolder<Block, Block> RED_HYACINTH = REGISTRY.register("red_hyacinth", () -> new RedHyacinthBlock());
	public static final DeferredHolder<Block, Block> PURPLE_HYACINTH = REGISTRY.register("purple_hyacinth", () -> new PurpleHyacinthBlock());
	public static final DeferredHolder<Block, Block> YELLOW_HYACINTH = REGISTRY.register("yellow_hyacinth", () -> new YellowHyacinthBlock());
	public static final DeferredHolder<Block, Block> ORANGE_HYACINTH = REGISTRY.register("orange_hyacinth", () -> new OrangeHyacinthBlock());
	public static final DeferredHolder<Block, Block> PINK_HYACINTH = REGISTRY.register("pink_hyacinth", () -> new PinkHyacinthBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
