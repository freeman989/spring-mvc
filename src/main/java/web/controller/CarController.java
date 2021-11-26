package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, Model model){

    List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mers","Black",8000));
        cars.add(new Car("Folc","Green",7500));
        cars.add(new Car("BMW","Blue",11000));
        cars.add(new Car("Renoult","White",6500));
        cars.add(new Car("Audi","Red",2500));

        CarService carService = new CarServiceImpl();
        model.addAttribute("cars", carService.getCountCars(cars,count));

        return "cars";
    }
}
