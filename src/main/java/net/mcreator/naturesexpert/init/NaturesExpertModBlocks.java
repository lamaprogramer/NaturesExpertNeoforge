
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.naturesexpert.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.naturesexpert.block.YellowRhododendronBushBlock;
import net.mcreator.naturesexpert.block.YellowHyacinthBlock;
import net.mcreator.naturesexpert.block.YellowBeardedIrisBlock;
import net.mcreator.naturesexpert.block.WhiteRhododendronBushBlock;
import net.mcreator.naturesexpert.block.WhiteBeardedIrisBlock;
import net.mcreator.naturesexpert.block.ShamrockBlock;
import net.mcreator.naturesexpert.block.RedRhododendronBushBlock;
import net.mcreator.naturesexpert.block.RedHyacinthBlock;
import net.mcreator.naturesexpert.block.RedBeardedIrisBlock;
import net.mcreator.naturesexpert.block.PurpleRhododendronBushBlock;
import net.mcreator.naturesexpert.block.PurpleHyacinthBlock;
import net.mcreator.naturesexpert.block.PurpleBeardedIrisBlock;
import net.mcreator.naturesexpert.block.PinkRhododendronBushBlock;
import net.mcreator.naturesexpert.block.PinkHyacinthBlock;
import net.mcreator.naturesexpert.block.PinkBeardedIrisBlock;
import net.mcreator.naturesexpert.block.OrangeRhododendronBushBlock;
import net.mcreator.naturesexpert.block.OrangeHyacinthBlock;
import net.mcreator.naturesexpert.block.OrangeBeardedIrisBlock;
import net.mcreator.naturesexpert.block.MarigoldBlock;
import net.mcreator.naturesexpert.block.LuckyShamrockBlock;
import net.mcreator.naturesexpert.block.LightBlueHyacinthBlock;
import net.mcreator.naturesexpert.block.LightBlueBeardedIrisBlock;
import net.mcreator.naturesexpert.block.LavenderBlock;
import net.mcreator.naturesexpert.block.ForgetMeNotsBlock;
import net.mcreator.naturesexpert.block.CarnationBlock;
import net.mcreator.naturesexpert.block.CallaLilyBlock;
import net.mcreator.naturesexpert.block.BrittlebushBlock;
import net.mcreator.naturesexpert.block.BluePassionFlowerBlock;
import net.mcreator.naturesexpert.block.BlueHyacinthBlock;
import net.mcreator.naturesexpert.block.BlueBeardedIrisBlock;
import net.mcreator.naturesexpert.block.BlackBeardedIrisBlock;
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
	public static final DeferredHolder<Block, Block> BLUE_HYACINTH = REGISTRY.register("blue_hyacinth", () -> new BlueHyacinthBlock());
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_HYACINTH = REGISTRY.register("light_blue_hyacinth", () -> new LightBlueHyacinthBlock());
	public static final DeferredHolder<Block, Block> RED_HYACINTH = REGISTRY.register("red_hyacinth", () -> new RedHyacinthBlock());
	public static final DeferredHolder<Block, Block> PURPLE_HYACINTH = REGISTRY.register("purple_hyacinth", () -> new PurpleHyacinthBlock());
	public static final DeferredHolder<Block, Block> YELLOW_HYACINTH = REGISTRY.register("yellow_hyacinth", () -> new YellowHyacinthBlock());
	public static final DeferredHolder<Block, Block> ORANGE_HYACINTH = REGISTRY.register("orange_hyacinth", () -> new OrangeHyacinthBlock());
	public static final DeferredHolder<Block, Block> PINK_HYACINTH = REGISTRY.register("pink_hyacinth", () -> new PinkHyacinthBlock());
	public static final DeferredHolder<Block, Block> PINK_RHODODENDRON_BUSH = REGISTRY.register("pink_rhododendron_bush", () -> new PinkRhododendronBushBlock());
	public static final DeferredHolder<Block, Block> PURPLE_RHODODENDRON_BUSH = REGISTRY.register("purple_rhododendron_bush", () -> new PurpleRhododendronBushBlock());
	public static final DeferredHolder<Block, Block> ORANGE_RHODODENDRON_BUSH = REGISTRY.register("orange_rhododendron_bush", () -> new OrangeRhododendronBushBlock());
	public static final DeferredHolder<Block, Block> YELLOW_RHODODENDRON_BUSH = REGISTRY.register("yellow_rhododendron_bush", () -> new YellowRhododendronBushBlock());
	public static final DeferredHolder<Block, Block> RED_RHODODENDRON_BUSH = REGISTRY.register("red_rhododendron_bush", () -> new RedRhododendronBushBlock());
	public static final DeferredHolder<Block, Block> WHITE_RHODODENDRON_BUSH = REGISTRY.register("white_rhododendron_bush", () -> new WhiteRhododendronBushBlock());
	public static final DeferredHolder<Block, Block> RED_BEARDED_IRIS = REGISTRY.register("red_bearded_iris", () -> new RedBeardedIrisBlock());
	public static final DeferredHolder<Block, Block> BLUE_BEARDED_IRIS = REGISTRY.register("blue_bearded_iris", () -> new BlueBeardedIrisBlock());
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_BEARDED_IRIS = REGISTRY.register("light_blue_bearded_iris", () -> new LightBlueBeardedIrisBlock());
	public static final DeferredHolder<Block, Block> YELLOW_BEARDED_IRIS = REGISTRY.register("yellow_bearded_iris", () -> new YellowBeardedIrisBlock());
	public static final DeferredHolder<Block, Block> ORANGE_BEARDED_IRIS = REGISTRY.register("orange_bearded_iris", () -> new OrangeBeardedIrisBlock());
	public static final DeferredHolder<Block, Block> PURPLE_BEARDED_IRIS = REGISTRY.register("purple_bearded_iris", () -> new PurpleBeardedIrisBlock());
	public static final DeferredHolder<Block, Block> PINK_BEARDED_IRIS = REGISTRY.register("pink_bearded_iris", () -> new PinkBeardedIrisBlock());
	public static final DeferredHolder<Block, Block> WHITE_BEARDED_IRIS = REGISTRY.register("white_bearded_iris", () -> new WhiteBeardedIrisBlock());
	public static final DeferredHolder<Block, Block> BLACK_BEARDED_IRIS = REGISTRY.register("black_bearded_iris", () -> new BlackBeardedIrisBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
