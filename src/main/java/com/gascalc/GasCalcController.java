package com.gascalc;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gascalc.dto.GasCalcDTO;
import com.gascalc.model.GasCalcModel;
import com.gascalc.service.GasCalcService;

@Controller
public class GasCalcController {

	/*
	 * @RequestMapping("/search") public String searchForm(Model model) {
	 * GasCalcModel carSearch = new GasCalcModel(); model.addAttribute("carSearch",
	 * carSearch);
	 * 
	 * return "search"; }
	 */
	public GasCalcService gasCalcService;
	
	public GasCalcController (GasCalcService theGasCalcService){
		gasCalcService=theGasCalcService;
	}
	
	@RequestMapping("/search")
	public String searchForm(Model model) {
		List<GasCalcDTO> theCar = gasCalcService.findAll();
		model.addAttribute("car", theCar);
		return "search";
	}
	
	@PostMapping("/search")
	public String searchResult(@ModelAttribute("carSearch") GasCalcModel model) {
		return "search-result";
	}
}
