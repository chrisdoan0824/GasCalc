package com.gascalc.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class GasCalcDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name="id")
	private int id;
	
	@Column(name="car_make")
	private String carMake;
	
	@Column(name="car_model")
	private String carModel;
	
	@Column(name="car_year")
	private int year;
	
	@Column(name="highway_mpg")
	private String highwayMPG;
	
	@Column(name="city_mpg")
	private String cityMPG;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getHighwayMPG() {
		return highwayMPG;
	}
	public void setHighwayMPG(String highwayMPG) {
		this.highwayMPG = highwayMPG;
	}
	public String getCityMPG() {
		return cityMPG;
	}
	public void setCityMPG(String cityMPG) {
		this.cityMPG = cityMPG;
	}
	@Override
	public String toString() {
		return "GasCalcDTO [id=" + id + ", carMake=" + carMake + ", carModel=" + carModel + ", year=" + year
				+ ", highwayMPG=" + highwayMPG + ", cityMPG=" + cityMPG + "]";
	}

	
}