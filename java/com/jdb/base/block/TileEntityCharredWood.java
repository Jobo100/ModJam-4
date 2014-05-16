package com.jdb.base.block;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCharredWood extends TileEntity
{
		private int entityId = 0;	
		private int time = 0;
		private int timeToEscape = 1200;
		
		public void writeToNBT(NBTTagCompound nbtCompound)
	    {
	        super.writeToNBT(nbtCompound);
	        nbtCompound.setInteger("Entity Id", entityId);
	        nbtCompound.setInteger("Time", time);
	        nbtCompound.setInteger("Time To Escape", timeToEscape);
	    }

	    public void readFromNBT(NBTTagCompound nbtCompound)
	    {
	        super.readFromNBT(nbtCompound);
	        entityId = nbtCompound.getInteger("Entity ID");
	        time = nbtCompound.getInteger("Time");
	        timeToEscape = nbtCompound.getInteger("Time To Escape");
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
	    	timeToEscape += increase;
	    }
	    
	    public void setEscapeTime(int seconds)
	    {
	    	int time2 = seconds * 20;
	    	timeToEscape = time2;
	    }
	    
	    public int getEscapeTime()
	    {
	    	return timeToEscape;
	    }
	    
	    public void updateEntity() 
	    {
	    	if(getEntityId() != 0)
	    	{
	    		time++;
	    		if(time >= timeToEscape)
	    		{
	    			setEntityId(0);
	    		}
	    	}
	    }
}
