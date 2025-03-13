
package frc.robot;

//import edu.wpi.first.wpilibj.drive.DifferentialDrive;

//import com.revrobotics.spark.SparkMax;
//import com.revrobotics.spark.SparkLowLevel.MotorType;

public class Constants {

    // Logitech Extreme 3D Pro joystick
    public static final int Joystick_USB_PORT_ID = 0;      // USB port that the joystick is plugged into

    public static final int Joystick_XAXIS_ID = 0;         // Joystick X Axis
    public static final int Joystick_YAXIS_ID = 1;         // Joystick Y Axis
    public static final int Joystick_ZAXIS_ID = 2;         // Joystick Z Twist Axis
    public static final int Joystick_SLIDERAXIS_ID = 3;    // Base Y Axis Slider
    public static final int Joystick_THXAXIS_ID = 4;       // Thumb Joystick X Axis
    public static final int Joystick_THYAXIS_ID = 5;       // Thumb Joystick Y Axis   
    public static final int Joystick_TRIGBUTT_ID = 1;      //Trigger Button
    public static final int Joystick_SIDETRIGBUTT_ID = 2;  //Side Trigger Button
    public static final int Joystick_THLLBUTT_ID = 3;      // Lower Left Thumb Button
    public static final int Joystick_THLRBUTT_ID = 4;      // Lower Rigth Thumb Button
    public static final int Joystick_THULBUTT_ID = 5;      // Upper Left Thumb Button
    public static final int Joystick_THURBUTT_ID = 6;      // Upper Rigth Thumb Button
    public static final int Joystick_BASULBUTT_ID = 7;     // Base Upper Left Button
    public static final int Joystick_BASURBUTT_ID = 8;     // Base Upper Right Button
    public static final int Joystick_BASMLBUTT_ID = 9;     // Base Middle Left Button
    public static final int Joystick_BASMRBUTT_ID = 10;    // Base Middle Right Button
    public static final int Joystick_BASLLBUTT_ID = 11;    // Base Lower Left Button
    public static final int Joystick_BASLRBUTT_ID = 11;    // Base Lower Right Button

    // Logitech Gamepad F310 controller 
    public static final int CONTROLLER_USB_PORT_ID = 1;    // USB port that controller is plugged into
    
    public static final int Controller_LXAXIS_ID = 0;      // Controller left joystick X Axis
    public static final int Controller_LYAXIS_ID = 1;      // Controller left joystick Y Axis   
    public static final int Controller_LTRIG_ID = 2;       // Controller left trigger button Axis       
    public static final int Controller_RTRIG_ID = 3;       // Controller right trigger button Axis      
    public static final int Controller_RXAXIS_ID = 4;      // Controller right joystick X Axis
    public static final int Controller_RYAXIS_ID = 5;      // Controller right joystick Y Axis 
    public static final int Controller_PXAXIS_ID = 6;      // Controller pad X Axis
    public static final int Controller_PYAXIS_ID = 7;      // Controller pad Y Axis   
    public static final int Controller_ABUTT_ID = 1;       // A Button
    public static final int Controller_BBUTT_ID = 2;       // B Button
    public static final int Controller_XBUTT_ID = 3;       // X Button
    public static final int Controller_YBUTT_ID = 4;       // Y Button
    public static final int Controller_UPPERLBUTT_ID = 5;  // Upper Left Button
    public static final int Controller_UPPERRBUTT_ID = 6;  // Upper Right Button
    public static final int Controller_BACKBUTT_ID = 7;    // Back Button
    public static final int Controller_STARTRBUTT_ID = 8;  // Start Right Button

    public static final int BUTTON_INTAKE_ID = 8;
    public static final int BUTTON_DISCHARGE_ID = 9;

    // SparkMax CAN IDs
    public static final int LEFT_DRIVE_MOTOR_ID = 7;
    public static final int RIGHT_DRIVE_MOTOR_ID = 6;
    public static final int LEFT_ELEV_MOTOR_ID = 4;
    public static final int RIGHT_ELEV_MOTOR_ID = 2;
    public static final int LEFT_ROLL_MOTOR_ID = 8;
    public static final int RIGHT_ROLL_MOTOR_ID =10;
    public static final int TILT_MOTOR_ID = 9;
    

//    public static final int ARM_MOTOR_CAN_ID = 3;
    

    // Drivetrain Constants
    public static final boolean DRIVE_INVERT_LEFT = false; // Whether to reverse the left drivetrain motors or not
    public static final boolean DRIVE_INVERT_RIGHT = true; // Whether to reverse the right drivetrain motors or not
    public static final boolean ELEV_INVERT_LEFT = false; // Whether to reverse the left drivetrain motors or not
    public static final boolean ELEV_INVERT_RIGHT = true; // Whether to reverse the right drivetrain motors or not
    public static final boolean ROLL_INVERT_LEFT = false; // Whether to reverse the left drivetrain motors or not
    public static final boolean ROLL_INVERT_RIGHT = true; // Whether to reverse the right drivetrain motors or not
    public static final boolean TILT_INVERT_RIGHT = false; // Whether to reverse the right drivetrain motors or not
    

//    public static final int HD_LIMIT_SWITCH_PORT = 1;
}

