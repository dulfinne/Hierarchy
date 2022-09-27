package com.epam.hw.hierarchy.main;

import com.epam.hw.hierarchy.bean.ElectricalDevice;
import com.epam.hw.hierarchy.bean.Oven;
import com.epam.hw.hierarchy.bean.Refrigerator;
import com.epam.hw.hierarchy.bean.VacuumCleaner;

public class Main
{
	public static void main(String[] args)
	{
		ElectricalDevice oven = new Oven("Tefal", 1000, 10, "white", 32);
		
		ElectricalDevice refrigerator = new Refrigerator("Atlant", 200, 30, "grey", 15);
		
		ElectricalDevice cleaner = new VacuumCleaner("Karcher", 90, 5, "purple", 'C', 2950);
		
		oven.on();
		refrigerator.on();
		cleaner.on();
		
		System.out.println();
		
		oven.off();
		refrigerator.off();
		cleaner.off();
	}
}
