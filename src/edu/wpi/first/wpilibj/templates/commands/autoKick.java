/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author John
 */
public class autoKick extends CommandBase {
    
    public autoKick() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(kick);
        kick.auto=true;
        kick.kicking =false;
        SmartDashboard.putBoolean("true", true);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        kick.setSetpoint(RobotMap.KICK_POSITION);
        kick.enable();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Math.abs(kick.getPosition()- RobotMap.KICK_POSITION)<.08;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
