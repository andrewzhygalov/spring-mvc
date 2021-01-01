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
	public String printCars(@RequestParam("count") int n, ModelMap model) {
		if(5 <= n)
			model.addAttribute("cars", carService.getCars());
		else 
			model.addAttribute("cars", carService.getCars().subList(0, n));
		return "cars";
	}
}