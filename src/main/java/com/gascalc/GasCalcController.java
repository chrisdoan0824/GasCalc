package com.gascalc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gascalc.model.GasCalcModel;

@Controller

/**
 * Main controller for GasCalc
 * @author 
 *
 */
public class GasCalcController {

	/**
	 * 
	 * @param model model for the page
	 * @return template for the car search entry form
	 */
	@RequestMapping("/search")
	public String searchForm(Model model) {
		GasCalcModel carSearch = new GasCalcModel();
		model.addAttribute("carSearch", carSearch);
		
		return "search";
	}
	
	/**
	 * 
	 * @param model model to represent the returned GasCalcModel
	 * @return search results for the car search form
	 */
	@PostMapping("/search")
	public String searchResult(@ModelAttribute("carSearch") GasCalcModel gasCalcModel) {
		return "search-result";
	}
}
