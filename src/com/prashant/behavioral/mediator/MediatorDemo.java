package com.prashant.behavioral.mediator;

import com.prashant.behavioral.command.Light;

public class MediatorDemo {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Light bedRoomLight = new Light();
		Light kitchenLight = new Light();
		
		mediator.registerLight(kitchenLight);
		mediator.registerLight(bedRoomLight);
		
		Command turnOnAllLightCommand = new TurnOnAllLightCommand(mediator);
		turnOnAllLightCommand.execute();
		
		Command turnOffAllLightCommand = new TurnOffAllLightCommand(mediator);
		turnOffAllLightCommand.execute();
	}
}
