package com.prashant.behavioral.state;

public class FanHighState extends State {
	private Fan fan;

	public FanHighState(Fan fan) {
		super();
		this.fan = fan;
	}
	
	
	@Override
	public void hadnleRequest() {
		System.out.println("turning Fan  to off");
		fan.setState(fan.getFanOffState());
	}
	
	public String toString(){
		return "fan is on High";
	}
}
