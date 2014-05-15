package com.jdb.base.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIronCork extends Item 
{
	public ItemIronCork()
	{
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setTextureName("corkNoStick");
		this.setUnlocalizedName("corkNoStick");
	}
}
