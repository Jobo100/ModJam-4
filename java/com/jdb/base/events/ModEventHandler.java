package com.jdb.base.events;

import java.util.Random;

import com.jdb.base.item.ItemSoulJar;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class ModEventHandler 
{
	Random rand = new Random();
	
	@SubscribeEvent
	public void OnEntityDeath(LivingDeathEvent event)
	{
		if(event.source.getSourceOfDamage() instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.source.getSourceOfDamage();
			int size = player.inventory.mainInventory.length;
			for(int i = 0; i < size; i++)
			{
				ItemStack itemStack = player.inventory.mainInventory[i];
				if(itemStack != null)
				{
					System.out.println(itemStack.getItem());
					if(itemStack.stackTagCompound == null)
					{
						if(itemStack.getItem() instanceof ItemSoulJar)
						{
							//if(rand.nextInt(50) == 1)
								itemStack.setTagCompound(new NBTTagCompound());
								itemStack.stackTagCompound.setInteger("Entity Id", event.entityLiving.getEntityId());
								return;
						}
					}
				}
			}
		}
	}
	
}
