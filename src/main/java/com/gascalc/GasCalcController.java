package com.gascalc;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	
	@GetMapping("/viewAddForm")
	public String viewAddForm(Model theModel)
	{
		GasCalcModel theGasCalcModel = new GasCalcModel();
		
		theModel.addAttribute("vehicles", theGasCalcModel);
		
		return "/Vehicles/search";
	}
	
	@GetMapping("/viewUpdateForm")
	public String viewUpdateForm(@RequestParam("vehicleId")int theId, Model theModel)
	{
		GasCalcModel theGasCalcModel = vehicleService.findById(theId);
		
		theModel.addAttribute("vehicles", theGasCalcModel);
		
		return "redirect:/Vehicles/search";
	}
	
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("vehicleId") int theId)
	{
		vehicleService.deleteById(theId);
		
		return "redirect:/Vehicles/list";
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

