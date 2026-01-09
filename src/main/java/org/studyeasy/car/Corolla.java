package org.studyeasy.car;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {
	
	@Override
	public void specs() {
		// TODO Auto-generated method stub
		System.out.println("Hatback from Corolla");
	}

}
