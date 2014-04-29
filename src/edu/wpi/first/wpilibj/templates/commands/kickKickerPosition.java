/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author John
 */
public class kickKickerPosition extends CommandBase {
    double position;
    
    public kickKickerPosition() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(kick);
        //if(compressor.running){
        //    compRunning = true;
        //    compressor.stop();
        //}
       
        this.position = RobotMap.KICK_POSITION;
        //if(compRunning){
        //    compressor.run();
        //}
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
         kick.auto=false;
        kick.kicking=true;
        kick.amplify = ((oi.kickerStick.getZ()*14.5)+15.5);
        if(oi.KickerStickActiveButton.get()){
            kick.setSetpoint(this.position);
            kick.enable();
        } else {
            kick.DoNothing();
            this.cancel();
        }
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
