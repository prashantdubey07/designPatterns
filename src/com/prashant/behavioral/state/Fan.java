package com.prashant.behavioral.state;

public class Fan {
	State fanOFFState;
	State fanLowState;
	State fanMedState;
	State fanHighState;

	State state;

	public Fan() {
		fanOFFState = new FanOffState(this);
		fanLowState = new FanLowState(this);
		fanMedState = new FanMedState(this);
		fanHighState = new FanHighState(this);
		
		state = fanOFFState;
	}

	public State getFanLowState() {
		return fanLowState;
	}
	
	public State getFanMedState() {
		return fanMedState;
	}
	
	public State getFanHighState() {
		return fanHighState;
	}
	
	public State getFanOffState() {
		return fanOFFState;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void pullChain() {
		state.hadnleRequest();
	}

	public String toString() {
		return state.toString();
	}
}
