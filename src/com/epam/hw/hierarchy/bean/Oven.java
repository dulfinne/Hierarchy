package com.epam.hw.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends ElectricalDevice implements Serializable
{
	private static final long serialVersionUID = 1L;

	private int capacity;
	
	
	public Oven(){}
	
	public Oven(String company, int powerConsumption, int weigth, String color, int capacity) 
	{
		super(company, powerConsumption, weigth, color);
		this.capacity = capacity;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

	@Override
	public void on()
	{
		super.on();
		System.out.println("Oven is on");
	}
	
	@Override
	public void off()
	{
		super.off();
		System.out.println("Oven is off");
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacity);
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
		Oven other = (Oven) obj;
		return capacity == other.capacity;
	}

	@Override
	public String toString()
	{
		return getClass().getName() + " [capacity=" + capacity + "]";
	}
	
	
}
