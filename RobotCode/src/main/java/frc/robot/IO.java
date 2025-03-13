package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class IO {
    public GenericHID controller = new GenericHID(Constants.CONTROLLER_USB_PORT_ID);
    public Joystick joystick = new Joystick(Constants.Joystick_USB_PORT_ID);
    

    //public JoystickButton joyButton3 = new JoystickButton(joystick, 3);

//    GenericHID intakeButton = new GenericHID(controller, Constants.BUTTON_INTAKE_ID);
//    GenericHID dischargeButton = new GenericHID(controller, Constants.BUTTON_DISCHARGE_ID);
    
//    public IO() {
//        intakeButton.whenPressed(Commands.intake);
//        dischargeButton.whenPressed(Commands.discharge);
//    }
    
}
