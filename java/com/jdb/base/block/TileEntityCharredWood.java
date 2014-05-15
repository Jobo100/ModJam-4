package com.jdb.base.block;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCharredWood extends TileEntity
{
		private int entityId = 0;	
		private int time = 0;
		
		public void writeToNBT(NBTTagCompound nbtCompound)
	    {
	        super.writeToNBT(nbtCompound);
	        nbtCompound.setInteger("Entity Id", entityId);
	        nbtCompound.setInteger("Time", time);
	    }

	    public void readFromNBT(NBTTagCompound nbtCompound)
	    {
	        super.readFromNBT(nbtCompound);
	        entityId = nbtCompound.getInteger("Entity ID");
	        time = nbtCompound.getInteger("Time");
	    }
	    
	    public void setEntityId(int id)
	    {
	    	entityId = id;
	    }
	    
	    public int getEntityId()
	    {
	    	return entityId;
	    }
	    
	    public void updateEntity() 
	    {
	    	if(getEntityId() != 0)
	    	{
	    		
	    	}
	    }
}
