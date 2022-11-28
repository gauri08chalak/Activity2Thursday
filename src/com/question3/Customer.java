//Author Name : Gauri Chalak
// declare the class has private variables: accountNumber, accountName, and accountBalance

package com.question3;

import java.util.Scanner;
public class Customer {
	 
		private int  acc_Number;
		private String acc_Name;
		private long acc_Balance;
		
		Scanner sc=new Scanner(System.in);
		 
		public void createAccount()
		{
			System.out.println("Enter account no:");
			acc_Number=sc.nextInt();
			System.out.println("Enter name");
			acc_Name=sc.next();
			System.out.println("Enter account balance");
			acc_Balance=sc.nextLong();
		}
		public void withDrawAmount()
		{
			long amt;
			System.out.println("Enter the amount you want to withdraw ");
			amt=sc.nextLong();
			if(acc_Balance >= amt)
			{
				acc_Balance=acc_Balance-amt;
				System.out.println("Balance after withdrawal: "+acc_Balance);
			}
			else
			{
				System.out.println("your balance is less than"+amt+"transaction Failed......!");
			}
		}    
	}

