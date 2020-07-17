package com.team4099.falconcamps;

import com.team4099.falconcamps.commands.DriveDistanceCommand;
import com.team4099.falconcamps.commands.ShootCommand;
import com.team4099.falconcamps.commands.ShooterIdleCommand;
import com.team4099.falconcamps.commands.TurnAngleCommand;
import com.team4099.falconcamps.subsystems.Drivetrain;
import com.team4099.falconcamps.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;

public class RobotContainer {
    public Drivetrain drivetrain = new Drivetrain();
    public Shooter shooter = new Shooter();

    public RobotContainer() {
        shooter.setDefaultCommand(new ShooterIdleCommand(shooter));
    }

    public Command getAutonomousCommand() {
        ShootCommand shoot = new ShootCommand(shooter);
        DriveDistanceCommand distance = new DriveDistanceCommand(2, drivetrain);
        TurnAngleCommand angle = new TurnAngleCommand(70, drivetrain);
        return new SequentialCommandGroup(new ParallelRaceGroup(shoot, new WaitCommand(5)), distance, angle);
    }
}
