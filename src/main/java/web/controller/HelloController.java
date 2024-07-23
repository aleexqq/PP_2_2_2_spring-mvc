package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "cars")
	public String printCars(@RequestParam(value = "count", required = false) Integer count,
							ModelMap model) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(1, "BMW", "black"));
		cars.add(new Car(2, "Audi", "red"));
		cars.add(new Car(3, "Ford", "white"));
		cars.add(new Car(4, "Honda", "yellow"));
		cars.add(new Car(5, "Mercedes", "green"));
		if (count != null && count <= cars.size() && count >= 0) {
			model.addAttribute("cars", cars.subList(0, count));
		} else {
			model.addAttribute("cars", cars);
		}
		return "cars";
	}
	
}