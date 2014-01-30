/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.ArmDoNothing;


/**
 *
 * @author John
 */
public class ArmSubsystems extends Subsystem{
    private DoubleSolenoid arm = new DoubleSolenoid(RobotMap.dSOLINOID_ONE[0], RobotMap.dSOLINOID_ONE[1]);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new ArmDoNothing());
       
    }
    public void doNothing(){
        arm.set(DoubleSolenoid.Value.kOff);
    }
    public void forward(){
        arm.set(DoubleSolenoid.Value.kForward);
    }
    public void reverse(){
        arm.set(DoubleSolenoid.Value.kReverse);
    }
    public void Stop() {
        
    }
    
}
