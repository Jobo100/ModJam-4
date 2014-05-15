package com.jdb.base.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCharredWoodSlab extends BlockSlab
{

	public BlockCharredWoodSlab(boolean p_i45410_1_, Material material)
	{
		super(p_i45410_1_, material);
		this.setBlockTextureName("charred wood");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeWood);
		this.setBlockName("Charred Wood");
		this.setHardness(2.0F);
		this.setResistance(7.0F);
	}

	@Override
	public String func_150002_b(int var1)
	{
		return super.getUnlocalizedName();
	}

}
