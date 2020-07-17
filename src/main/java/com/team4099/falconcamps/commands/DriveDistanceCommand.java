package com.team4099.falconcamps.commands;

import com.team4099.falconcamps.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import io.github.oblarg.oblog.Loggable;
import io.github.oblarg.oblog.annotations.Log;

public class DriveDistanceCommand extends CommandBase implements Loggable {
    private double distanceMeters;
    private Drivetrain drivetrain;
    @Log private PIDController left = new PIDController(0, 0, 0);
    @Log private PIDController right = new PIDController(0, 0, 0);

    public DriveDistanceCommand(double distanceMeters, Drivetrain drivetrain) {
        this.distanceMeters = distanceMeters;
        this.drivetrain = drivetrain;
        this.addRequirements(drivetrain);
    }
    @Override
public void execute(){
    double LeftPower = left.calculate(drivetrain.leftDistance(), distanceMeters);
    double RightPower = right.calculate(drivetrain.rightDistance(), distanceMeters);
    drivetrain.setLRPower(LeftPower, RightPower);
    }
}
