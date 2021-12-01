package com.gascalc.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class GasCalcModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	@Column(name="car_make")
	private String carMake;
	@Column(name="car_model")
	private String carModel;
	@Column(name="car_year")
	private int year;
	@Column(name="highway_mpg")
	private double highwayMPG;
	@Column(name="city_mpg")
	private double cityMPG;
	
	
	public GasCalcModel(int id, String carMake, String carModel, int year, double highwayMPG, double cityMPG) {
		this.id = id;
		this.carMake = carMake;
		this.carModel = carModel;
		this.year = year;
		this.highwayMPG = highwayMPG;
		this.cityMPG = cityMPG;
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
	public double getHighwayMPG() {
		return highwayMPG;
	}


	public void setHighwayMPG(double highwayMPG) {
		this.highwayMPG = highwayMPG;
	}


	public double getCityMPG() {
		return cityMPG;
	}


	public void setCityMPG(double cityMPG) {
		this.cityMPG = cityMPG;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "GasCalcModel [id=" + id + ", carMake=" + carMake + ", carModel=" + carModel + ", year=" + year
				+ ", highwayMPG=" + highwayMPG + ", cityMPG=" + cityMPG + "]";
	}
	
}
