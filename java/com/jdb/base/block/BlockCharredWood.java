package com.jdb.base.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCharredWood extends Block {

	protected BlockCharredWood(Material material) 
	{
		super(material);
		this.setBlockTextureName("charred wood");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeWood);
		this.setBlockName("charredWood");
		this.setHardness(2.0F);
		this.setResistance(7.0F);
	}

}
