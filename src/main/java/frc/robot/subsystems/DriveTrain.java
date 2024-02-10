package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import static frc.robot.Constants.*;

public class DriveTrain extends SubsystemBase {
    private final WPI_VictorSPX leftFront, leftBack, rightFront, rightBack;
    private final MotorControllerGroup leftMotors, rightMotors;
    private final DifferentialDrive driveTrain;

    public DriveTrain(){
        leftFront = new WPI_VictorSPX(DrivetrainConstants.leftFrontMotorID);
        leftBack = new WPI_VictorSPX(DrivetrainConstants.leftBackMotorID);
        rightFront = new WPI_VictorSPX(DrivetrainConstants.rightFrontMotorID);
        rightBack = new WPI_VictorSPX(DrivetrainConstants.rightBackMotorID);

        leftMotors = new MotorControllerGroup(leftFront, leftBack);
        rightMotors = new MotorControllerGroup(rightFront, rightBack);

        driveTrain = new DifferentialDrive(leftMotors, rightMotors);
        leftMotors.setInverted(true);

        leftFront.configFactoryDefault();
        leftBack.configFactoryDefault();
        rightFront.configFactoryDefault();
        rightBack.configFactoryDefault();
    }
    
    public void drive(double velocity, double rotation){
        driveTrain.arcadeDrive(velocity, rotation);
    }

    @Override
    public void periodic(){

    }
}