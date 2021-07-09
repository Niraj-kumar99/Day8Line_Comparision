package test;

import java.util.Scanner;

public class LineComparisionOOPSUC3 {
	
	private double x1 , y1 , x2 , y2 , length1 ;
	private double a1 , b1 , a2 , b2 , length2 ;
	
	public void getDetails()
	{
		// Line 1 dimensions ... 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cordinate x1 :");
		x1 = sc.nextInt();
		System.out.println("Enter Cordinate y1 : ");
		y1 = sc.nextInt();
		System.out.println("Enter Cordinate x2 : ");
		x2 = sc.nextInt();
		System.out.println("Enter Cordinate y2 : ");
		y2 = sc.nextInt();
		
		// Line 2 dimensions ...
		
		System.out.println("Enter Cordinate a1 :");
		a1 = sc.nextInt();
		System.out.println("Enter Cordinate b1 : ");
		b1 = sc.nextInt();
		System.out.println("Enter Cordinate a2 : ");
		a2 = sc.nextInt();
		System.out.println("Enter Cordinate b2 : ");
		b2 = sc.nextInt();
		sc.close();
		
		GetLength obj = new GetLength();
		obj.lengthCalculate();
		
	}
	
	private class GetLength
	{
		public void lengthCalculate()
		{
			length1 = Math.sqrt((x2 - x1)*(x2 - x1) + (y2-y1)*(y2-y1));
			length2 = Math.sqrt((a2 - a1)*(a2 - a1) + (b2-b1)*(b2-b1));
		}
	}
	
	public void printLength()
	{
		System.out.println("Lenth of 1st line : "+length1);
		System.out.println("Length of 2nd line : "+length2);
		
		LengthCompare ln = new LengthCompare();
		ln.compareLength();
	}
	
	private class LengthCompare
	{
		public void compareLength()
		{
			String line1 = Double.toString(length1);
			String line2 = Double.toString(length2);
			
			double comp = line1.compareTo(line2); 	
			
			if (comp == 0)
			{
				System.out.println("Both Lines are EQUAL");
			}
			else if (comp < 0)
			{
				System.out.println("Line1 is SMALLER than Line2 ");
			}
			else
				System.out.println("Line1 is GREATER than Line2");
			
		}
	}
	
	public static void main(String[] args) {
		
		LineComparisionOOPSUC3 uc3 = new LineComparisionOOPSUC3();
		uc3.getDetails();
		uc3.printLength();
	}
}

