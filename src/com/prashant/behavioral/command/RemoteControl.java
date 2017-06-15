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
public class RemoteControl {
  private Command command;
  public void setCommand(Command command){
    this.command = command;
  }
  public void changeState(){
    
    command.execute();
  }
}
