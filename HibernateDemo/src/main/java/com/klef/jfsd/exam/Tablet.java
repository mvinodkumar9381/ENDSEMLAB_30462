package com.klef.jfsd.exam;

import jakarta.persistence.Entity;

@Entity(name = "tablet_table")
public class Tablet extends Device {
    private double screenSize;
    private int batteryLife;

    public double getScreenSize() 
    { 
    	return screenSize; 
    }
    public void setScreenSize(double screenSize) 
    {
    	this.screenSize = screenSize; 
    }
    public int getBatteryLife() 
    {
    	return batteryLife; 
    }
    public void setBatteryLife(int batteryLife) 
    { 
    	this.batteryLife = batteryLife; 
    }
}
