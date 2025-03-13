package frc.robot.subsystems;

import frc.robot.Constants;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Joystick;

public class DriveTrain extends SubsystemBase {

    private SparkMax leftDriveMotor = new SparkMax(Constants.LEFT_DRIVE_MOTOR_ID, MotorType.kBrushed);
    private SparkMax rightDriveMotor = new SparkMax(Constants.RIGHT_DRIVE_MOTOR_ID, MotorType.kBrushed);
    private DifferentialDrive driveSystem = new DifferentialDrive(leftDriveMotor, rightDriveMotor);

    public DriveTrain() {
        driveSystem.setDeadband(0.1);
    }
    
    public void arcadeDrive(Joystick joystick) {
        double forwardPower = joystick.getRawAxis(1) * -1;
        double turnPower = joystick.getRawAxis(2) * -0.8;
        driveSystem.arcadeDrive(forwardPower, turnPower);
    }

    public void tankDrive(double leftPower, double rightPower) {
        driveSystem.tankDrive(leftPower, rightPower);
    }

    public void stop() {
        driveSystem.stopMotor();
    }
}
