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
import edu.wpi.first.wpilibj.templates.commands.kickerDoNothing;

/**
 *
 * @author John
 */
public class KickerSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public SpeedController vic = new Victor(RobotMap.KICKER_MOTOR);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand((new kickerDoNothing()));
    }
    
    public void set(){
    }
    
    public void Kick(){
        vic.set(1.0);
    }
    public void DoNothing(){
        vic.set(0.0);
    }
}
