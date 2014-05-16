package com.jdb.base.block;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCharredWood extends TileEntity
{
		private int entityId = 0;	
		private int timeToEscape = 0;
		private int clicks = 0;
		public boolean carved = false;
		
		public void writeToNBT(NBTTagCompound nbtCompound)
	    {
	        nbtCompound.setInteger("Entity Id", entityId);
	        nbtCompound.setInteger("Time To Escape", timeToEscape);
	        nbtCompound.setInteger("Clicks", clicks);
	        nbtCompound.setBoolean("Carved", carved);
	        super.writeToNBT(nbtCompound);
	    }

	    public void readFromNBT(NBTTagCompound nbtCompound)
	    {
	        entityId = nbtCompound.getInteger("Entity ID");
	        timeToEscape = nbtCompound.getInteger("Time To Escape");
	        clicks = nbtCompound.getInteger("Clicks");
	        carved = nbtCompound.getBoolean("Carved");
	        super.readFromNBT(nbtCompound);
	    }
	    
	    public void setClicks(int clicks)
	    {
	    	this.clicks = clicks;
	    }
	    
	    public int getClicks()
	    {
	    	return clicks;
	    }
	    
	    public void setEntityId(int id)
	    {
	    	entityId = id;
	    }
	    
	    public int getEntityId()
	    {
	    	return entityId;
	    }
	    
	    public void addToEscapeTime(int increase)
	    {
	    	increase *= 20;
	    	int time2 = timeToEscape + increase;
	    	if(time2 > 9600)
	    		time2 = 9600;
	    	timeToEscape = time2;
	    }
	    
	    public void setEscapeTime(int seconds)
	    {
	    	int time2 = seconds * 20;
	    	if(time2 > 9600)
	    		time2 = 9600;
	    	timeToEscape = time2;
	    }
	    
	    public int getEscapeTime()
	    {
	    	return timeToEscape;
	    }
	    
	    public void updateEntity() 
	    {
	    	if(getEntityId() != 0 && timeToEscape != -100)
	    	{
	    		timeToEscape--;
	    		if(timeToEscape <= 0 && timeToEscape > -2)
	    		{
	    			setEntityId(0);
	    		}
	    	}
	    }
}
