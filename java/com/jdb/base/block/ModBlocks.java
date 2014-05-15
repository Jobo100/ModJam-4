package com.jdb.base.block;

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
}
