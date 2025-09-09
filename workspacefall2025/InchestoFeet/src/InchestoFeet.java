// Richardson 9/2 in class exercise 2

import java.util.Scanner;

public class InchestoFeet {

	public static void main(String[] args) {
		int inches ,feet,remainder;
		final int INCHES_PER_FOOT=12;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of inches ");
		inches = input.nextInt();
		feet = inches/INCHES_PER_FOOT;
		remainder = inches % INCHES_PER_FOOT;
		System.out.println(inches +" inches equals "+feet+
				" feet and "+remainder + " inches");

	}

}
