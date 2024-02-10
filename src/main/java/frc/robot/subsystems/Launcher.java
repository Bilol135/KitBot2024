package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.SupplyCurrentLimitConfiguration;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.LauncherConstants.*;


public class Launcher extends SubsystemBase{
    TalonSRX m_launchWheel;
    TalonSRX m_feedWheel;

    public Launcher(){
        m_launchWheel = new TalonSRX(klaunchWheelMotorID);
        m_feedWheel = new TalonSRX(kfeedWheelMotorID);

        m_launchWheel.configFactoryDefault();
        m_feedWheel.configFactoryDefault();

        m_launchWheel.configSupplyCurrentLimit(new SupplyCurrentLimitConfiguration(true, 80, 30, 0.1));
        m_feedWheel.configSupplyCurrentLimit(new SupplyCurrentLimitConfiguration(true, 80, 30, 0.1));
        m_launchWheel.configPeakCurrentLimit(kLauncherCurrentLimit);
        m_feedWheel.configPeakCurrentLimit(kFeedCurrentLimit);
    }

    public void setLaunchWheel(double speed) {
        m_launchWheel.set(TalonSRXControlMode.PercentOutput, speed);
    }

    public void setFeedWheel(double speed) {
        m_feedWheel.set(TalonSRXControlMode.PercentOutput, speed);
    }

    public void stop() {
        m_launchWheel.set(TalonSRXControlMode.PercentOutput, 0);
        m_feedWheel.set(TalonSRXControlMode.PercentOutput, 0);
    }
}
