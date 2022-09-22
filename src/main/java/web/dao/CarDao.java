package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> listCars();
    List<Car> countCars(List<Car> carList, int count);

}
