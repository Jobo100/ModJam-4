package com.jdb.base.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class EventHandler 
{

	@SubscribeEvent
	public void OnEntityDeath(LivingDeathEvent event)
	{
		if(event.source.getSourceOfDamage() instanceof EntityPlayer)
		{
			event.
			
		}
	}
	
}
