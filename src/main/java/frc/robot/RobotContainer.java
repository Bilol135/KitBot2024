// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.DefaultDrive;
import frc.robot.commands.IntakeNote;
import frc.robot.commands.LaunchNote;
import frc.robot.commands.PrepareLaunch;
import frc.robot.subsystems.Launcher;
import frc.robot.subsystems.DriveTrain;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {
    // TODO: Explain what is happening here
    private final DriveTrain m_drive = new DriveTrain();
    private final Launcher m_launcher = new Launcher();

    public static final Joystick joystick = new Joystick(0);
    public static final CommandXboxController gamePad = new CommandXboxController(1);
    

    public RobotContainer() {
        // TODO: Explain what is happening here
        configureBindings();
    }

    private void configureBindings() {
        m_drive.setDefaultCommand(new DefaultDrive(m_drive));
        m_drive.drive(gamePad.getLeftY(), gamePad.getRightX());

        gamePad.a().whileTrue(new PrepareLaunch(m_launcher));
        gamePad.leftBumper().whileTrue(new IntakeNote(m_launcher));
        
        
    }

    public Command getAutonomousCommand() {
        return Commands.print("No autonomous command configured");
    }
}