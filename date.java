package com.jegan;

import java.time.LocalDate;
import java.time.LocalTime;

public class date {
 
	public LocalDate getCurrentDate() {
		// TODO Auto-generated method stub
		System.out.println("CurrentDate: "+LocalDate.now());
		return LocalDate.now();
	}

	public LocalTime getCurrentTime() {
		// TODO Auto-generated method stub
		System.out.println("CurrentTime: "+LocalTime.now());
		return LocalTime.now();
	}

}
