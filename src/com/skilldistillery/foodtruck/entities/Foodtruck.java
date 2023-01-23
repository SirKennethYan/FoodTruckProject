package com.skilldistillery.foodtruck.entities;

public class Foodtruck {

	private static int nextTruckId;
	private int id = 0;
	private String truckName;
	private String foodType;
	private int starRating;

	public Foodtruck() {

	}// Foodtruck_Bracket

	public Foodtruck(String truckName, String foodType, int starRating) {

		this.truckName = truckName;
		this.foodType = foodType;
		this.starRating = starRating;

		nextTruckId++;
		id = nextTruckId;

	}// Foodtruck_Bracket

	public static int getNextTruckId() {
		return nextTruckId;
	}

	public static void setNextTruckId(int nextTruckId) {
		Foodtruck.nextTruckId = nextTruckId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	@Override
	public String toString() {
		return "Truck Name: " + truckName + "\nId: " + id + "\nFood Type: " + foodType + "\nRating: " + starRating
				+ "\n";
	}

}// class_Bracket
