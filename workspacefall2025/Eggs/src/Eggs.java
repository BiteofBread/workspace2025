//Richardson 9/2

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		int eggs ,dozen,remainder;
		int cost = 0;
		final int EGGS_PER_DOZEN=12;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of eggs you want to order ");
		eggs = input.nextInt();
		dozen = eggs/EGGS_PER_DOZEN;
		remainder = eggs % EGGS_PER_DOZEN;
		double costofdozens = dozen * 3.25;
		double costoflooseeggs = remainder * 0.45;
		double totalcost = costofdozens + costoflooseeggs;
		System.out.println("You ordered "+ eggs +" eggs. That's "+dozen+
				" dozen at $3.25 per dozen and "+ remainder +
				" loose eggs at 45 cents for a total of $" +totalcost);


	}

}
