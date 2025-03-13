package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.Robot;




// NEW Start
public class Commands {
    public static final Command emergencyStop = new InstantCommand(() -> Robot.driveTrain.stop(), Robot.driveTrain);

    public static final Command elevator = new RunCommand(() -> 
        Robot.elevator.power(Robot.io.controller.getRawAxis(1)), Robot.elevator);

    public static final Command roller = new RunCommand(() -> 
        Robot.roller.power(Robot.io.controller.getRawAxis(5)), Robot.roller);

    public static final Command tilt = new RunCommand(() -> 
        Robot.tilt.power(Robot.io.controller.getRawAxis(4)), Robot.tilt);

    public static final Command DriveCommand = new RunCommand(() -> Robot.driveTrain.arcadeDrive(Robot.io.joystick), Robot.driveTrain);
}


// NEW Stop
