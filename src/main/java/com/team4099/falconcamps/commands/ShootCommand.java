package com.team4099.falconcamps.commands;

import com.team4099.falconcamps.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.CommandBase;
import io.github.oblarg.oblog.Loggable;

public class ShootCommand extends CommandBase implements Loggable {
    private Shooter shooter;

    public ShootCommand(Shooter shooter) {
        this.shooter = shooter;
        this.addRequirements(shooter);
    }

    @Override
    public void initialize() {
        shooter.setSetpoint(5000);
    }
}
