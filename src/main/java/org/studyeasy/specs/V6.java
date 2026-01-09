package org.studyeasy.specs;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Engine;

@Component("v6")
public class V6 implements Engine {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "V6 engine";
	}

}
