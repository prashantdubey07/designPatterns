package com.prashant.behavioral.command;

public class ToggleCommand implements Command {
private Light light ;
    
	public ToggleCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.toggle();
		
	}

}
