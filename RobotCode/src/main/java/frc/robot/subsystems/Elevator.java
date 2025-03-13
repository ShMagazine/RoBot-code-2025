package frc.robot.subsystems;

import frc.robot.Constants;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;


import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {
  
    // Initialize Drivetrain Motor Controllers
    private SparkMax leftelevMotor = new SparkMax(Constants.LEFT_ELEV_MOTOR_ID, MotorType.kBrushless);
    private SparkMax rightelevMotor = new SparkMax(Constants.RIGHT_ELEV_MOTOR_ID, MotorType.kBrushless);
//    private DigitalInput limitSwitch = new DigitalInput(Constants.HD_LIMIT_SWITCH_PORT);

//    public boolean getLimitSwitch() {
//        return limitSwitch.get();
//    }

    public void power(double speed) {
        if (speed > 1) speed = 1;
        if (speed < -1) speed = -1;
        if (Math.abs(speed) > 0.1) {
            leftelevMotor.set(speed*-0.6);
            rightelevMotor.set(speed*-0.6);
        } else {
            stop();
        }
    }

    public void stop() {
        leftelevMotor.set(0);
        rightelevMotor.set(0);
    }

    public double getSpeed() {
        return leftelevMotor.get();
    }
  }
