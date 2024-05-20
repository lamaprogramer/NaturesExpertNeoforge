
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.naturesexpert.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.naturesexpert.item.NaturesEncyclopediaItem;
import net.mcreator.naturesexpert.NaturesExpertMod;

public class NaturesExpertModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, NaturesExpertMod.MODID);
	public static final DeferredHolder<Item, Item> AMARYLLIS = block(NaturesExpertModBlocks.AMARYLLIS);
	public static final DeferredHolder<Item, Item> ANEMONE = block(NaturesExpertModBlocks.ANEMONE);
	public static final DeferredHolder<Item, Item> ASTILBE = block(NaturesExpertModBlocks.ASTILBE);
	public static final DeferredHolder<Item, Item> CARNATION = block(NaturesExpertModBlocks.CARNATION);
	public static final DeferredHolder<Item, Item> CALLA_LILY = block(NaturesExpertModBlocks.CALLA_LILY);
	public static final DeferredHolder<Item, Item> FORGET_ME_NOTS = block(NaturesExpertModBlocks.FORGET_ME_NOTS);
	public static final DeferredHolder<Item, Item> LAVENDER = block(NaturesExpertModBlocks.LAVENDER);
	public static final DeferredHolder<Item, Item> SHAMROCK = block(NaturesExpertModBlocks.SHAMROCK);
	public static final DeferredHolder<Item, Item> LUCKY_SHAMROCK = block(NaturesExpertModBlocks.LUCKY_SHAMROCK);
	public static final DeferredHolder<Item, Item> NATURES_ENCYCLOPEDIA = REGISTRY.register("natures_encyclopedia", () -> new NaturesEncyclopediaItem());
	public static final DeferredHolder<Item, Item> MARIGOLD = block(NaturesExpertModBlocks.MARIGOLD);
	public static final DeferredHolder<Item, Item> BRITTLEBUSH = block(NaturesExpertModBlocks.BRITTLEBUSH);
	public static final DeferredHolder<Item, Item> BIRD_OF_PARADISE = block(NaturesExpertModBlocks.BIRD_OF_PARADISE);
	public static final DeferredHolder<Item, Item> BLUE_HYACINTH = block(NaturesExpertModBlocks.BLUE_HYACINTH);
	public static final DeferredHolder<Item, Item> LIGHT_BLUE_HYACINTH = block(NaturesExpertModBlocks.LIGHT_BLUE_HYACINTH);
	public static final DeferredHolder<Item, Item> RED_HYACINTH = block(NaturesExpertModBlocks.RED_HYACINTH);
	public static final DeferredHolder<Item, Item> PURPLE_HYACINTH = block(NaturesExpertModBlocks.PURPLE_HYACINTH);
	public static final DeferredHolder<Item, Item> YELLOW_HYACINTH = block(NaturesExpertModBlocks.YELLOW_HYACINTH);
	public static final DeferredHolder<Item, Item> ORANGE_HYACINTH = block(NaturesExpertModBlocks.ORANGE_HYACINTH);
	public static final DeferredHolder<Item, Item> PINK_HYACINTH = block(NaturesExpertModBlocks.PINK_HYACINTH);
	public static final DeferredHolder<Item, Item> PINK_RHODODENDRON_BUSH = doubleBlock(NaturesExpertModBlocks.PINK_RHODODENDRON_BUSH);
	public static final DeferredHolder<Item, Item> PURPLE_RHODODENDRON_BUSH = doubleBlock(NaturesExpertModBlocks.PURPLE_RHODODENDRON_BUSH);
	public static final DeferredHolder<Item, Item> ORANGE_RHODODENDRON_BUSH = doubleBlock(NaturesExpertModBlocks.ORANGE_RHODODENDRON_BUSH);
	public static final DeferredHolder<Item, Item> YELLOW_RHODODENDRON_BUSH = doubleBlock(NaturesExpertModBlocks.YELLOW_RHODODENDRON_BUSH);
	public static final DeferredHolder<Item, Item> RED_RHODODENDRON_BUSH = doubleBlock(NaturesExpertModBlocks.RED_RHODODENDRON_BUSH);
	public static final DeferredHolder<Item, Item> WHITE_RHODODENDRON_BUSH = doubleBlock(NaturesExpertModBlocks.WHITE_RHODODENDRON_BUSH);
	public static final DeferredHolder<Item, Item> RED_BEARDED_IRIS = block(NaturesExpertModBlocks.RED_BEARDED_IRIS);
	public static final DeferredHolder<Item, Item> BLUE_BEARDED_IRIS = block(NaturesExpertModBlocks.BLUE_BEARDED_IRIS);
	public static final DeferredHolder<Item, Item> LIGHT_BLUE_BEARDED_IRIS = block(NaturesExpertModBlocks.LIGHT_BLUE_BEARDED_IRIS);
	public static final DeferredHolder<Item, Item> YELLOW_BEARDED_IRIS = block(NaturesExpertModBlocks.YELLOW_BEARDED_IRIS);
	public static final DeferredHolder<Item, Item> ORANGE_BEARDED_IRIS = block(NaturesExpertModBlocks.ORANGE_BEARDED_IRIS);
	public static final DeferredHolder<Item, Item> PURPLE_BEARDED_IRIS = block(NaturesExpertModBlocks.PURPLE_BEARDED_IRIS);
	public static final DeferredHolder<Item, Item> PINK_BEARDED_IRIS = block(NaturesExpertModBlocks.PINK_BEARDED_IRIS);
	public static final DeferredHolder<Item, Item> WHITE_BEARDED_IRIS = block(NaturesExpertModBlocks.WHITE_BEARDED_IRIS);
	public static final DeferredHolder<Item, Item> BLACK_BEARDED_IRIS = block(NaturesExpertModBlocks.BLACK_BEARDED_IRIS);
	public static final DeferredHolder<Item, Item> HEATH_ASTER = block(NaturesExpertModBlocks.HEATH_ASTER);
	public static final DeferredHolder<Item, Item> GREAT_BLUE_LOBELIA = block(NaturesExpertModBlocks.GREAT_BLUE_LOBELIA);
	public static final DeferredHolder<Item, Item> BARREL_CACTUS = block(NaturesExpertModBlocks.BARREL_CACTUS);
	public static final DeferredHolder<Item, Item> HELICONIA_STRICTA = block(NaturesExpertModBlocks.HELICONIA_STRICTA);
	public static final DeferredHolder<Item, Item> RED_PANSY = block(NaturesExpertModBlocks.RED_PANSY);
	public static final DeferredHolder<Item, Item> PINK_PANSY = block(NaturesExpertModBlocks.PINK_PANSY);
	public static final DeferredHolder<Item, Item> BLACK_PANSY = block(NaturesExpertModBlocks.BLACK_PANSY);
	public static final DeferredHolder<Item, Item> ORANGE_PANSY = block(NaturesExpertModBlocks.ORANGE_PANSY);
	public static final DeferredHolder<Item, Item> YELLOW_PANSY = block(NaturesExpertModBlocks.YELLOW_PANSY);
	public static final DeferredHolder<Item, Item> LIGHT_BLUE_PANSY = block(NaturesExpertModBlocks.LIGHT_BLUE_PANSY);
	public static final DeferredHolder<Item, Item> BLUE_PANSY = block(NaturesExpertModBlocks.BLUE_PANSY);
	public static final DeferredHolder<Item, Item> MAGENTA_PANSY = block(NaturesExpertModBlocks.MAGENTA_PANSY);
	public static final DeferredHolder<Item, Item> PURPLE_PANSY = block(NaturesExpertModBlocks.PURPLE_PANSY);
	public static final DeferredHolder<Item, Item> WHITE_PANSY = block(NaturesExpertModBlocks.WHITE_PANSY);
	public static final DeferredHolder<Item, Item> PINK_DAHLIA = block(NaturesExpertModBlocks.PINK_DAHLIA);
	public static final DeferredHolder<Item, Item> RED_DAHLIA = block(NaturesExpertModBlocks.RED_DAHLIA);
	public static final DeferredHolder<Item, Item> RED_BROMELIAD = block(NaturesExpertModBlocks.RED_BROMELIAD);
	public static final DeferredHolder<Item, Item> ORANGE_BROMELIAD = block(NaturesExpertModBlocks.ORANGE_BROMELIAD);
	public static final DeferredHolder<Item, Item> YELLOW_BROMELIAD = block(NaturesExpertModBlocks.YELLOW_BROMELIAD);
	public static final DeferredHolder<Item, Item> RED_HIBISCUS = block(NaturesExpertModBlocks.RED_HIBISCUS);
	public static final DeferredHolder<Item, Item> RED_CLIVIA = block(NaturesExpertModBlocks.RED_CLIVIA);
	public static final DeferredHolder<Item, Item> ORANGE_HIBISCUS = block(NaturesExpertModBlocks.ORANGE_HIBISCUS);
	public static final DeferredHolder<Item, Item> YELLOW_HIBISCUS = block(NaturesExpertModBlocks.YELLOW_HIBISCUS);
	public static final DeferredHolder<Item, Item> PINK_HIBISCUS = block(NaturesExpertModBlocks.PINK_HIBISCUS);
	public static final DeferredHolder<Item, Item> ORANGE_CLIVIA = block(NaturesExpertModBlocks.ORANGE_CLIVIA);
	public static final DeferredHolder<Item, Item> YELLOW_CLIVIA = block(NaturesExpertModBlocks.YELLOW_CLIVIA);
	public static final DeferredHolder<Item, Item> PINK_PROTEA = block(NaturesExpertModBlocks.PINK_PROTEA);
	public static final DeferredHolder<Item, Item> WHITE_PROTEA = block(NaturesExpertModBlocks.WHITE_PROTEA);
	public static final DeferredHolder<Item, Item> RED_PROTEA = block(NaturesExpertModBlocks.RED_PROTEA);

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredHolder<Item, Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
