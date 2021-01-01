package service;
import model.Car;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarService {
	public List<Car> getCars() {
		return List.of(
			new Car(1L, "Red", "Germany"),
			new Car(2L, "Blue", "Japan"),
			new Car(3L, "Green", "Korea"),
			new Car(4L, "White", "Russia"),
			new Car(5L, "Black", "France")
		);
	}
}