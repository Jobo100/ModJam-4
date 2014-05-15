package com.jdb.base.item;

import net.minecraft.item.Item;

public class ModItems 
{
	
	public static Item soulJar;
	public static Item ironCork;
	public static Item stickyIronCork;
	public static Item knife;
	public static Item totem;
	public static Item ash;
	
	public void initItems()
	{
		soulJar = new ItemSoulJar();
		ironCork = new ItemIronCork();
		stickyIronCork = new ItemStickyIronCork();
		knife = new ItemKnife();
		totem = new ItemTotem();
		ash = new ItemAsh();
	}
}
