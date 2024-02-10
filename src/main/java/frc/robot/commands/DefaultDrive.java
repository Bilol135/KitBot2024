package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class DefaultDrive extends CommandBase{
    private DriveTrain driveTrain;
     public DefaultDrive(DriveTrain dt){
        addRequirements(dt);
        driveTrain = dt;
    }

    @Override
    public void execute(){
        driveTrain.drive(RobotContainer.joystick.getY() * RobotContainer.joystick.getThrottle(), 
                    RobotContainer.joystick.getTwist() * RobotContainer.joystick.getThrottle());
    }

    @Override
    public void end(boolean interrupted){
        driveTrain.drive(0, 0);
    }
}