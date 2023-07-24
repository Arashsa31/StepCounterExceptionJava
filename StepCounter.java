package LabProgram310;

import java.util.Scanner;

public class StepCounter {
	public static void main(String[] args) throws Exception {
		Scanner scnr = new Scanner(System.in);
		/* Type your code here. */

		double steps = scnr.nextDouble();
		double tempValue = 0;
		try {
			tempValue = stepsToMiles(steps);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.printf("%.2f\n", tempValue);
	}

	public static double stepsToMiles(double steps) throws Exception {
		steps /= 2000;
		if (steps < 0)
			throw new Exception("Exception: Negative step count entered.");
		return steps;
	}
}