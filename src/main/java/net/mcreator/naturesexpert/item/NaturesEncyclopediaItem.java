
package net.mcreator.naturesexpert.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import vazkii.patchouli.api.PatchouliAPI;

public class NaturesEncyclopediaItem extends Item {
	public NaturesEncyclopediaItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);

		if (entity instanceof ServerPlayer serverPlayer) {
			PatchouliAPI.get().openBookGUI(serverPlayer, BuiltInRegistries.ITEM.getKey(this));
			entity.playSound(SoundEvents.BOOK_PAGE_TURN, 1F, (float) (0.7 + Math.random() * 0.4));
		}

		return ar;
	}
}
