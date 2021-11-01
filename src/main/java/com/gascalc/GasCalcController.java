package com.gascalc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gascalc.model.GasCalcModel;

@Controller

public class GasCalcController {

	/**
	 * 
	 * @return the home screen template
	 */
	@RequestMapping("/")
	public String index(Model model) {
		GasCalcModel carSearch = new GasCalcModel();
		model.addAttribute("carSearch", carSearch);
		
		return "search";
	}
	

	/**
	 * 
	 * @return the search screen template
	 */
	@RequestMapping("/search")
	public String searchForm(Model model) {
		GasCalcModel carSearch = new GasCalcModel();
		model.addAttribute("carSearch", carSearch);
		
		return "search";
	}
	

	/**
	 * 
	 * @return the search screen template with results
	 */
	@PostMapping("/search")
	public String searchResult(@ModelAttribute("carSearch") GasCalcModel model) {
		return "search-result";
	}
}
