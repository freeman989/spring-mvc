package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCountCars(List<Car> cars,int count) {

        List<Car> changedCarList = cars;

        Stream<Car> stream = changedCarList.stream().limit(count);

        return stream.collect(Collectors.toList());
    }
}
