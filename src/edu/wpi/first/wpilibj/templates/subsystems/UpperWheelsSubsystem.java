/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;


/**
 *
 * @author John
 */
public class UpperWheelsSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private SpeedController vic = new Victor(RobotMap.UPPER_WHEELS_MOTOR);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void stop(){
        
    }
    
    public void forward(double speed){
        
    }
    
    public void reverse(double speed){
        
    }
}