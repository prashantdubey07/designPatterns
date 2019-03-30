package com.prashant.behavioral.state;

public class FanOffState extends State {
	private Fan fan;

	public FanOffState(Fan fan) {
		super();
		this.fan = fan;
	}
	
	
	@Override
	public void hadnleRequest() {
		System.out.println("turning Fan on to low");
		fan.setState(fan.getFanLowState());
	}
	
	public String toString(){
		return "fan is off";
	}
}
