package com.jegan;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class WebApp {
	public static void main(String[] args) 
	{
		login l=new login();
		long mobileNumber=9698475004L;
		long passWord=12345678;
	    l.validateMobileNumber(mobileNumber);
	    l.validatePassWord(passWord);
	    
	    CarType c=new CarType();
	    c.display();
	    
	    price pri=new price();
	    
	    int amount=pri.priceDetermination();
	    
	    gst g=new gst();
	    int price=g.calculategst(amount);
	    
	    date d=new date();
	    LocalDate ld=d.getCurrentDate();
	    LocalTime s=d.getCurrentTime();
	    
	    peakTime pt=new peakTime();
	    pt.calculatePeak(s,price);
	    
	    Dob dob=new Dob();
	    dob.getDateOfBirth(ld,price);
	}
}
	
