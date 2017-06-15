/**
 * (C) Copyright Voxify, 2008 - All Rights Reserved. PROPRIETARY AND CONFIDENTIAL.
 * This source code and documentation is copyrighted and owned by Voxify.
 * Use is subject to license terms. May not be distributed without authorization from Voxify.
 */
package com.prashant.designPattern.behavioral.command;

/**
 *
 * @author prashant.d
 */
public class TestCommand {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("in Main Class to Test Command Pattern");
    RemoteControl remoteControl = new RemoteControl();
    Light light = new Light();
    
    Command lightOff = new LightOffState(light);
    Command lightOn = new LightOnState(light);
    
    remoteControl.setCommand(lightOff);
    System.out.println("light is going to Off State");
    remoteControl.changeState();
    
    
    remoteControl.setCommand(lightOn);
    System.out.println("light is going to On State");
    remoteControl.changeState();
  }

}
