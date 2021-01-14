package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import service.CarService;

@Controller
public class CarController {
	@Autowired
	CarService carService;
	
	@GetMapping("/cars")
	public String printCars(@RequestParam(name = "count", required=false) Integer n, ModelMap model) {
		var cars =  carService.getCars();
		if(n == null || 5 <= n)
			model.addAttribute("cars", cars);
		else 
			model.addAttribute("cars", cars.subList(0, n));
		return "cars";
	}
}