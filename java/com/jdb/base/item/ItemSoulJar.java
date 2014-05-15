package com.jdb.base.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSoulJar extends Item 
{
	public int soulInside;
	
	public ItemSoulJar()
	{
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setTextureName("jar");
		this.setUnlocalizedName("soulJar");
	}
	
	public boolean hasSoul()
	{
		if(soulInside != 0)
		{
			return true;
		}
		return false;
	}
}
