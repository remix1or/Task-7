package web.dao;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao{

    @Override
    public List<Car> listCars() {

        List<Car> carList = new ArrayList<>();

        carList.add(0, new Car("BMW", 20, 111));
        carList.add(1, new Car("Mercedes", 22, 222));
        carList.add(2, new Car("Honda", 18, 333));
        carList.add(3, new Car("Subaru", 16, 444));
        carList.add(4, new Car("Lada", 14, 555));
        carList.add(5, new Car("Lada", 14, 555));
        carList.add(6, new Car("Lada", 14, 555));
        carList.add(7, new Car("Lada", 14, 555));
        carList.add(8, new Car("Lada", 14, 555));
        carList.add(9, new Car("Lada", 14, 555));

        return carList;
    }

    @Override
    public List<Car> countCars(List<Car> carList, int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
