package org.studyeasy.specs;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Engine;

@Component("v8")
public class V8 implements Engine {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "V8 engine";
	}

}
