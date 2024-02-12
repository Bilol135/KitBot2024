package frc.robot.commands;

import static frc.robot.Constants.LauncherConstants.kIntakeFeederSpeed;
import static frc.robot.Constants.LauncherConstants.kIntakeLauncherSpeed;
import static frc.robot.Constants.LauncherConstants.kLaunchFeederSpeed;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Launcher;

public class IntakeNote extends Command {
    Launcher m_launcher;

    public IntakeNote(Launcher launcher){
        m_launcher = launcher;

        // indicate that this command requires the launcher system
        addRequirements(m_launcher);
    }
    
    public void initialize() {
        m_launcher.setLaunchWheel(kIntakeLauncherSpeed);
        m_launcher.setFeedWheel(kIntakeFeederSpeed);
    }

    public void execute() {
       
    }
    
    public boolean isFinished() {
        return false;
    }

    public void end(boolean interrupted) {
        m_launcher.stop();
    }
}
