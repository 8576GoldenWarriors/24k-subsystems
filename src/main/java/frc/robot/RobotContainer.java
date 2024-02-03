// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.ControllerConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.IntakeIn;
import frc.robot.commands.IntakeOut;
import frc.robot.commands.Shoot;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {

  public static final Intake m_Intake = new Intake();
  public static final Shooter m_Shooter = new Shooter();

  public static final CommandXboxController operatorController = 
    new CommandXboxController(Constants.ControllerConstants.kOperatorControllerPort);
    
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }


  private void configureBindings() {
    // Intake
    operatorController.a().onTrue(new IntakeIn(m_Intake));
    operatorController.x().onTrue(new IntakeOut(m_Intake));

   //Shooter
    operatorController.y().onTrue(new Shoot(m_Shooter));  //b button ends shoot command, defined in shoot command
    
    //operatorController.a().and(operatorController.leftBumper()).onTrue( COMMAND FOR INTAKE TO 0 )
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
