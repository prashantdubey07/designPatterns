package com.prashant.behavioral.mediator;

public class TurnOffAllLightCommand  implements Command {
	private Mediator mediator;
    
	public TurnOffAllLightCommand(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.turnOffAllLights();
	}

}
