package com.jegan;

import java.time.LocalTime;

public class peakTime {
    double n;
	public double calculatePeak(LocalTime lt,int amo) {
		// TODO Auto-generated method stub
		int hour=lt.getHour();
		if(hour>=15 && hour<=17)
		{
			n=amo+(1.25%100);
			System.out.println("PeakAmount: "+n);
			return n;
		}
		return n;
	}
    
}
