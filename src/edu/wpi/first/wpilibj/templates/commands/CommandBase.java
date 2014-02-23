package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.subsystems.ArmSubsystems;
import edu.wpi.first.wpilibj.templates.subsystems.ChassisSubsystem;
import edu.wpi.first.wpilibj.templates.subsystems.CompressorSubsystem;
import edu.wpi.first.wpilibj.templates.subsystems.KickerSubsystem;
import edu.wpi.first.wpilibj.templates.subsystems.WristSubsystem;


/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static ChassisSubsystem chassis = new ChassisSubsystem();
    public static ArmSubsystems arm = new ArmSubsystems();
    public static CompressorSubsystem compressor = new CompressorSubsystem();
    public static KickerSubsystem kick = new KickerSubsystem();
    public static WristSubsystem wrist = new WristSubsystem();
    

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(chassis);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
