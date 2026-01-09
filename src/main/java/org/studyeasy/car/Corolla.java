package org.studyeasy.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

@Component("corolla")
public class Corolla implements Car {
		
	//@Autowired
	@Autowired(required = false)
	//@Qualifier("v6")
	@Qualifier("v8")
	Engine engine;

	@Override
	public void specs() {
		// TODO Auto-generated method stub
		System.out.println("Hatback from Corolla with engine as: " + engine.specs());
	}

}
