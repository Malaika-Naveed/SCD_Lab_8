package Task1;

import java.util.Scanner;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	public int addition(int num1, int num2)
	{
		return num1 + num2;
	}
	public int multiply(int num1, int num2)
	{
		return num1 * num2;
	}

	public static void main(String[] args)
	{
		Calculator calculate = new Calculator();
		int result1, result2;
		result1=calculate.addition(2, 4);
		result2=calculate.multiply(5, 6);
		System.out.println("Result of Addition: " +result1);
		System.out.println("Result of Multiplication: " +result2);
//		int num1 , num2;
//		System.out.println("Enter 1 to perform Addtion Function and 2 for Multiplication:");
//		Scanner scan= new Scanner(System.in);
//		 int choice = scan.nextInt() ;
//		 scan.close();
//		System.out.println("Enter 1st number:");
//		Scanner scan1= new Scanner(System.in);
//		 num1=scan1.nextInt();
//		 scan1.close();
//		System.out.println("Enter 2nd number:");
//		Scanner scan2= new Scanner(System.in);
//	    num2=scan2.nextInt();
//	    scan2.close();
//	    
//		switch(choice)
//		{
//		case 1:
//			calculate.addition(num1, num2);
//			break;
//		case 2: 
//			calculate.multiply(num1, num2);
//			break;
//		default:
//				System.out.println("Not found");
//		}
		
		
	}
}
