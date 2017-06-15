package com.prashant.designPattern.behavioral.command;

/**
*
* @author prashant.d
*/
public class LightOffState implements Command{
  Light light;
  
  public LightOffState(Light light){
    this.light = light;
  }
  @Override
  public void execute() {
    light.setState(false);
    System.out.println("Whether light is on ? "+light.isState());
  }

}
