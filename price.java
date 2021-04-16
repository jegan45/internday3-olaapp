package com.jegan;

public class price {
	String cartype="micro";
	int dis=10;
	int total=0;
	public int priceDetermination() {
		// TODO Auto-generated method stub
		if(cartype.equals("micro"))
		{
			total=dis*10;
		    System.out.println("price: "+dis*10);
		    return total;
		}
		else if(cartype.equals("mini"))
		{
			total=dis*15;
			System.out.println("price: "+dis*15);
			return total;
		}
		else
		{
			total=dis*20;
			System.out.println("price: "+dis*20);
		    return total;
		}
	}

}
