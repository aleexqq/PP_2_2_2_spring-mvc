package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> allCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", "black"));
        cars.add(new Car(2, "Audi", "red"));
        cars.add(new Car(3, "Ford", "white"));
        cars.add(new Car(4, "Honda", "yellow"));
        cars.add(new Car(5, "Mercedes", "green"));

        if (count != null && count <= cars.size() && count >= 0) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
}
