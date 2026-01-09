package org.studyeasy.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {
	
	//@Autowired
	//@Autowired(required = false)
	Engine engine;
	

	/*
	public Corolla(Engine engine) {
		engine.type = "V6";
		//this.engine = engine;
	}
	*/
	
	@Autowired
	public void setEngine(Engine engine) {
		engine.type = "10";
		this.engine = engine;
	}

	@Override
	public void specs() {
		// TODO Auto-generated method stub
		System.out.println("Hatback from Corolla with engine as: " + engine.type);
	}

}
