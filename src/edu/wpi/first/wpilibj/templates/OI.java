
package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.CompressorRun;
import edu.wpi.first.wpilibj.templates.commands.CompressorStop;
import edu.wpi.first.wpilibj.templates.commands.LightsFlash;
import edu.wpi.first.wpilibj.templates.commands.LightsOff;
import edu.wpi.first.wpilibj.templates.commands.LightsOn;
import edu.wpi.first.wpilibj.templates.commands.WristClose;
import edu.wpi.first.wpilibj.templates.commands.WristDoNothing;
import edu.wpi.first.wpilibj.templates.commands.WristOpen;
import edu.wpi.first.wpilibj.templates.commands.autoKick;
import edu.wpi.first.wpilibj.templates.commands.kickKickerPosition;
import edu.wpi.first.wpilibj.templates.commands.setKickerPosition;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    public Joystick DriveStick = new Joystick(RobotMap.JOYSTICK_ONE);
    public Joystick kickerStick = new Joystick(RobotMap.JOYSTICK_TWO);
    
    
    
   public Button compressorStartButton = new JoystickButton(DriveStick, 2);
   public Button compressorStopButton = new JoystickButton(DriveStick, 3);
   public Button LightsOnButton = new JoystickButton(DriveStick, 6);
   public Button LightsOffButton = new JoystickButton(DriveStick, 7);
   public Button LightsFlashButton = new JoystickButton(DriveStick, 8);
   
   public Button setButton = new JoystickButton(kickerStick, 3);
   public Button kickButton = new JoystickButton(kickerStick, 8);
   public Button wristCloseButton = new JoystickButton(kickerStick, 1);
   public Button wristOpenButton = new JoystickButton(kickerStick, 2);
   public Button moveArmButton = new JoystickButton(kickerStick, 6);
   public Button KickerStickActiveButton = new JoystickButton(kickerStick, 7);
   public Button TestKick = new JoystickButton(kickerStick, 12);
   
    public OI(){
        compressorStartButton.whenPressed(new CompressorRun());
        compressorStopButton.whenPressed(new CompressorStop());
        kickButton.whenPressed(new kickKickerPosition());
        setButton.whenPressed(new setKickerPosition());
        wristCloseButton.whenPressed(new WristClose());
        wristCloseButton.whenReleased(new WristDoNothing());
        wristOpenButton.whenPressed(new WristOpen());
        LightsOnButton.whenPressed(new LightsOn());
        LightsOffButton.whenPressed(new LightsOff());
        LightsFlashButton.whenPressed(new LightsFlash());
        TestKick.whenPressed(new autoKick());
        
        
    }
            
}

