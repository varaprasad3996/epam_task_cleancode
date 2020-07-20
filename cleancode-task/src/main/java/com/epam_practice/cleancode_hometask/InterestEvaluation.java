package com.epam_practice.cleancode_hometask;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InterestEvaluation {
	
	public static void interestEvaluator()
	{
		Scanner sc=new Scanner(System.in);
		PrintStream pts=new PrintStream(new FileOutputStream(FileDescriptor.out));
		
		pts.println("Enter the principal amount :");
		try {
		double princpalamount=sc.nextDouble();
		pts.println("Enter the time period :");
		double timeperiod=sc.nextDouble();
		pts.println("Enter the rate of interest per annum :");
		double rateofinterest=sc.nextDouble();
		//sc.close();
		pts.println("Simple Interest :"+(princpalamount*timeperiod*rateofinterest)/100);
		pts.println("Compound Interest :"+((princpalamount*Math.pow(1+(rateofinterest/100),timeperiod))-princpalamount));
		pts.println("-------------------------------------");
		}
		catch (Exception e) {
			pts.println("Enter a valid input ... ");
			pts.println("-------------------------------------");
			
		}
	}

}
