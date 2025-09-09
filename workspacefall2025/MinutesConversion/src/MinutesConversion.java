//Richardson 9/2

import java.util.Scanner;

public class MinutesConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int minutes, hours;
		double days;
		System.out.print("Enter the number of minutes ");
		minutes = input.nextInt();
		hours = minutes/60;
		days = (double) hours/24;
		System.out.println(minutes+ " minutes equal "+ hours +" hours and equals "+ days +" days");

	}

}
