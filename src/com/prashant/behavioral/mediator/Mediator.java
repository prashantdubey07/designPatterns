package com.prashant.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

import com.prashant.behavioral.command.Light;

public class Mediator {
	List<Light> lights = new ArrayList<>();
	
	public void registerLight(Light light) {
		lights.add(light);
	}
	
	public void turnOnAllLights(){
		for(Light light : lights) {
			if(!light.isOn())
				light.toggle();
		}
	}
	
	public void turnOffAllLights(){
		for(Light light : lights) {
			if(light.isOn())
				light.toggle();
		}
	}
	
}
