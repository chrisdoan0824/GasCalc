package com.gascalc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gascalc.model.GasCalcModel;


public interface GasCalcRepository extends JpaRepository<GasCalcModel, Integer> {
	
	//method to sort result by last name ascending
	public List<GasCalcModel>findAllByOrderByCarMakeAsc();
	
}
