package net.pinne.orangeoreomod.init;

import net.pinne.orangeoreomod.item.OreoItem;
import net.pinne.orangeoreomod.item.OreoInMilkItem;
import net.pinne.orangeoreomod.item.OreoCreamItem;
import net.pinne.orangeoreomod.item.OreoCookieItem;
import net.pinne.orangeoreomod.item.OrangeOreoItem;
import net.pinne.orangeoreomod.item.OrangeItem;
import net.pinne.orangeoreomod.OreoModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class OreoModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OreoModMod.MODID);
	public static final RegistryObject<Item> OREO_COOKIE = REGISTRY.register("oreo_cookie", () -> new OreoCookieItem());
	public static final RegistryObject<Item> OREO = REGISTRY.register("oreo", () -> new OreoItem());
	public static final RegistryObject<Item> OREO_CREAM = REGISTRY.register("oreo_cream", () -> new OreoCreamItem());
	public static final RegistryObject<Item> OREO_IN_MILK = REGISTRY.register("oreo_in_milk", () -> new OreoInMilkItem());
	public static final RegistryObject<Item> ORANGE = REGISTRY.register("orange", () -> new OrangeItem());
	public static final RegistryObject<Item> ORANGE_OREO = REGISTRY.register("orange_oreo", () -> new OrangeOreoItem());
}
