package com.jdb.base.events;

import java.util.Random;

import com.jdb.base.item.ItemSoulJar;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class EventHandler 
{
	Random rand = new Random();
	
	@SubscribeEvent
	public void OnEntityDeath(AttackEntityEvent event)
	{
		if(event.target instanceof EntityLiving)
		{
			EntityLiving entity = (EntityLiving) event.target;
			if(entity.getHealth() == 0)
			{
				int size = event.entityPlayer.inventory.mainInventory.length;
				for(int i = 0; i < size; i++)
				{
					ItemStack item = event.entityPlayer.inventory.mainInventory[i];
					if(item.getItem() instanceof ItemSoulJar)
					{
						if(rand.nextInt(50) == 1)
						{
							item.stackTagCompound.setInteger("Entity Id", entity.getEntityId());
						}
					}
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onItemCrafted(ItemCraftedEvent event)
	{
		if(event.crafting.getItem() instanceof ItemSoulJar)
		{
			event.crafting.stackTagCompound.setInteger("Entity Id", -1);
		}
	}
	
}
