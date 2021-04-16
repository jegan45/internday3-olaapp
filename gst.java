package com.jegan;

public class gst {
	int gst;
	public int calculategst(int price) {
		// TODO Auto-generated method stub
			gst=price+(price*7)/100;
			System.out.println("GST: "+gst);
			return gst;
	}

}
