package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Individual;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Individual ind = new Individual();

		System.out.println("###  BMI Calculation Program  ###");

		System.out.println();

		System.out.print("Enter the Name: ");
		ind.setName(sc.next());

		System.out.print("Enter Height: ");
		ind.setHeight(sc.nextDouble());

		System.out.print("Enter Weight: ");
		ind.setWeight(sc.nextDouble());

		System.out.println();
		System.out.println("BMI = " + ind.BMI());
		System.out.println(ind);
		System.out.println();

		if (ind.BMI() <= 18.5) {
			System.out.println("Under weight");
		} else if (ind.BMI() <= 24.9) {
			System.out.println("Normal weight");

		} else if (ind.BMI() <= 29.9) {
			System.out.println("Overweight");
		} else if (ind.BMI() <= 39.9) {
			System.out.println("Obesity");
		} else if (ind.BMI() > 40.0) {
			System.out.println("Severe Obesity");
		}

		sc.close();
	}

}
