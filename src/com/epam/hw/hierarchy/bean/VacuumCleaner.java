package com.epam.hw.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class VacuumCleaner extends ElectricalDevice implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private char filterType;
	private int speed;
	
	public VacuumCleaner(){}
	
	public VacuumCleaner(String company, int powerConsumption, int weigth,
							String color, char filterType, int speed)
	{
		super(company, powerConsumption, weigth, color);
		
		this.filterType = filterType;
		this.speed = speed;
	}

	public char getFilterType()
	{
		return filterType;
	}

	public void setFilterType(char filterType)
	{
		this.filterType = filterType;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	@Override
	public void on()
	{
		super.on();
		System.out.println("Vacuum cleaner is on");
	}
	
	@Override
	public void off()
	{
		super.off();
		System.out.println("Vacuum cleaner is off");
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(filterType, speed);
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		VacuumCleaner other = (VacuumCleaner) obj;
		return filterType == other.filterType && speed == other.speed;
	}

	@Override
	public String toString()
	{
		return getClass().getName() +" [filterType=" + filterType + ", speed=" + speed + "]";
	}	
}
