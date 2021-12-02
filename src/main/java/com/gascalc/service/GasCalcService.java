package com.gascalc.service;

import java.util.List;

import com.gascalc.model.GasCalcModel;


public interface GasCalcService {
		
	public List<GasCalcModel> findAll();
	
	public GasCalcModel findById(int theID);
	
	public void save(GasCalcModel theModel);
	
	public void deleteById(int theId);
		

}
