package com.gascalc.model;

public class GasCalcModel {

	private String carMake;
	private String carModel;
	private int year;
	
	
	public GasCalcModel(String carMake, String carModel, int year) {
		this.carMake = carMake;
		this.carModel = carModel;
		this.year = year;
	}
	
	
	public GasCalcModel() {
		// TODO Auto-generated constructor stub
	}


	public String getCarMake() {
		return carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public int getYear() {
		return year;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return "Your car Make: " + carMake + "Model: " + carModel + "Year: " + year;
	}
}
