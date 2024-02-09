// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.controller.BangBangController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Transport;

public class Shoot extends Command {
  public Transport Transport;
  /** Creates a new Shoot. */

  public BangBangController controller = new BangBangController();

  public Shoot(Transport Transport) {
    this.Transport = Transport;

    addRequirements(Transport);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Transport.setSpeed(Constants.TransportConstants.kTransportSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Transport.setSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    
    return (RobotContainer.operatorController.getHID().getBButtonPressed()) ? true : false;

  }
}
