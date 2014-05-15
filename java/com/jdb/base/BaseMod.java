package com.jdb.base;

import com.jdb.base.block.ModBlocks;
import com.jdb.base.item.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BaseMod.MODID, name = BaseMod.NAME, version = BaseMod.VERSION)
public class BaseMod 
{

	public static final String MODID = "Totem";
	public static final String NAME = MODID;
	public static final String VERSION = "1.0";
	
	public static final ModBlocks blocks = new ModBlocks();
	public static final ModItems items = new ModItems();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		blocks.initBlocks();
		items.initItems();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
