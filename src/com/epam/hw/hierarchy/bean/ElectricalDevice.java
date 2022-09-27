package com.epam.hw.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class ElectricalDevice implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String company;
	private int powerConsumption;
	private int weigth;
	private String color;
	
	public ElectricalDevice() {}
	
	public ElectricalDevice(String company, int powerConsumption, int weigth, String color)
	{
		this.company = company;
		this.powerConsumption = powerConsumption;
		this.weigth = weigth;
		this.color = color;
	}

	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company = company;
	}

	public int getPowerConsumption()
	{
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption)
	{
		this.powerConsumption = powerConsumption;
	}

	public int getWeigth()
	{
		return weigth;
	}

	public void setWeigth(int weigth)
	{
		this.weigth = weigth;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public void on()
	{
		System.out.println("Some electrical device is turning on. .. ...");
	}
	
	public void off()
	{
		System.out.println("Some electrical device is turning off... .. .");
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(color, company, powerConsumption, weigth);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectricalDevice other = (ElectricalDevice) obj;
		return Objects.equals(color, other.color) && Objects.equals(company, other.company)
				&& powerConsumption == other.powerConsumption && weigth == other.weigth;
	}

	@Override
	public String toString()
	{
		return getClass().getName() + " [company=" + company + ", powerConsumption=" + powerConsumption + ", weigth=" + weigth
				+ ", color=" + color + "]";
	}

	
}
