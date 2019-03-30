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
public class LightOnState  implements Command{
  Light light;
  
  public LightOnState(Light light){
    this.light = light;
  }
  @Override
  public void execute() {
    light.setState(true);
    System.out.println("Whether light is on ? "+light.isState());
  }

}
