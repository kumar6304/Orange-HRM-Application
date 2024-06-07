  package com.PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
	Scanner	sc=new Scanner(System.in);
	
	 System.out.println("Enter a number:");
	 
	 int num=sc.nextInt();
	 int org_num=num;
	 
	 //using algorithm
	 
	 int rev=0;
	 
	 while(num!=0)
	 {
		 rev=rev*10+num%10; //0=0*10+1234%10=0+123=4;//4=4*10+123%10=40+3=43; //43=43*10+12/10=430+2=432;//432=432+1=4321
		 num=num/10; //1234=1234/10=123;//123=123/10=12;//12=12/10=1;//1=1/10=0;
	 }
	 
	 System.out.println("Reverse number:"+rev);
	 
	 if(org_num==rev)
	 {
		 System.out.println(org_num+" palindrome number");
	 }
	 else
		 
	 {
		 System.out.println(org_num+" not palindrome number");
	 }
	 
	 }
	 

	

}
