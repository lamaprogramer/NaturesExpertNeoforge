
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.naturesexpert.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class NaturesExpertModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.RED_HYACINTH.get()), 8, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.ORANGE_HYACINTH.get()), 8, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.YELLOW_HYACINTH.get()), 8, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.LIGHT_BLUE_HYACINTH.get()), 8, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.BLUE_HYACINTH.get()), 8, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.PURPLE_HYACINTH.get()), 8, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.PINK_HYACINTH.get()), 8, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.SHAMROCK.get(), 2), 12, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

				new ItemStack(NaturesExpertModBlocks.LUCKY_SHAMROCK.get()), 4, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.RED_BEARDED_IRIS.get()), 12, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.ORANGE_BEARDED_IRIS.get()), 12, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.YELLOW_BEARDED_IRIS.get()), 12, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.LIGHT_BLUE_BEARDED_IRIS.get()), 12, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.BLUE_BEARDED_IRIS.get()), 12, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.PURPLE_BEARDED_IRIS.get()), 12, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.PINK_BEARDED_IRIS.get()), 12, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.WHITE_BEARDED_IRIS.get()), 12, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD),

				new ItemStack(NaturesExpertModBlocks.BLACK_BEARDED_IRIS.get()), 12, 5, 0.05f));
	}
}
