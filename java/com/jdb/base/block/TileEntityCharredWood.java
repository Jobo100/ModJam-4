package com.jdb.base.block;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCharredWood extends TileEntity
{
		private int entityId = 0;	
		private int time = 0;
		private int timeToEscape = 1200;
		private int clicks = 0;
		public boolean carved = false;
		
		public void writeToNBT(NBTTagCompound nbtCompound)
	    {
	        super.writeToNBT(nbtCompound);
	        nbtCompound.setInteger("Entity Id", entityId);
	        nbtCompound.setInteger("Time", time);
	        nbtCompound.setInteger("Time To Escape", timeToEscape);
	        nbtCompound.setInteger("Clicks", clicks);
	        nbtCompound.setBoolean("Carved", carved);
	    }

	    public void readFromNBT(NBTTagCompound nbtCompound)
	    {
	        super.readFromNBT(nbtCompound);
	        entityId = nbtCompound.getInteger("Entity ID");
	        time = nbtCompound.getInteger("Time");
	        timeToEscape = nbtCompound.getInteger("Time To Escape");
	        clicks = nbtCompound.getInteger("Clicks");
	        carved = nbtCompound.getBoolean("Carved");
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
	    		time++;
	    		if(time >= timeToEscape )
	    		{
	    			setEntityId(0);
	    		}
	    	}
	    }
}
