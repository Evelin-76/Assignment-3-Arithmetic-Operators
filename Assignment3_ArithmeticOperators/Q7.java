package Assignment3_ArithmeticOperators;

public class Q7 {

	public static void main(String[] args) {
		
//		Write a program that determines the change to be dispensed from a vending machine.
//		An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments
//		(25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single dollar 
//		bill to pay for the item.
//	      Sample output
//	      Price in cents : 95
//	      Your change is 0 quarters, 0 dimes, and 1 nickles

	 int cents = 95;
	 int item = 90;
	 int change = cents - item;
	 int quarter = change / 25;
	 int dimes = change / 10;
	 int nickles = change / 5;
	 
	 if(item >= 5) {
		 item++;
				 
		 System.out.println("Price in cents : " + cents );
		 System.out.println("Your change is " + quarter + " quarters, " + dimes + " dimes, " 
		 + nickles + " nickles ");
	
	 }

	}

}
