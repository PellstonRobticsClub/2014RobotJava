/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author John
 */
public class CompressorSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Compressor comp = new Compressor(RobotMap.PRESSURE_SWITCH,
            RobotMap.COMPRESSOR_ONE);
    public boolean running = false;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void run(){
        this.running = true;
        comp.start();
    }
    
    public void stop(){
        this.running = false;
        comp.stop();
    }
    public void SwitchState(){
        if (running){
            stop();
            running = false;
        } else {
            run();
            running = true;
        }
    }
    public void UpdateStatus(){
        SmartDashboard.putBoolean("Compressor running", this.running);
        SmartDashboard.putBoolean("Pressure Switch", comp.getPressureSwitchValue());
    }
}
