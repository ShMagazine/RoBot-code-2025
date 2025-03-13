package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.Timer;

public class AutonomousCommand extends Command {

    private final DriveTrain driveTrain;
    private final Timer timer;          
    private static final double MOVE_TIME = 2.0;

    public AutonomousCommand(DriveTrain driveTrain) {
        this.driveTrain = driveTrain;
        this.timer = new Timer();
        addRequirements(driveTrain); 
    }

    @Override
    public void initialize() {
        timer.reset();  
        timer.start();  
    }

    @Override
    public void execute() {
        driveTrain.tankDrive(-0.5, -0.5);  
    }

    @Override
    public void end(boolean interrupted) {
        driveTrain.stop(); 
    }

    @Override
    public boolean isFinished() {
        return timer.get() >= MOVE_TIME;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}
