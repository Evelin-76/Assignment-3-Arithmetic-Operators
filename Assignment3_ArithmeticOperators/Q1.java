package Assignment3_ArithmeticOperators;

public class Q1 {

	public static void main(String[] args) {
		
		
//		Question-1
//
//		Write a program to convert gallons into Liters and display it.
//
//		        Sample output:
//
//		       15 gallon is 56.7812 liter
		
		double gallons = 15, litersFormula = 3.78541 ;
		
		double converToliters = gallons * litersFormula;
		
		if(gallons == 1) {
			
			System.out.println((int)gallons + " gallon is " + converToliters + " liters.");

		}else {
		
			System.out.println((int)gallons + " gallons are " + converToliters + " liters.");
		
		}
		

	}

}
