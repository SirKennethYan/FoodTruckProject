package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {
//	This main FoodTruck APP does NOT pass in the Id Value for any Food Truck.

	private static int MAX_FOOD_TRUCKS = 5;
	private Foodtruck[] fleet = new Foodtruck[MAX_FOOD_TRUCKS];
	private Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();

		fta.createTrucks();
		fta.displayTrucks();
		fta.displayAverageRating();
		fta.displayHighestRating();

	}// main_Bracket

	public void createTrucks() {
		for (int i = 0; i < MAX_FOOD_TRUCKS; i++) {
			System.out.println("Enter a Food Truck name, or press Quit: ");
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
//			done - assign this truck into the array at whatever index its at. 			
		}

	}// createTrucks_Bracket

	private void displayTrucks() {

		for (Foodtruck truckName : fleet) {
			if (truckName != null) {
//		List all existing food trucks.
				System.out.println("Truck Name: " + truckName.getTruckName());
				System.out.println("Food Type: " + truckName.getFoodType());
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

		double averageRating = (double) (totalRatings / count);
		System.out.println("Average Rating: " + averageRating);

	}// displayAverageRating_Bracket

	private void displayHighestRating() {
		int highestRate = 0;
		String trName = "";

		for (int i = 0; i < fleet.length; i++) {
			
			highestRate = fleet[2].getStarRating();
			trName = fleet[i].getTruckName();
			System.out.println("Hihest Rated: " + highestRate + trName);
		}
		


	}// displayHighestRating_Bracket

}// class_Bracket
