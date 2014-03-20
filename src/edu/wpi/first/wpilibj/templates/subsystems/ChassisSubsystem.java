
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.DriveCommand;

/**
 *
 */
public class ChassisSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private RobotDrive robot = new RobotDrive(RobotMap.LEFT_MOTORS, RobotMap.RIGHT_MOTORS);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DriveCommand());
    }
    
    public void Drive(Joystick stick) {
       double speed = ((stick.getZ()+1)/4) +.5;
        
        robot.arcadeDrive(-stick.getY()*speed, -stick.getX()*speed);
        
    }
    
    public void AutoDrive(float x,float y) {
        
        robot.tankDrive(x, y);    }
    
    public void Stop() {
        robot.drive(0, 0);
    }
    
}

