// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {
  public static class OperatorConstants {
    // Port numbers for driver and operator gamepads. These correspond with the numbers on the USB
    // tab of the DriverStation
    public static final int kDriverControllerPort = 1;
    public static final int kOperatorControllerPort = 0;
  }

  public static class DrivetrainConstants {
    // PWM ports/CAN IDs for motor controllers
    public static final int kLeftRearID = 2;
    public static final int kLeftFrontID = 1;
    public static final int kRightRearID = 4;
    public static final int kRightFrontID = 3;

    // Current limit for drivetrain motors
    public static final int kCurrentLimit = 60;
  }

  public static class LauncherConstants {
    // PWM ports/CAN IDs for motor controllers
    public static final int kFeederID = 5;
    public static final int kLauncherID = 6;

    // Current limit for launcher and feed wheels
    public static final int kLauncherCurrentLimit = 80;
    public static final int kFeedCurrentLimit = 80;

    // Speeds for wheels when intaking and launching. Intake speeds are negative to run the wheels
    // in reverse
    public static final double kLauncherSpeed = 10;
    public static final double kLaunchFeederSpeed = 5;
    public static final double kIntakeLauncherSpeed = -1;
    public static final double kIntakeFeederSpeed = -.2;

    public static final double kLauncherDelay = 0.5;
  }
}
