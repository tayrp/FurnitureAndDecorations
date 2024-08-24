
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.teesfurniture.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.teesfurniture.block.TARDISDecorationBlock;
import net.mcreator.teesfurniture.TeesFurnitureMod;

public class TeesFurnitureModBlocks {
	public static Block TARDIS_DECORATION;

	public static void load() {
		TARDIS_DECORATION = register("tardis_decoration", new TARDISDecorationBlock());
	}

	public static void clientLoad() {
		TARDISDecorationBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TeesFurnitureMod.MODID, registryName), block);
	}
}
