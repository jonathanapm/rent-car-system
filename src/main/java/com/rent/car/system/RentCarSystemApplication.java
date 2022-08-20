package com.rent.car.system;

import com.rent.car.system.persistence.entity.CarEntity;
import com.rent.car.system.persistence.enums.CarType;
import com.rent.car.system.persistence.repository.CarRepository;
import com.rent.car.system.persistence.repository.RentCarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class RentCarSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentCarSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoData(CarRepository repo) {
		return args -> {
			CarEntity car1 = new CarEntity();
			car1.setColor("branco");
			car1.setYear("2016");
			car1.setCarType(CarType.HATCH);
			car1.setMake("Chevrolet");
			car1.setModel("Onix");
			car1.setRegistrationDate(LocalDateTime.now());

			CarEntity car2 = new CarEntity();
			car2.setColor("prata");
			car2.setYear("2017");
			car2.setCarType(CarType.HATCH);
			car2.setMake("Volkswagem");
			car2.setModel("Fox");
			car2.setRegistrationDate(LocalDateTime.now());

			CarEntity car3 = new CarEntity();
			car3.setColor("preto");
			car3.setYear("2020");
			car3.setCarType(CarType.SEDAN);
			car3.setMake("Hyundai");
			car3.setModel("Hb20");
			car3.setRegistrationDate(LocalDateTime.now());

			repo.saveAll(List.of(car1, car2, car3));
		};
	}

}
