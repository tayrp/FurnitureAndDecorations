
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.teesfurniture.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.teesfurniture.TeesFurnitureMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class TeesFurnitureModTabs {
	public static ResourceKey<CreativeModeTab> TAB_FURNITURE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(TeesFurnitureMod.MODID, "furniture"));
	public static ResourceKey<CreativeModeTab> TAB_DECORATIONS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(TeesFurnitureMod.MODID, "decorations"));
	public static ResourceKey<CreativeModeTab> TAB_TESTING_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(TeesFurnitureMod.MODID, "testing_tab"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_FURNITURE, FabricItemGroup.builder().title(Component.translatable("item_group." + TeesFurnitureMod.MODID + ".furniture")).icon(() -> new ItemStack(Blocks.QUARTZ_STAIRS)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_DECORATIONS, FabricItemGroup.builder().title(Component.translatable("item_group." + TeesFurnitureMod.MODID + ".decorations")).icon(() -> new ItemStack(Blocks.LANTERN)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_TESTING_TAB, FabricItemGroup.builder().title(Component.translatable("item_group." + TeesFurnitureMod.MODID + ".testing_tab")).icon(() -> new ItemStack(Blocks.TNT)).build());
	}
}
