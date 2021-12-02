package com.gascalc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import com.gascalc.dao.GasCalcRepository;
import com.gascalc.model.GasCalcModel;


@Service
public class GasCalcServiceImpl implements GasCalcService{
	
	private GasCalcRepository vehicleRepository;
	
	@Autowired
	public GasCalcServiceImpl (GasCalcRepository theVehicleRepository) {
		vehicleRepository = theVehicleRepository;
	}
	
	@Override
	public List<GasCalcModel> findAll() {
		// TODO Auto-generated method stub
		return vehicleRepository.findAllByOrderByCarMakeAsc();
	}

	@Override
	public GasCalcModel findById(int theID) {
		// TODO Auto-generated method stub
		Optional<GasCalcModel> vehicleid = vehicleRepository.findById(theID);
		
		GasCalcModel theVehicle = null;
		
		if(vehicleid.isPresent()) {
			
			theVehicle = vehicleid.get();
			
		} else {
			
			//vehicleid not found
			throw new RuntimeException("The Vehicle ID you entered does not exist" + theID);
			
		}
		
		return theVehicle;
	}

	@Override
	public void save(GasCalcModel theModel) {
		// TODO Auto-generated method stub
		vehicleRepository.save(theModel);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		vehicleRepository.deleteById(theId);
	}

}
