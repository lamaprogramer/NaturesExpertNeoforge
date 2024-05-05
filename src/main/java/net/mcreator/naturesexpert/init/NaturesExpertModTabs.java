
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.naturesexpert.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.naturesexpert.NaturesExpertMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NaturesExpertModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NaturesExpertMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(NaturesExpertModBlocks.ANEMONE.get().asItem());
			tabData.accept(NaturesExpertModBlocks.AMARYLLIS.get().asItem());
			tabData.accept(NaturesExpertModBlocks.ASTILBE.get().asItem());
			tabData.accept(NaturesExpertModBlocks.CARNATION.get().asItem());
			tabData.accept(NaturesExpertModBlocks.BLUE_PASSION_FLOWER.get().asItem());
			tabData.accept(NaturesExpertModBlocks.CALLA_LILY.get().asItem());
			tabData.accept(NaturesExpertModBlocks.FORGET_ME_NOTS.get().asItem());
			tabData.accept(NaturesExpertModBlocks.HYACINTH.get().asItem());
			tabData.accept(NaturesExpertModBlocks.LAVENDER.get().asItem());
			tabData.accept(NaturesExpertModBlocks.SHAMROCK.get().asItem());
			tabData.accept(NaturesExpertModBlocks.LUCKY_SHAMROCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(NaturesExpertModItems.NATURES_ENCYCLOPEDIA.get());
		}
	}
}
