/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.armMove;


/**
 *
 * @author John
 */
public class ArmSubsystems extends Subsystem{
    private final SpeedController arm = new Victor(RobotMap.ARM_MOTOR);
    private final DigitalInput DownButton = new DigitalInput(RobotMap.ARM_DOWN_BUTTON);

    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new armMove());
       
    }
    public void doNothing(){
        arm.set(0);
    }
    public void move(Joystick stick) {
        double output = -stick.getY();
        double speed;
        if(IsDown()){
            speed = Math.min(0, output);
        } else {
            speed = output;
        }
            arm.set(speed);
    }
    
    public void Down(){
        arm.set(.25);
    }
    
    public void Up(){
        arm.set(-.7);
        
    }
    
    
    public boolean IsDown(){
        return DownButton.get();
    }

    public void UpdateStatus(){
        SmartDashboard.putBoolean("ArmDown", IsDown());

    }
    
    
}
