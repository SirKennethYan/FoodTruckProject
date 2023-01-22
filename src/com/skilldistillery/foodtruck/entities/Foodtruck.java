package com.skilldistillery.foodtruck.entities;

public class Foodtruck {
//	define a FoodTruck class with fields for a unique numeric id 
//	a name ("TacoRific", "Mediterranean Medic", etc.), 
//	food type ("Tacos", "Falafel", etc.), and a numeric rating
	private static int nextTruckId;
	private int id = 0;
	private String truckName;
	private String foodType;
	public int starRating;
	
	public Foodtruck() {
		
	}//Foodtruck_Bracket
	
	public Foodtruck(String truckName, String foodType, int starRating) {
//	create an and automatically assign the ID when we call this constructor.
		this.truckName = truckName;
		this.foodType = foodType;
		this.starRating = starRating;
	
		nextTruckId++;
		id = nextTruckId;
		
				
	}//Foodtruck_Bracket

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
	
}//class_Bracket
