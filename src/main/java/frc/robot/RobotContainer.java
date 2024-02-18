// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.Autos;
import frc.robot.commands.Climb;
import frc.robot.commands.ClimbDown;
import frc.robot.commands.IntakeDown;
import frc.robot.commands.IntakeUp;
import frc.robot.commands.IntakeIn;
import frc.robot.commands.IntakeOut;
import frc.robot.commands.Shoot;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Transport;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;


public class RobotContainer {

  public static final Intake m_Intake = new Intake();
  public static final Shooter m_Shooter = new Shooter();

  //public static final Transport m_Transport = new Transport();
  public static final Climber m_Climber = new Climber();


  public static final CommandXboxController driverController = 
    new CommandXboxController(Constants.ControllerConstants.kDriverControllerPort);

  public static final CommandXboxController operatorController = 
    new CommandXboxController(Constants.ControllerConstants.kOperatorControllerPort);
    
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }


  private void configureBindings() {
    // Intake
    operatorController.a().whileTrue(new IntakeIn(m_Intake));
    operatorController.x().whileTrue(new IntakeOut(m_Intake));

   //Shooter
   //On the doc it says y should be toggle, change to this if needed.
   //operatorController.y().onTrue(new Shoot(m_Shooter));
    operatorController.y().whileTrue(new Shoot(m_Shooter));  //b button ends shoot command, defined in shoot command
    
    //Climber
    //Window button is button #7. Retracts the climber.
    operatorController.button(7).onTrue(new ClimbDown(m_Climber));
    //Three line button is button #8. Extends the climber.
    operatorController.button(9).onTrue(new Climb(m_Climber));
    
    //Arm
    //Commented bindings match the documented bindings
    operatorController.a().and(operatorController.leftBumper()).whileTrue( new IntakeUp(m_Intake) );
    operatorController.x().and(operatorController.leftBumper()).whileTrue( new IntakeDown(m_Intake) );
    //operatorController.a().and(operatorController.leftBumper()).onTrue(new IntakeUp(m_Intake));
    //operatorController.x().and(operatorController.leftBumper()).onTrue(new IntakeDown(m_Intake));
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
