package net.pinne.orangeoreomod.init;

import net.pinne.orangeoreomod.OreoModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class OreoModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OreoModMod.MODID);
	public static final RegistryObject<CreativeModeTab> OREO_MOD_TAB = REGISTRY.register("oreo_mod_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.oreo_mod.oreo_mod_tab")).icon(() -> new ItemStack(OreoModModItems.ORANGE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OreoModModItems.OREO_COOKIE.get());
				tabData.accept(OreoModModItems.OREO.get());
				tabData.accept(OreoModModItems.OREO_CREAM.get());
				tabData.accept(OreoModModItems.OREO_IN_MILK.get());
				tabData.accept(OreoModModItems.ORANGE.get());
				tabData.accept(OreoModModItems.ORANGE_OREO.get());
			}).withSearchBar().build());
}
