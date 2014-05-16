package com.jdb.base.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{

	public static Block charredWood;
	public static Block charredWoodSlab;
	public static Block ashPile;
	
	
	public void initBlocks()
	{
		charredWood = new BlockCharredWood(Material.wood);
		charredWoodSlab = new BlockCharredWoodSlab(false, Material.wood);
		ashPile = new BlockAshPile(Material.sand);
	}
	
	public void registerBlocks()
	{
		GameRegistry.registerBlock(ashPile, "ashPile");
		GameRegistry.registerBlock(charredWood, "charredWood");
		GameRegistry.registerBlock(charredWoodSlab, "charredWoodSlab");
	}
}
