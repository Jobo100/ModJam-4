package com.jdb.base.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAshPile extends Block 
{

	protected BlockAshPile(Material material) 
	{
		super(material);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
        this.setHardness(0.1F);
        this.setResistance(0.1F);
        this.setLightOpacity(0);
        this.setBlockTextureName("ash");
        this.setBlockName("ash");
	}

    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
}
