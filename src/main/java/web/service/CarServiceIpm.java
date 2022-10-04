package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;


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
        if (count == 0 || count >= 5) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
