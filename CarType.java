package com.jegan;

public class CarType {
	static String carType="micro";
	public void display() {
		// TODO Auto-generated method stub
		switch(carType)
		{
		case "micro":
			System.out.println("micro: "+10);
			break;
		case "mini":
			System.out.println("mini: "+15);
			break;
		case "prime":
			System.out.println("prime: "+20);
			break;
		}
	}
	

}
