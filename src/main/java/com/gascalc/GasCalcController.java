package com.gascalc;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gascalc.model.GasCalcModel;
import com.gascalc.service.GasCalcService;

@Controller
@RequestMapping("/Vehicles")
public class GasCalcController {
	
	public GasCalcService vehicleService;
	public GasCalcController (GasCalcService theVehicleService) {
		vehicleService = theVehicleService;
	}
	
	//Mapping for "/list"
	@GetMapping("/list")
	public String listVehicles(Model theModel) {
		
		
		//retrieve faculty from the database
		List<GasCalcModel> theVehicles = vehicleService.findAll();
		
		//add faculties to the spring model
		theModel.addAttribute("vehicles", theVehicles);
		
		
		return "Vehicles/list";
		
	}

	@RequestMapping("/search")
	public String searchForm(Model model) {
		GasCalcModel carSearch = new GasCalcModel();
		model.addAttribute("carSearch", carSearch);
		
		return "Vehicles/search";
	}
	
	
	@PostMapping("/search")
	public String searchResult(@ModelAttribute("carSearch") GasCalcModel model) {
		return "Vehicles/search-result";
	}
}
