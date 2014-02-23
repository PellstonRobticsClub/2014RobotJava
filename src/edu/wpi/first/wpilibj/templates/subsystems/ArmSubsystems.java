/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.ArmDoNothing;
import edu.wpi.first.wpilibj.templates.commands.armMove;


/**
 *
 * @author John
 */
public class ArmSubsystems extends Subsystem{
    private SpeedController arm = new Victor(RobotMap.ARM_MOTOR);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new armMove());
       
    }
    public void doNothing(){
        arm.set(0);
    }
    public void move(Joystick stick) {
        if(stick.getY()>.1 || stick.getY()< -.1){
            arm.set(-stick.getY());
        }
    }
    
    
}
