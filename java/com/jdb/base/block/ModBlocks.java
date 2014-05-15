package com.jdb.base.block;

import net.minecraft.block.Block;

public class ModBlocks
{

	public static Block charredWood;
	public static Block charredWoodSlab;
	
	
	public void initBlocks()
	{
		charredWood = new BlockCharredWood();
		charredWood = new BlockCharredWoodSlab();
	}
}
