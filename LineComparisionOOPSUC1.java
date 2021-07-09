package test;

import java.util.*;

public class LineComparisionOOPSUC1 {
	
	private double x1 , y1 , x2 , y2 , length ;
	
	public void getDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cordinate x1 :");
		x1 = sc.nextInt();
		System.out.println("Enter Cordinate y1 : ");
		y1 = sc.nextInt();
		System.out.println("Enter Cordinate x2 : ");
		x2 = sc.nextInt();
		System.out.println("Enter Cordinate y2 : ");
		y2 = sc.nextInt();
		sc.close();
		
		length =  Math.sqrt((x2 - x1)*(x2 - x1) + (y2-y1)*(y2-y1));
	}
	
	public void printLength()
	{
		System.out.println("Length is : "+length);
	}
	
	public static void main(String[] args) {
		
		LineComparisionOOPSUC1 uc1 = new LineComparisionOOPSUC1();
		uc1.getDetails();
		uc1.printLength();
	}
	
	
	

}
