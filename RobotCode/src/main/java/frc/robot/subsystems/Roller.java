package frc.robot.subsystems;

import frc.robot.Constants;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;


import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Roller extends SubsystemBase {
  
    // Initialize Drivetrain Motor Controllers
    private SparkMax leftrollMotor = new SparkMax(Constants.LEFT_ROLL_MOTOR_ID, MotorType.kBrushless);
    private SparkMax rightrollMotor = new SparkMax(Constants.RIGHT_ROLL_MOTOR_ID, MotorType.kBrushless);
//    private DigitalInput limitSwitch = new DigitalInput(Constants.HD_LIMIT_SWITCH_PORT);

//    public boolean getLimitSwitch() {
//        return limitSwitch.get();
//    }

    public void power(double speed) {
        if (speed > 1) speed = 1;
        if (speed < -1) speed = -1;
        if (Math.abs(speed) > 0.1) {
            leftrollMotor.set(speed*-0.6);
            rightrollMotor.set(speed*-0.6);
        } else {
            stop();
        }
    }

    public void stop() {
        leftrollMotor.set(0);
        rightrollMotor.set(0);
    }

    public double getSpeed() {
        return leftrollMotor.get();
    }
  }