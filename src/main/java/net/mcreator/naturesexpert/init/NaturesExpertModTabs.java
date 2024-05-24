
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.naturesexpert.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.naturesexpert.NaturesExpertMod;

public class NaturesExpertModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NaturesExpertMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NATURES_EXPERT_CREATIVE_TAB = REGISTRY.register("natures_expert_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.natures_expert.natures_expert_creative_tab")).icon(() -> new ItemStack(NaturesExpertModBlocks.ORANGE_HYACINTH.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NaturesExpertModItems.NATURES_ENCYCLOPEDIA.get());
				tabData.accept(NaturesExpertModBlocks.RED_HYACINTH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.ORANGE_HYACINTH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.YELLOW_HYACINTH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.LIGHT_BLUE_HYACINTH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.BLUE_HYACINTH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PURPLE_HYACINTH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PINK_HYACINTH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.RED_RHODODENDRON_BUSH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.ORANGE_RHODODENDRON_BUSH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.YELLOW_RHODODENDRON_BUSH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PURPLE_RHODODENDRON_BUSH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PINK_RHODODENDRON_BUSH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.WHITE_RHODODENDRON_BUSH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.BLACK_BEARDED_IRIS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.RED_BEARDED_IRIS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.ORANGE_BEARDED_IRIS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.YELLOW_BEARDED_IRIS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.LIGHT_BLUE_BEARDED_IRIS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.BLUE_BEARDED_IRIS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PURPLE_BEARDED_IRIS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PINK_BEARDED_IRIS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.WHITE_BEARDED_IRIS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.BLACK_PANSY.get().asItem());
				tabData.accept(NaturesExpertModBlocks.RED_PANSY.get().asItem());
				tabData.accept(NaturesExpertModBlocks.ORANGE_PANSY.get().asItem());
				tabData.accept(NaturesExpertModBlocks.YELLOW_PANSY.get().asItem());
				tabData.accept(NaturesExpertModBlocks.LIGHT_BLUE_PANSY.get().asItem());
				tabData.accept(NaturesExpertModBlocks.BLUE_PANSY.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PURPLE_PANSY.get().asItem());
				tabData.accept(NaturesExpertModBlocks.MAGENTA_PANSY.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PINK_PANSY.get().asItem());
				tabData.accept(NaturesExpertModBlocks.WHITE_PANSY.get().asItem());
				tabData.accept(NaturesExpertModBlocks.RED_DAHLIA.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PINK_DAHLIA.get().asItem());
				tabData.accept(NaturesExpertModBlocks.RED_BROMELIAD.get().asItem());
				tabData.accept(NaturesExpertModBlocks.ORANGE_BROMELIAD.get().asItem());
				tabData.accept(NaturesExpertModBlocks.YELLOW_BROMELIAD.get().asItem());
				tabData.accept(NaturesExpertModBlocks.RED_HIBISCUS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.ORANGE_HIBISCUS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.YELLOW_HIBISCUS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PINK_HIBISCUS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.RED_CLIVIA.get().asItem());
				tabData.accept(NaturesExpertModBlocks.ORANGE_CLIVIA.get().asItem());
				tabData.accept(NaturesExpertModBlocks.YELLOW_CLIVIA.get().asItem());
				tabData.accept(NaturesExpertModBlocks.RED_PROTEA.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PINK_PROTEA.get().asItem());
				tabData.accept(NaturesExpertModBlocks.WHITE_PROTEA.get().asItem());
				tabData.accept(NaturesExpertModBlocks.YELLOW_CROCUS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.LIGHT_BLUE_CROCUS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PURPLE_CROCUS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.WHITE_CROCUS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.RED_CONEFLOWER.get().asItem());
				tabData.accept(NaturesExpertModBlocks.ORANGE_CONEFLOWER.get().asItem());
				tabData.accept(NaturesExpertModBlocks.YELLOW_CONEFLOWER.get().asItem());
				tabData.accept(NaturesExpertModBlocks.PINK_CONEFLOWER.get().asItem());
				tabData.accept(NaturesExpertModBlocks.WHITE_CONEFLOWER.get().asItem());
				tabData.accept(NaturesExpertModBlocks.AMARYLLIS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.HELICONIA_STRICTA.get().asItem());
				tabData.accept(NaturesExpertModBlocks.BIRD_OF_PARADISE.get().asItem());
				tabData.accept(NaturesExpertModBlocks.MARIGOLD.get().asItem());
				tabData.accept(NaturesExpertModBlocks.BRITTLEBUSH.get().asItem());
				tabData.accept(NaturesExpertModBlocks.BARREL_CACTUS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.SHAMROCK.get().asItem());
				tabData.accept(NaturesExpertModBlocks.LUCKY_SHAMROCK.get().asItem());
				tabData.accept(NaturesExpertModBlocks.FORGET_ME_NOTS.get().asItem());
				tabData.accept(NaturesExpertModBlocks.GREAT_BLUE_LOBELIA.get().asItem());
				tabData.accept(NaturesExpertModBlocks.WILD_INDIGO.get().asItem());
				tabData.accept(NaturesExpertModBlocks.LAVENDER.get().asItem());
				tabData.accept(NaturesExpertModBlocks.FIREWEED.get().asItem());
				tabData.accept(NaturesExpertModBlocks.CARNATION.get().asItem());
				tabData.accept(NaturesExpertModBlocks.ANEMONE.get().asItem());
				tabData.accept(NaturesExpertModBlocks.ASTILBE.get().asItem());
				tabData.accept(NaturesExpertModBlocks.CALLA_LILY.get().asItem());
				tabData.accept(NaturesExpertModBlocks.HEATH_ASTER.get().asItem());
				tabData.accept(NaturesExpertModBlocks.SNOWDROP.get().asItem());
			})

					.build());
}
