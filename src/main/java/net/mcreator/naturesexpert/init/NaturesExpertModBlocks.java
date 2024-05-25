
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
import net.mcreator.naturesexpert.block.YellowHibiscusBlock;
import net.mcreator.naturesexpert.block.YellowCrocusBlock;
import net.mcreator.naturesexpert.block.YellowConeflowerBlock;
import net.mcreator.naturesexpert.block.YellowCliviaBlock;
import net.mcreator.naturesexpert.block.YellowBromeliadBlock;
import net.mcreator.naturesexpert.block.YellowBeardedIrisBlock;
import net.mcreator.naturesexpert.block.WildIndigoBlock;
import net.mcreator.naturesexpert.block.WhiteRhododendronBushBlock;
import net.mcreator.naturesexpert.block.WhiteProteaBlock;
import net.mcreator.naturesexpert.block.WhitePansyBlock;
import net.mcreator.naturesexpert.block.WhiteCrocusBlock;
import net.mcreator.naturesexpert.block.WhiteConeflowerBlock;
import net.mcreator.naturesexpert.block.WhiteBeardedIrisBlock;
import net.mcreator.naturesexpert.block.SnowdropBlock;
import net.mcreator.naturesexpert.block.ShamrockBlock;
import net.mcreator.naturesexpert.block.SavannaBlazingStarBlock;
import net.mcreator.naturesexpert.block.RedRhododendronBushBlock;
import net.mcreator.naturesexpert.block.RedProteaBlock;
import net.mcreator.naturesexpert.block.RedPansyBlock;
import net.mcreator.naturesexpert.block.RedHyacinthBlock;
import net.mcreator.naturesexpert.block.RedHibiscusBlock;
import net.mcreator.naturesexpert.block.RedDahliaBlock;
import net.mcreator.naturesexpert.block.RedConeflowerBlock;
import net.mcreator.naturesexpert.block.RedCliviaBlock;
import net.mcreator.naturesexpert.block.RedBromeliadBlock;
import net.mcreator.naturesexpert.block.RedBeardedIrisBlock;
import net.mcreator.naturesexpert.block.PurpleRhododendronBushBlock;
import net.mcreator.naturesexpert.block.PurplePansyBlock;
import net.mcreator.naturesexpert.block.PurpleHyacinthBlock;
import net.mcreator.naturesexpert.block.PurpleCrocusBlock;
import net.mcreator.naturesexpert.block.PurpleBeardedIrisBlock;
import net.mcreator.naturesexpert.block.PinkRhododendronBushBlock;
import net.mcreator.naturesexpert.block.PinkProteaBlock;
import net.mcreator.naturesexpert.block.PinkPansyBlock;
import net.mcreator.naturesexpert.block.PinkHyacinthBlock;
import net.mcreator.naturesexpert.block.PinkHibiscusBlock;
import net.mcreator.naturesexpert.block.PinkDahliaBlock;
import net.mcreator.naturesexpert.block.PinkConeflowerBlock;
import net.mcreator.naturesexpert.block.PinkBeardedIrisBlock;
import net.mcreator.naturesexpert.block.OrangeRhododendronBushBlock;
import net.mcreator.naturesexpert.block.OrangePansyBlock;
import net.mcreator.naturesexpert.block.OrangeHyacinthBlock;
import net.mcreator.naturesexpert.block.OrangeHibiscusBlock;
import net.mcreator.naturesexpert.block.OrangeConeflowerBlock;
import net.mcreator.naturesexpert.block.OrangeCliviaBlock;
import net.mcreator.naturesexpert.block.OrangeBromeliadBlock;
import net.mcreator.naturesexpert.block.OrangeBeardedIrisBlock;
import net.mcreator.naturesexpert.block.MarigoldBlock;
import net.mcreator.naturesexpert.block.MagentaPansyBlock;
import net.mcreator.naturesexpert.block.LuckyShamrockBlock;
import net.mcreator.naturesexpert.block.LightBluePansyBlock;
import net.mcreator.naturesexpert.block.LightBlueHyacinthBlock;
import net.mcreator.naturesexpert.block.LightBlueCrocusBlock;
import net.mcreator.naturesexpert.block.LightBlueBeardedIrisBlock;
import net.mcreator.naturesexpert.block.LavenderBlock;
import net.mcreator.naturesexpert.block.HeliconiaStrictaBlock;
import net.mcreator.naturesexpert.block.HeathAsterBlock;
import net.mcreator.naturesexpert.block.GreatBlueLobeliaBlock;
import net.mcreator.naturesexpert.block.ForgetMeNotsBlock;
import net.mcreator.naturesexpert.block.FireweedBlock;
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
	public static final DeferredHolder<Block, Block> PINK_DAHLIA = REGISTRY.register("pink_dahlia", () -> new PinkDahliaBlock());
	public static final DeferredHolder<Block, Block> RED_DAHLIA = REGISTRY.register("red_dahlia", () -> new RedDahliaBlock());
	public static final DeferredHolder<Block, Block> RED_BROMELIAD = REGISTRY.register("red_bromeliad", () -> new RedBromeliadBlock());
	public static final DeferredHolder<Block, Block> ORANGE_BROMELIAD = REGISTRY.register("orange_bromeliad", () -> new OrangeBromeliadBlock());
	public static final DeferredHolder<Block, Block> YELLOW_BROMELIAD = REGISTRY.register("yellow_bromeliad", () -> new YellowBromeliadBlock());
	public static final DeferredHolder<Block, Block> RED_HIBISCUS = REGISTRY.register("red_hibiscus", () -> new RedHibiscusBlock());
	public static final DeferredHolder<Block, Block> RED_CLIVIA = REGISTRY.register("red_clivia", () -> new RedCliviaBlock());
	public static final DeferredHolder<Block, Block> ORANGE_HIBISCUS = REGISTRY.register("orange_hibiscus", () -> new OrangeHibiscusBlock());
	public static final DeferredHolder<Block, Block> YELLOW_HIBISCUS = REGISTRY.register("yellow_hibiscus", () -> new YellowHibiscusBlock());
	public static final DeferredHolder<Block, Block> PINK_HIBISCUS = REGISTRY.register("pink_hibiscus", () -> new PinkHibiscusBlock());
	public static final DeferredHolder<Block, Block> ORANGE_CLIVIA = REGISTRY.register("orange_clivia", () -> new OrangeCliviaBlock());
	public static final DeferredHolder<Block, Block> YELLOW_CLIVIA = REGISTRY.register("yellow_clivia", () -> new YellowCliviaBlock());
	public static final DeferredHolder<Block, Block> PINK_PROTEA = REGISTRY.register("pink_protea", () -> new PinkProteaBlock());
	public static final DeferredHolder<Block, Block> WHITE_PROTEA = REGISTRY.register("white_protea", () -> new WhiteProteaBlock());
	public static final DeferredHolder<Block, Block> RED_PROTEA = REGISTRY.register("red_protea", () -> new RedProteaBlock());
	public static final DeferredHolder<Block, Block> FIREWEED = REGISTRY.register("fireweed", () -> new FireweedBlock());
	public static final DeferredHolder<Block, Block> PURPLE_CROCUS = REGISTRY.register("purple_crocus", () -> new PurpleCrocusBlock());
	public static final DeferredHolder<Block, Block> SNOWDROP = REGISTRY.register("snowdrop", () -> new SnowdropBlock());
	public static final DeferredHolder<Block, Block> WHITE_CROCUS = REGISTRY.register("white_crocus", () -> new WhiteCrocusBlock());
	public static final DeferredHolder<Block, Block> YELLOW_CROCUS = REGISTRY.register("yellow_crocus", () -> new YellowCrocusBlock());
	public static final DeferredHolder<Block, Block> LIGHT_BLUE_CROCUS = REGISTRY.register("light_blue_crocus", () -> new LightBlueCrocusBlock());
	public static final DeferredHolder<Block, Block> WILD_INDIGO = REGISTRY.register("wild_indigo", () -> new WildIndigoBlock());
	public static final DeferredHolder<Block, Block> RED_CONEFLOWER = REGISTRY.register("red_coneflower", () -> new RedConeflowerBlock());
	public static final DeferredHolder<Block, Block> ORANGE_CONEFLOWER = REGISTRY.register("orange_coneflower", () -> new OrangeConeflowerBlock());
	public static final DeferredHolder<Block, Block> PINK_CONEFLOWER = REGISTRY.register("pink_coneflower", () -> new PinkConeflowerBlock());
	public static final DeferredHolder<Block, Block> YELLOW_CONEFLOWER = REGISTRY.register("yellow_coneflower", () -> new YellowConeflowerBlock());
	public static final DeferredHolder<Block, Block> WHITE_CONEFLOWER = REGISTRY.register("white_coneflower", () -> new WhiteConeflowerBlock());
	public static final DeferredHolder<Block, Block> SAVANNA_BLAZING_STAR = REGISTRY.register("savanna_blazing_star", () -> new SavannaBlazingStarBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			LuckyShamrockBlock.blockColorLoad(event);
		}
	}
}
