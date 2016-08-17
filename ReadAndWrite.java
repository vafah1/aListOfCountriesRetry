package com.augsixteenretry;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ReadAndWrite
{

	Path originalListPath = Paths.get("\\Users\\admin\\newWorkspace\\AListOfCOuntries\\src\\com\\augsixteenretry\\originalcountries.txt");
	File aBrandNewFile = originalListPath.toFile();
	Scanner sc = new Scanner(System.in);
	ArrayList<String>listOfCountries = new ArrayList();
	
	public void originalList()
	{
		BufferedReader in = null;

		try
		{
			in = new BufferedReader(new FileReader(aBrandNewFile));
			
			String listedCountry;

			while((listedCountry = in.readLine()) != null)
			{
				System.out.println(listedCountry);
			}

		} catch (IOException e)
		{
			e.printStackTrace();
		}finally{
			try {
				if (in != null)in.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	
	}
	public void addACountry(String userInput)
	{
		try (
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aBrandNewFile, true)))){


			out.println(userInput);
			
			out.close();

		} catch (IOException e) 
		{

			e.printStackTrace();
		}
		
	}
	public void deleteACountry()
	{
		for(int i = 0; i < listOfCountries.size(); i++);
	}
	
}
