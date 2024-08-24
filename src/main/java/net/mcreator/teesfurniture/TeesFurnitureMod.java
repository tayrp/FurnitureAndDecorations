/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.teesfurniture;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.teesfurniture.init.TeesFurnitureModTabs;

import net.fabricmc.api.ModInitializer;

public class TeesFurnitureMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "tees_furniture";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing TeesFurnitureMod");

		TeesFurnitureModTabs.load();

	}
}
