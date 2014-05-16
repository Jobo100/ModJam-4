package com.jdb.base.block;

import java.util.Random;

import com.jdb.base.item.ItemAsh;
import com.jdb.base.item.ItemKnife;
import com.jdb.base.item.ItemSoulJar;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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
	}
	
	@Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int what, float are, float these, float questionMark)
    {
    	if(player.inventory.getCurrentItem().getItem() instanceof ItemKnife)
    	{
    		carved = true;
    		return true;
    	}
    	if(player.inventory.getCurrentItem().getItem() instanceof ItemSoulJar && player.inventory.getCurrentItem().stackTagCompound.getInteger("Entity Id") != 0 && carved)
    	{
    		tileEntity.setEntityId(player.inventory.getCurrentItem().stackTagCompound.getInteger("Entity Id"));
    		player.inventory.getCurrentItem().stackTagCompound.setInteger("Entity Id", 0);
    		return true;
    	}
    	if(player.inventory.getCurrentItem().getItem() instanceof ItemAsh && player.inventory.getCurrentItem().stackSize > 2 && tileEntity.getEntityId() != 0)
    	{
    		tileEntity.addToEscapeTime(60);
    		player.inventory.getCurrentItem().stackSize -= 2;
    		return true;
    	}
    	if(player.inventory.getCurrentItem().getItem() instanceof ItemAsh && player.inventory.getCurrentItem().stackSize == 2 && tileEntity.getEntityId() != 0)
    	{
    		player.inventory.getCurrentItem().
    	}
    	if(player.inventory.getCurrentItem().getItem() instanceof ItemStickyIronCork &&)
    	return false;
    }
}
