
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.naturesexpert.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
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
	public static final DeferredHolder<Item, Item> BLUE_PASSION_FLOWER = block(NaturesExpertModBlocks.BLUE_PASSION_FLOWER);
	public static final DeferredHolder<Item, Item> CALLA_LILY = block(NaturesExpertModBlocks.CALLA_LILY);
	public static final DeferredHolder<Item, Item> FORGET_ME_NOTS = block(NaturesExpertModBlocks.FORGET_ME_NOTS);
	public static final DeferredHolder<Item, Item> HYACINTH = block(NaturesExpertModBlocks.HYACINTH);
	public static final DeferredHolder<Item, Item> LAVENDER = block(NaturesExpertModBlocks.LAVENDER);
	public static final DeferredHolder<Item, Item> SHAMROCK = block(NaturesExpertModBlocks.SHAMROCK);
	public static final DeferredHolder<Item, Item> LUCKY_SHAMROCK = block(NaturesExpertModBlocks.LUCKY_SHAMROCK);
	public static final DeferredHolder<Item, Item> NATURES_ENCYCLOPEDIA = REGISTRY.register("natures_encyclopedia", () -> new NaturesEncyclopediaItem());
	public static final DeferredHolder<Item, Item> MARIGOLD = block(NaturesExpertModBlocks.MARIGOLD);

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
