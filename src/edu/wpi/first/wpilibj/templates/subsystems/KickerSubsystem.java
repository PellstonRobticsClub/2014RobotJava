/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.kickerDoNothing;

/**
 *
 * @author John
 */
public class KickerSubsystem extends PIDSubsystem {

    private static final double Kp = -2;
    private static final double Ki = 0.0;
    private static final double Kd = 0.0;
    public boolean kicking = false;
    public void setSetpoint(double setpoint) {
        super.setSetpoint(setpoint); //To change body of generated methods, choose Tools | Templates.
    }
    SpeedController kicker = new Victor(RobotMap.KICKER_MOTOR);
    AnalogChannel pot = new AnalogChannel(1);
    
    // Initialize your subsystem here
    public KickerSubsystem() {
        super("KickerSubsystem", Kp, Ki, Kd);

        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new kickerDoNothing());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return pot.getVoltage();
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
        if (this.kicking==true){
            kicker.set(output*12);
        } else {
            kicker.set(output);
        }
    }
    
    public void DoNothing(){
        this.kicking = false;
        disable();
    }
    
    public void UpdateStatus(){
        SmartDashboard.putNumber("Kicker Pot", pot.getVoltage());
    }
    
}
