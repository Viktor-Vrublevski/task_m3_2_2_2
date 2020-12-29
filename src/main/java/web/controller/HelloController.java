package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@Autowired
	private CarService service;

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String printCars(ModelMap model, @RequestParam(required = false) Integer size) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Audi A8",65000,265));
		cars.add(new Car("Mercedes SX",77000,250));
		cars.add(new Car("Reno Laguna",15000,190));
		cars.add(new Car("Subaru Legacy",32000,245));
		cars.add(new Car("Toyota Prado",65600,225));
		if (size != null) {
			cars = service.getList(cars, size);
		}
		model.addAttribute("cars", cars);
		return "car";
	}
}