package com.prashant.behavioral.command;

import java.util.List;

public class AllLightCommand  implements Command {
private List<Light> lights ;
    
	public AllLightCommand(List<Light> lights) {
		super();
		this.lights = lights;
	}

	@Override
	public void execute() {
		for(Light light : lights)
			if(light.isOn())
				light.toggle();
		
	}

}
