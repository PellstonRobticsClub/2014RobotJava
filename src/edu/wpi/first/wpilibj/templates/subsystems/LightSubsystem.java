/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.LightsOff;

/**
 *
 * @author John
 */
public class LightSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private final Relay lights = new Relay(2);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        lights.setDirection(Relay.Direction.kForward);
        setDefaultCommand(new LightsOff());
    }
    
    public void Off(){
        lights.set(Relay.Value.kOff);
    }
    
    public void On(){
        lights.set(Relay.Value.kOn);
    }
    public void Falsh(){
        lights.set(Relay.Value.kOn);
        Timer.delay(1);
        lights.set(Relay.Value.kOff);
        Timer.delay(1);
        
    }
}
