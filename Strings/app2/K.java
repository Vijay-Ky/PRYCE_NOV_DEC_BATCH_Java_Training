package com.app2;

public class K
{

	public static void main(String[] args)
	{
		String s1 = "lara tech";
		
		int i = s1.indexOf(' ');
		
		String s2 = s1.substring(0, i);
		
		String s3 = s1.substring(i + 1);
		
		System.out.println(s2);

		System.out.println(s3);
		
	}

}
