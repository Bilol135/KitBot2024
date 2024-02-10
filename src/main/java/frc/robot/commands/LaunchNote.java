package frc.robot.commands;

import static frc.robot.Constants.LauncherConstants.*;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Launcher;

public class LaunchNote extends CommandBase {
    Launcher m_launcher;

    public LaunchNote(Launcher launcher){
        m_launcher = launcher;

        // indicate that this command requires the launcher system
        addRequirements(m_launcher);
    }
    
    public void initialize() {
        m_launcher.setLaunchWheel(kLauncherSpeed);
        m_launcher.setFeedWheel(kLaunchFeederSpeed);
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
