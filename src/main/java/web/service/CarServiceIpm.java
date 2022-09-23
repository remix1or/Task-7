package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;


@Service
public class CarServiceIpm implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }

    @Override
    public List<Car> countCars(List<Car> carList, int count) {
        return carDao.countCars(carList, count);
    }
}
