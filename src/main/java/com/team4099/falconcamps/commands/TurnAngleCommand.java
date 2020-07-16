package com.team4099.falconcamps.commands;

import com.team4099.falconcamps.subsystems.Drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TurnAngleCommand extends CommandBase {
    private double angleDegrees;
    private Drivetrain drivetrain;

    public TurnAngleCommand(double angleDegrees, Drivetrain drivetrain) {
        this.angleDegrees = angleDegrees;
        this.drivetrain = drivetrain;
    }
@Override
public void execute(){
    
}
}
