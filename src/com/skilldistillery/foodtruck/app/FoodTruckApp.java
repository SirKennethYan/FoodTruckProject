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
		fta.displayTrucks();
		fta.displayAverageRating();
		fta.displayHighestRating();
		fta.getUserSelection();

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

	private void getUserSelection() {
		System.out.println("\nSelect a food truck below by its number, or enter '0' to quit: ");
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				System.out.println((i + 1) + ": " + fleet[i].getTruckName());
			}
		}
		int userSelection = userInput.nextInt();
		userInput.nextLine();
		if (userSelection == 0) {
			System.out.println("Goodbye: ");
		} else if (userSelection > 0 && userSelection <= fleet.length && fleet[userSelection - 1] != null) {
			System.out.println(fleet[userSelection - 1].getTruckName() + " Menu: ");
			System.out.println("food......");
			System.out.println("..food....");
			System.out.println("....food..");
			System.out.println("......food");
			getUserSelection();
		} else {
			System.err.print("Invalid selection. Please try again: ");
			getUserSelection();
		}

	}// getUserSelection_Bracket

}// class_Bracket
