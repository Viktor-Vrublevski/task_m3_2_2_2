package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    public List<Car> getList(List<Car> cars, int size) {
        return cars.stream().limit(size).collect(Collectors.toList());
    }
}
