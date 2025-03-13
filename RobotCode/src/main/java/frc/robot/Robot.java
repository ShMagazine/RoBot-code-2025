
package frc.robot;

import edu.wpi.first.hal.FRCNetComm.tInstances;
import edu.wpi.first.hal.FRCNetComm.tResourceType;
import edu.wpi.first.hal.HAL;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.ScheduleCommand;

//import edu.wpi.first.hal.HAL;
//import edu.wpi.first.wpilibj.GenericHID;
//import edu.wpi.first.wpilibj.Joystick;

// Autonomous scheduler
import frc.robot.commands.AutonomousCommand;
import frc.robot.commands.Commands;
// Use the Subsystems and Commands
//import frc.robot.commands.DriveCommand;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Roller;
import frc.robot.subsystems.Tilt;



public class Robot extends TimedRobot {

private Command autonomousCommand;

    // Subsystem constructors (constructors have object inside that you can access using constructor.*)
    public static final DriveTrain driveTrain = new DriveTrain(); // Drivetrain subsystem
    public static final Elevator elevator = new Elevator(); //arm subsystem
    public static final Roller roller = new Roller(); //arm subsystem
    public static final Tilt tilt = new Tilt(); //arm subsystem
    public static IO io = new IO();

    @Override
    public void robotInit()
    {
        driveTrain.setDefaultCommand(Commands.DriveCommand);
        elevator.setDefaultCommand(Commands.elevator);
        roller.setDefaultCommand(Commands.roller);
        tilt.setDefaultCommand(Commands.tilt);
        


//        Robot.io.joyButton3.onTrue(Commands.emergencyStop);
    }

    @Override
    public void robotPeriodic() {
        // Runs the Scheduler.  This is responsible for polling buttons, adding newly-scheduled
        // commands, running already-scheduled commands, removing finished or interrupted commands,
        // and running subsystem periodic() methods.  This must be called from the robot's periodic
        // block in order for anything in the Command-based framework to work.
        CommandScheduler.getInstance().run();
    }


    /**
    * This function is called once each time the robot enters Disabled mode.
    */
    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
    }
   // @Override
   // public void autonomousInit() {
        //autonomousCommand = new AutonomousCommand(driveTrain); 
    
       // if (autonomousCommand != null) {
        //    autonomousCommand.schedule(); 
        //}
    }
    

    /**
    * This function is called periodically during autonomous.
    */
   // @Override
   // public void autonomousPeriodic() {
      //  CommandScheduler.getInstance().run();

//}

    @Override
  public void teleopInit() {
      
  if (autonomousCommand != null) {
            autonomousCommand.cancel();
      }
    }

    /**
     * This function is called periodically during operator control.
     */
    @Override
    public void teleopPeriodic() {
        
    }

    @Override
    public void testInit() {
        // Cancels all running commands at the start of test mode.
        CommandScheduler.getInstance().cancelAll();
    }

    /**
    * This function is called periodically during test mode.
    */
    @Override
    public void testPeriodic() {
    }

}
