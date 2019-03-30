package com.prashant.behavioral.state;

public class FanMedState extends State {
	private Fan fan;

	public FanMedState(Fan fan) {
		super();
		this.fan = fan;
	}
	
	
	@Override
	public void hadnleRequest() {
		System.out.println("turning Fan on to High");
		fan.setState(fan.getFanHighState());
	}
	
	public String toString(){
		return "fan is on Med";
	}
}
