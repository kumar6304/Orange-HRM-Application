package com.CountNumber;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		int num=123456;
		
		int count=0;
		
		while(num>0)
		{
			num=num/10; //123456/10=12345;//12345/10=1234;//1234/10=123;//123/10=12;//12/10=2;//1/10=0
			count++;
		}
		System.out.println("Number of digits:"+count);

	}

}
