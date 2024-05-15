
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.naturesexpert.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.naturesexpert.block.YellowRhododendronBushBlock;
import net.mcreator.naturesexpert.block.YellowPansyBlock;
import net.mcreator.naturesexpert.block.YellowHyacinthBlock;
import net.mcreator.naturesexpert.block.YellowBeardedIrisBlock;
import net.mcreator.naturesexpert.block.WhiteRhododendronBushBlock;
import net.mcreator.naturesexpert.block.WhitePansyBlock;
import net.mcreator.naturesexpert.block.WhiteBeardedIrisBlock;
import net.mcreator.naturesexpert.block.ShamrockBlock;
import net.mcreator.naturesexpert.block.RedRhododendronBushBlock;
import net.mcreator.naturesexpert.block.RedPansyBlock;
import net.mcreator.naturesexpert.block.RedHyacinthBlock;
import net.mcreator.naturesexpert.block.RedBeardedIrisBlock;
import net.mcreator.naturesexpert.block.PurpleRhododendronBushBlock;
import net.mcreator.naturesexpert.block.PurplePansyBlock;
import net.mcreator.naturesexpert.block.PurpleHyacinthBlock;
import net.mcreator.naturesexpert.block.PurpleBeardedIrisBlock;
import net.mcreator.naturesexpert.block.PinkRhododendronBushBlock;
import net.mcreator.naturesexpert.block.PinkPansyBlock;
import net.mcreator.naturesexpert.block.PinkHyacinthBlock;
import net.mcreator.naturesexpert.block.PinkBeardedIrisBlock;
import net.mcreator.naturesexpert.block.OrangeRhododendronBushBlock;
import net.mcreator.naturesexpert.block.OrangePansyBlock;
import net.mcreator.naturesexpert.block.OrangeHyacinthBlock;
import net.mcreator.naturesexpert.block.OrangeBeardedIrisBlock;
import net.mcreator.naturesexpert.block.MarigoldBlock;
import net.mcreator.naturesexpert.block.MagentaPansyBlock;
import net.mcreator.naturesexpert.block.LuckyShamrockBlock;
import net.mcreator.naturesexpert.block.LightBluePansyBlock;
import net.mcreator.naturesexpert.block.LightBlueHyacinthBlock;
import net.mcreator.naturesexpert.block.LightBlueBeardedIrisBlock;
import net.mcreator.naturesexpert.block.LavenderBlock;
import net.mcreator.naturesexpert.block.HeliconiaStrictaBlock;
import net.mcreator.naturesexpert.block.HeathAsterBlock;
import net.mcreator.naturesexpert.block.GreatBlueLobeliaBlock;
import net.mcreator.naturesexpert.block.ForgetMeNotsBlock;
import net.mcreator.naturesexpert.block.CarnationBlock;
import net.mcreator.naturesexpert.block.CallaLilyBlock;
import net.mcreator.naturesexpert.block.BrittlebushBlock;
import net.mcreator.naturesexpert.block.BluePansyBlock;
import net.mcreator.naturesexpert.block.BlueHyacinthBlock;
import net.mcreator.naturesexpert.block.BlueBeardedIrisBlock;
import net.mcreator.naturesexpert.block.BlackPansyBlock;
import net.mcreator.naturesexpert.block.BlackBeardedIrisBlock;
import net.mcreator.naturesexpert.block.BirdOfParadiseBlock;
import net.mcreator.naturesexpert.block.BarrelCactusBlock;
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
	public static final DeferredHolder<Block, Block> HEATH_ASTER = REGISTRY.register("heath_aster", () -> new HeathAsterBlock());
	public static final DeferredHolder<Block, Block> GREAT_BLUE_LOBELIA = REGISTRY.register("great_blue_lobelia", () -> new GreatBlueLobeliaBlock());
	public static final DeferredHolder<Block, Block> BARREL_CACTUS = REGISTRY.register("barrel_cactus", () -> new BarrelCactusBlock());
	public static final DeferredHolder<Block, Block> HELICONIA_STRICTA = REGISTRY.register("heliconia_stricta", () -> new HeliconiaStrictaBlock());
	public static final DeferredHolder<Block, Block> RED_PANSY = REGISTRY.register("red_pansy", () -> new RedPansyBlock());
	public static final DeferredHolder<Block, Block> PINK_PANSY = REGISTRY.register("pink_pansy", () -> new PinkPansyBlock());
	public static final DeferredHolder<Block, Block> BLACK_PANSY = REGISTRY.register("black_pansy", () -> new BlackPansyBlock());
	public static final DeferredHolder<Block, Block> ORANGE_PANSY = REGISTRY.register("orange_pansy", () -> new OrangePansyBlock());
	public static final DeferredHolder<Block, Block> YELLOW_PANSY = REGISTRY.register("yellow_pansy", () -> new YellowPansyBlock());
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_PANSY = REGISTRY.register("light_blue_pansy", () -> new LightBluePansyBlock());
	public static final DeferredHolder<Block, Block> BLUE_PANSY = REGISTRY.register("blue_pansy", () -> new BluePansyBlock());
	public static final DeferredHolder<Block, Block> MAGENTA_PANSY = REGISTRY.register("magenta_pansy", () -> new MagentaPansyBlock());
	public static final DeferredHolder<Block, Block> PURPLE_PANSY = REGISTRY.register("purple_pansy", () -> new PurplePansyBlock());
	public static final DeferredHolder<Block, Block> WHITE_PANSY = REGISTRY.register("white_pansy", () -> new WhitePansyBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			ShamrockBlock.blockColorLoad(event);
			LuckyShamrockBlock.blockColorLoad(event);
		}
	}
}
