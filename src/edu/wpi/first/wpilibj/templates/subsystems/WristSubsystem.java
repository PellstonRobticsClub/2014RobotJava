/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.WristDoNothing;

/**
 *
 * @author John
 */
public class WristSubsystem extends Subsystem {
    private DoubleSolenoid wrist = new DoubleSolenoid(RobotMap.dSOLINOID_ONE[0],RobotMap.dSOLINOID_ONE[1]);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new WristDoNothing());
    }
    
    public void DoNothing(){
       wrist.set(DoubleSolenoid.Value.kOff);
    }
    public void Open(){
        wrist.set(DoubleSolenoid.Value.kForward);
    }
    public void close(){
        wrist.set(DoubleSolenoid.Value.kReverse);
    }
}
