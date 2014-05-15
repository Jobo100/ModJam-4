package com.jdb.base.block;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCharredWood extends TileEntity
{
		private int entityId = 0;	
		
		public void writeToNBT(NBTTagCompound nbtCompound)
	    {
	        super.writeToNBT(nbtCompound);
	        nbtCompound.setInteger("Entity Id", entityId);
	    }

	    public void readFromNBT(NBTTagCompound nbtCompound)
	    {
	        super.readFromNBT(nbtCompound);
	        entityId = nbtCompound.getInteger("Entity ID");
	    }
	    
	    public void setEntityId(int id)
	    {
	    	entityId = id;
	    }
	    
	    public int getEntityId()
	    {
	    	return entityId;
	    }
}
