/*
* File: Choice.java
* Author: Eric Allen
* Date: April 9, 2017
* Purpose: Help the user pick a vehicle
* based on the number of wheels and passengers they want
*/

//Import functions
	import java.util.*;
	import java.io.*;

public class Choice{

	//Defining valuables
	public int wheels;
	public int passengers;

	//Constructors
	public Choice (int wantedWheels, int wantedPassengers) {
		wheels = wantedWheels;
		passengers = wantedPassengers;
	}

	//Methods
	public int setWheels(int newValue) {
		wheels = newValue;
	}

	public int setPassengers(int newValue) {
		passengers = newValue;
	}
	
	public int returnWheels() {
		return wheels;
	}

	public int returnPass() {
		return passengers;
	}
	
	public String returnInfo(){
		String vehicleChoice;
		String decision;

		if (wheels == 2) {
			vehicleChoice = "Bicycle";
		}

		else if (wheels == 4) {
			if (passengers <= 4){
				vehicleChoice = "Car";
			}
			else {
				vehicleChoice = "SUV";
			}

		decision = "With " + wheels + " wheels & " + passengers + " passengers, you should use a " + vehicleChoice + ".";	
		return decision;
	}
}