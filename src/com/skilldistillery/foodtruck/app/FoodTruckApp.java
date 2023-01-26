package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {

	private static int MAX_FOOD_TRUCKS = 5;
	private Foodtruck[] fleet = new Foodtruck[MAX_FOOD_TRUCKS];
	private Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();

		fta.createTrucks();
		fta.getMenu();

	}// main_Bracket

	public void createTrucks() {
		for (int i = 0; i < MAX_FOOD_TRUCKS; i++) {
			System.out.println("Enter a Food Truck name, or type 'Quit': ");

			String truckName = userInput.nextLine();
			if (truckName.equalsIgnoreCase("Quit")) {
				break;
			}

			System.out.println("Enter food type of the Food Truck: ");
			String foodType = userInput.nextLine();

			System.out.println("Enter rating of Food Truck: ");
			int starRating = userInput.nextInt();
			userInput.nextLine();

			fleet[i] = new Foodtruck(truckName, foodType, starRating);

		}

	}// createTrucks_Bracket

	private void getMenu() {
		System.out.println("============The Food Truck App============");
		System.out.println("==== 1. View all existing Food Trucks ====");
		System.out.println("==== 2. View average Food Truck rating ===");
		System.out.println("==== 3. View highest rated Food Trucks ===");
		System.out.println("==== 4. Quit the Food Truck app ==========");
		System.out.println("==========================================");

		String menuOpt = userInput.nextLine();

		if (menuOpt.equals("1")) {
			displayTrucks();
			getMenu();
			userInput.nextLine();

		} else if (menuOpt.equals("2")) {
			displayAverageRating();
			getMenu();
			userInput.nextLine();

		} else if (menuOpt.equals("3")) {
			displayHighestRating();
			getMenu();
			userInput.nextLine();

		} else if (menuOpt.equals("4")) {
			System.out.println("Goodbye! ");

		} else {
			System.out.println("Invalid input. Please enter a number between 1 and 4.");
			getMenu();

			userInput.close();
		}

	}// getMenu_Bracket

	private void displayTrucks() {

		for (Foodtruck truckName : fleet) {
			if (truckName != null) {
				System.out.println(truckName.toString());
			}

		}

	}// displayTrucks_Bracket

	private void displayAverageRating() {
		int totalRatings = 0;
		int count = 0;

		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				totalRatings += fleet[i].getStarRating();
				count++;
			}
		}

		double averageRating = (double) totalRatings / count;
		System.out.println("Average Ratings: " + averageRating);

	}// displayAverageRating_Bracket

	private void displayHighestRating() {

		int highestRating = 0;
		int Index = 0;

		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				int current = fleet[i].getStarRating();
				if (current > highestRating) {
					highestRating = current;
					Index = i;
				}
			}
		}

		if (Index != -1) {
			System.out.println("Highest Rated: " + fleet[Index].getTruckName() + " - " + highestRating + " Stars! ");
		}

	}// displayHighestRating_Bracket

}// class_Bracket
