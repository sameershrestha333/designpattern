package com.structuraldesignpattern.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	public static int choice;

	public static void main(String[] args) throws NumberFormatException, IOException {
		do {
			System.out.print("========= Food Menu ============ \n");
			System.out.print("            1. Vegetarian Food.   \n");
			System.out.print("            2. Non-Vegetarian Food.\n");
			System.out.print("            3. Chineese Food.         \n");
			System.out.print("            4. Exit                        \n");
			System.out.print("Enter your choice: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1: {
				VegFood vegFood = new VegFood();
				System.out.println(vegFood.getFoodDescripton());
				System.out.println(vegFood.getPrice());
			}
				break;
			case 2: {
				// Food f1 = new NonVeg(new VegFood());
				// (Food) may be casting
				Food f1 = new NonVeg((Food) new VegFood());
				System.out.println(f1.getFoodDescripton());
				System.out.println(f1.getPrice());

			}
				break;
			case 3: {
			
				Food f2 = new Chinese((Food) new VegFood());
				System.out.println(f2.getFoodDescripton());
				System.out.println(f2.getPrice());

			}
				break;
			default:
				System.out.println("Other then these not available.");
				return;
			}//end of switch

		} while (choice != 4);
	}

}
