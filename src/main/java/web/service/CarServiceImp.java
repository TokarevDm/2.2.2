package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {

    Car car1 = new Car("Niva", "red", 90);
    Car car2 = new Car("Lada", "black", 100);
    Car car3 = new Car("Oka", "white", 110);
    Car car4 = new Car("Volga", "blue", 120);
    Car car5 = new Car("UAZ", "green", 130);

    @Override
    public List<Car> carView(Integer count) {

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        if (count == null) {
            return new ArrayList<>(carList);
        } else if (count <= 4) {
            return carList.stream()
                    .limit(count).collect(Collectors.toList());
        }
        return new ArrayList<>(carList);
    }
}
