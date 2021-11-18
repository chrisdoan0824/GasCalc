package com.gascalc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gascalc.dao.CarRepository;
import com.gascalc.dto.GasCalcDTO;

public class GasCalcServiceImpl implements GasCalcService {
	private CarRepository carRepository;
	
	@Autowired
	public GasCalcServiceImpl (CarRepository theCarRepository) {
		carRepository = theCarRepository;
	}
	
	public List<GasCalcDTO> findAll(){
		return carRepository.findAll();
	}
}
