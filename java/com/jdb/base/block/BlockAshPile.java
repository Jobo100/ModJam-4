package com.jdb.base.block;

import java.util.Random;

import com.jdb.base.BaseMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

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
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundTypeSand);
        this.setTickRandomly(true);
	}

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return BaseMod.items.ash;
    }
	
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        byte b0 = 0;
        float f = 0.0625F;
        return AxisAlignedBB.getAABBPool().getAABB((double)p_149668_2_ + this.minX, (double)p_149668_3_ + this.minY, (double)p_149668_4_ + this.minZ, (double)p_149668_2_ + this.maxX, (double)((float)p_149668_3_ + (float)b0 * f), (double)p_149668_4_ + this.maxZ);
    }
	
    public void setBlockBoundsForItemRender()
    {
        this.func_150089_b();
    }
    
    protected void func_150089_b()
    {
        byte b0 = 0;
        float f = (float)(1 * (1 + b0)) / 16.0F;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
    }
    
    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return super.canPlaceBlockAt(world, x, y, z) && this.canBlockStay(world, x, y, z);
    }
    
    public void onNeighborBlockChange(World world, int x, int y, int z, Block p_149695_5_)
    {
        this.canAshStayOrDrop(world, x, y, z);
    }

    private boolean canAshStayOrDrop(World world, int x, int y, int z)
    {
        if (!this.canBlockStay(world, x, y, z))
        {
            this.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
            world.setBlockToAir(x, y, z);
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public boolean canBlockStay(World world, int x, int y, int z)
    {
        return !world.isAirBlock(x, y - 1, z);
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side)
    {
        return side == 1 ? true : super.shouldSideBeRendered(blockAccess, x, y, z, side);
    }
}
