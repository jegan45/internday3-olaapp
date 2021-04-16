package com.jegan;

import java.time.LocalDate;
import java.time.Period;

public class Dob {
    String dob="1955-09-09";
    LocalDate t=LocalDate.parse(dob);
    int n;
	public int getDateOfBirth(LocalDate s,int p) {
		// TODO Auto-generated method stub
		int age=Period.between(t,s).getYears();
		if(age>=60)
		{
			n=(p*50)/100;
			System.out.println("offer: "+""+n);
			return n;
		}
		return n;
	}

}
