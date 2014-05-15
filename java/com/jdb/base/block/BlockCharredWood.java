package com.jdb.base.block;

import com.jdb.base.item.ItemKnife;
import com.jdb.base.item.ItemSoulJar;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCharredWood extends Block {

	public boolean carved = false;
	private TileEntityCharredWood tileEntity;
	
	protected BlockCharredWood(Material material) 
	{
		super(material);
		this.setBlockTextureName("charred wood");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeWood);
		this.setBlockName("charredWood");
		this.setHardness(2.0F);
		this.setResistance(7.0F);
		this.setTickRandomly(true);
	}
	
	@Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int what, float are, float these, float questionMark)
    {
    	if(player.inventory.getCurrentItem().getItem() instanceof ItemKnife)
    	{
    		carved = true;
    		return true;
    	}
    	if(player.inventory.getCurrentItem().getItem() instanceof ItemSoulJar && player.inventory.getCurrentItem().stackTagCompound.getInteger("Entity Id") != 0)
    	{
    		tileEntity.setEntityId(player.inventory.getCurrentItem().stackTagCompound.getInteger("Entity Id"));
    		return true;
    	}
        return false;
    }
    
    public TileEntity createTileEntity(World world, int metadata)
    {
    	tileEntity = new TileEntityCharredWood();
    	return tileEntity;
    }
}
