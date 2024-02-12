// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
        //joystick constants
        public static final int joystickPort = 1;

        //gamePad constants
        public static final int gamePadPort = 0;
        public static final int buttonA = 1;
        public static final int buttonB = 2;
        public static final int buttonX = 3;
        public static final int buttonY = 4;
        public static final int bumpLeft = 5;
        public static final int bumpRight = 6;

    public static final class DrivetrainConstants{

        //drivetrain constants
        public static final int leftFrontMotorID = 1;
        public static final int rightFrontMotorID = 3;
        public static final int leftBackMotorID = 2;
        public static final int rightBackMotorID = 4;
        // Current limit for drivetrain motors
        public static final int kCurrentLimit = 60;
        
    }

    public static final class LauncherConstants {
        //launcher constants
        public static final int kfeedWheelMotorID = 5;
        public static final int klaunchWheelMotorID = 6;
        // Current limit for launcher and feed wheels
        public static final int kLauncherCurrentLimit = 80;
        public static final int kFeedCurrentLimit = 80;
        // Speed for intaking and launching. 
        //Intake speeds are negative to in reverse
        public static final double kLauncherSpeed = 1;
        public static final double kLaunchFeederSpeed = 1;
        public static final double kIntakeLauncherSpeed = -1;
        public static final double kIntakeFeederSpeed = -.2; 
    }
}
