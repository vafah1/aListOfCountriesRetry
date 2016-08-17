package com.augsixteenretry;

import java.util.Scanner;

public class Countries
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		ReadAndWrite rw = new ReadAndWrite();
		
		
		while(true){
			
			System.out.println("Hello and welcome to World Builder!!!" 
					+ "\nMENU:" 
					+ "\n(1) Show List of starting countries"
					+ "\n(2) Add a country to the list" 
					+ "\n(3) Exit the app");
	
			userInput = sc.nextInt();
			
			switch (userInput)
			{
			case 1:
				rw.originalList();
				
				break;
			case 2:
				System.out.println("Please add a country to World Builder: ");
				String countryInput = sc.next();
				rw.addACountry(countryInput);
				
				break;
			case 3:
				System.out.println("Bye Felicia!!!");
				System.exit(0);
				
				break;
			default:
				System.out.println("You have made an invalid choice. Please try again...");
				
				break;
			}
		}
		
		
	}
}
