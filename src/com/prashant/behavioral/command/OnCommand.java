package com.prashant.behavioral.command;

public class OnCommand implements Command {
    private Light light ;
    
	public OnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
		
	}
	
	public void unExecute() {
		light.off();
		
	}
}
