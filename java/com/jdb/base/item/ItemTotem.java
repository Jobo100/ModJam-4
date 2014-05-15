package com.jdb.base.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTotem extends Item 
{

	public ItemTotem()
	{
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setTextureName("totem");
		this.setUnlocalizedName("totem");
	}
	
}
