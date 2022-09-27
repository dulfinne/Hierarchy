package com.epam.hw.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends ElectricalDevice implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int freezerCapacity;
	
	public Refrigerator() {}
	
	public Refrigerator(String name, int powerConsumption, int weigth, String color, int freezerCapacity)
	{
		super(name, powerConsumption, weigth, color);
		this.freezerCapacity = freezerCapacity;
	}

	public int getFreezerCapacity()
	{
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity)
	{
		this.freezerCapacity = freezerCapacity;
	}

	@Override
	public void on()
	{
		super.on();
		System.out.println("Refrigirator is on");
	}
	
	@Override
	public void off()
	{
		super.off();
		System.out.println("Refrigirator is off");
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(freezerCapacity);
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
		Refrigerator other = (Refrigerator) obj;
		return freezerCapacity == other.freezerCapacity;
	}

	@Override
	public String toString()
	{
		return getClass().getName() + " [freezerCapacity=" + freezerCapacity + "]";
	}
}
