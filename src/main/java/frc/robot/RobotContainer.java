// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.DefaultDrive;
import frc.robot.commands.PrepareLaunch;
import frc.robot.subsystems.*;
import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


public class RobotContainer {
    // TODO: Explain what is happening here
    private final DriveTrain m_drive = new DriveTrain();
    private final Shooter m_launcher = new Shooter();

    public static final Joystick joystick = new Joystick(0);
    public static final CommandXboxController gamePad = new CommandXboxController(1);
    public static final DriveTrain driveTrain = new DriveTrain();

    public RobotContainer() {
        // TODO: Explain what is happening here
        configureBindings();
    }

    private void configureBindings() {
        m_launcher.setDefaultCommand(new DefaultDrive(driveTrain));
        m_launcher.drive(0, 0);
        final Button btnOut = new JoystickButton(gamePad, BUMP_RIGHT); // Right bumper
        final Button btnIn = new JoystickButton(gamePad, BUMP_LEFT); // Left bumper
        
        
    }

    public Command getAutonomousCommand() {
        return Commands.print("No autonomous command configured");
    }
}