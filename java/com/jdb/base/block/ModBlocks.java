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
		charredWood = new BlockCharredWood();
		charredWoodSlab = new BlockCharredWoodSlab(true, Material.wood);
		ashPile = new BlockAshPile();
	}
}
