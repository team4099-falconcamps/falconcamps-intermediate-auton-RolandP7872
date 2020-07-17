package com.team4099.falconcamps.commands;

import com.team4099.falconcamps.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.CommandBase;
import io.github.oblarg.oblog.Loggable;

public class ShooterIdleCommand extends CommandBase implements Loggable {
    private Shooter shooter;

    public ShooterIdleCommand(Shooter shooter) {
        this.shooter = shooter;
        this.addRequirements(shooter);
    }

    @Override
    public void initialize() {
        shooter.setSetpoint(0);
    }
}
