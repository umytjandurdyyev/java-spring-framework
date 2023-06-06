package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
     CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Car c1 = new Car("BMW", "X7");
        Car c2 = new Car("Tesla", "Model X");
        Car c3 = new Car("Skoda", "Enyaq");
        Car c4 = new Car("VW", "ID5");

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);
        carRepository.save(c4);
    }
}
