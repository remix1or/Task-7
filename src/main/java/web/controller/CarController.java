package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller()
public class CarController {


    @GetMapping(value = "/cars")
    public String getCars (@RequestParam(defaultValue = "5", value = "count") int count, ModelMap model) {

        List<Car> carList = new ArrayList<>();

        carList.add(0, new Car("BMW", 20, 111));
        carList.add(1, new Car("Mercedes", 22, 222));
        carList.add(2, new Car("Honda", 18, 333));
        carList.add(3, new Car("Subaru", 16, 444));
        carList.add(4, new Car("Lada", 14, 555));
        carList = new CarService().countCars(carList, count);
        model.addAttribute("carList", carList);
        return "cars";
    }
}
