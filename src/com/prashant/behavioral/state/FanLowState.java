package com.prashant.behavioral.state;

public class FanLowState extends State {
	private Fan fan;

	public FanLowState(Fan fan) {
		super();
		this.fan = fan;
	}
	
	
	@Override
	public void hadnleRequest() {
		System.out.println("turning Fan on to Medium");
		fan.setState(fan.getFanMedState());
	}
	
	public String toString(){
		return "fan is Low";
	}
}
