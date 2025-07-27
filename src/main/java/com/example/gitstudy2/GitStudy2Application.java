package com.example.gitstudy2;

import com.example.gitstudy2.java.Car;
import com.example.gitstudy2.java.MotoCycle;
import com.example.gitstudy2.java.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitStudy2Application {


	public static void main(String[] args){
		printVehicle(new Car());
		printVehicle(new MotoCycle());
	}

	public static void printVehicle(Vehicle vehicle){
		vehicle.drive();
	}

}
