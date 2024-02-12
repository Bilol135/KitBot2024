package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Launcher;
import static frc.robot.Constants.LauncherConstants.*;

public class PrepareLaunch extends Command {
    Launcher m_launcher;

    public PrepareLaunch(Launcher launcher){
        m_launcher = launcher;

        addRequirements(m_launcher);
    }

    public void initialize() {
        m_launcher.setLaunchWheel(kLauncherSpeed);
        //m_launcher.setFeedWheel(kLauncherSpeed);
    }

    public void execute() {
     
    }
    
    public void end(boolean interrupted) {

    }
    
    public boolean isFinished() {
        return false;
    }
}
