package com.gascalc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gascalc.dto.GasCalcDTO;

public interface CarRepository extends JpaRepository<GasCalcDTO, Integer> {

}
