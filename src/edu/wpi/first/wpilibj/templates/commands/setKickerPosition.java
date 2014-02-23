/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;
    
/**
 *
 * @author John
 */
public class setKickerPosition extends CommandBase {
    private double position;
    
    public setKickerPosition(double position,boolean isKicking) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(kick);
        kick.kicking=isKicking;
        this.position = position;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        kick.setSetpoint(this.position);
        kick.enable();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Math.abs(kick.getPosition()- this.position)<.08;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
