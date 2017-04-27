package com.structuraldesignpattern.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	public static int choise;

	public static void main(String[] args) throws NumberFormatException, IOException {
		do {
			System.out.print("=========Mobile Shop======\n");
			System.out.print("            1. IPHONE.              \n");
			System.out.print("            2. SAMSUNG.              \n");
			System.out.print("            3. BLACKBERRY.            \n");
			System.out.print("            4. Exit.                     \n");
			System.out.print("Enter your choice: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choise = Integer.parseInt(br.readLine());
			ShopKeeper shopKeeper = new ShopKeeper();
			switch (choise) {
			case 1: {
				shopKeeper.getIphoneSale();
			}

				break;

			case 2: {
				shopKeeper.getSamsungSale();
			}

				break;

			case 3: {
				shopKeeper.getIBlackberySale();
			}

				break;

			default:
				System.out.println("Not available.");
				return;
			}

		} while (choise != 4);
	}

}
