package com.jdb.base.block;

import java.util.Random;

import com.jdb.base.BaseMod;
import com.jdb.base.item.ItemAsh;
import com.jdb.base.item.ItemKnife;
import com.jdb.base.item.ItemSoulJar;
import com.jdb.base.item.ItemStickyIronCork;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCharredWood extends BlockContainer {

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
    		tileEntity.carved = true;
    		return true;
    	}
    	if(player.inventory.getCurrentItem().getItem() instanceof ItemSoulJar && player.inventory.getCurrentItem().stackTagCompound.getInteger("Entity Id") != 0 && tileEntity.carved)
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
    		tileEntity.addToEscapeTime(60);
    		player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
    		return true;
    	}
    	if(player.inventory.getCurrentItem().getItem() instanceof ItemStickyIronCork && tileEntity.getEscapeTime() >= 7200)
    	{
    		tileEntity.setEscapeTime(-5);
    		player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
    		return true;
    	}
    	if(player.inventory.getCurrentItem().getItem() instanceof ItemKnife && tileEntity.getEscapeTime() == -100)
    	{
    		tileEntity.setClicks(tileEntity.getClicks() + 1);
    		if(tileEntity.getClicks() == 7)
    		{
    			ItemStack itemStack = new ItemStack(BaseMod.items.totem, 1);
    			itemStack.stackTagCompound.setInteger("Entity Id", tileEntity.getEntityId());
    			EntityItem item = new EntityItem(world, x, y, z, itemStack);
    			world.spawnEntityInWorld(item);
    		}
    		return true;
    	}
    	
    	return false;
    }

	@Override
	public TileEntity createNewTileEntity(World var1, int var2)
	{
		tileEntity = new TileEntityCharredWood();
		return tileEntity;
	}
}
