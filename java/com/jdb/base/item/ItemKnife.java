package com.jdb.base.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemKnife extends Item 
{

	public ItemKnife()
	{
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxStackSize(1);
		this.setTextureName("knife");
		this.setUnlocalizedName("knife");
	}
	
}
