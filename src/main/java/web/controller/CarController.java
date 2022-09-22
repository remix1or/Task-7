package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;


@Controller()
public class CarController {

    private final CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(defaultValue = "10", value = "count") int count, ModelMap model) {
    model.addAttribute("carList", carDao.countCars(carDao.listCars(), count));
        return "cars";
    }
}
