package com.jegan;

public class login {
//	static long mobileNumber=9698475004L;
//	static long passWord=12345678;
	public static boolean validateMobileNumber(long mn)
	{
		String MN=Long.toString(mn);
		if(MN.length()!=10)
			return false;
		else 
		{
			System.out.println("mobile number:"+" "+mn);
			return true;	
		}	
	}
	public static boolean validatePassWord(long p)
	{
		String P=Long.toString(p);
		if(P.length()!=8)
			return false;
		else
		{
			System.out.println("password:"+" "+p);
			return true;
		}
	}
}
