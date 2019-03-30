package com.prashant.behavioral.command;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandDemo {

	public static void main(String[] args) {
		/*Light light = new Light();
		Switch lightSwitch = new Switch();
	//	Command onCommand = new OnCommand(light);
		Command onCommand = new ToggleCommand(light);*/
		
		Light bedRoomLight = new Light();
		Light kitchenLight = new Light();
		Switch lightSwitch = new Switch();
	//	Command onCommand = new OnCommand(light);
		/*Command onCommand = new ToggleCommand(bedRoomLight);
		lightSwitch.storeAndExecute(onCommand);
		lightSwitch.storeAndExecute(onCommand);
		lightSwitch.storeAndExecute(onCommand);*/
		
		List<Light> lights = new ArrayList<>();
		lights.add(kitchenLight);
		lights.add(bedRoomLight);
		Command alllightCommands = new AllLightCommand(lights);
		lightSwitch.storeAndExecute(alllightCommands);
		lightSwitch.storeAndExecute(alllightCommands);
	}

}
