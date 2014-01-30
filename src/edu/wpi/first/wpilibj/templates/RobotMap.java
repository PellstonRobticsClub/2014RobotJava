package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    public static final int LEFT_MOTORS = 2;  // This is the PWM channel
    public static final int RIGHT_MOTORS = 1; // This is the PWN channel
    
    public static final int JOYSTICK_ONE = 1; // This is the Joystick USB input
    
    public static final int COMPRESSOR_ONE = 1; //This is the relay channel
    public static final int PRESSURE_SWITCH = 1;//This is pressure switch input channel
    public static final int[] dSOLINOID_ONE = {1,2};//this is the solinoid ports
    
    
}