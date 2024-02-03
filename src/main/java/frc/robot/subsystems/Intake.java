// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  private CANSparkMax rollerMotor;
  private CANSparkMax armMotor;
  /** Creates a new Intake. */
  public Intake() {
    rollerMotor = new CANSparkMax(Constants.IntakeConstants.rollerCANSparkID, MotorType.kBrushless);
    armMotor = new CANSparkMax(Constants.IntakeConstants.pivotCANSparkID, MotorType.kBrushless);
  }
  
  public void setRollerSpeed(double rollerSpeed){
    rollerMotor.set(rollerSpeed);
  }

  public void setArmSpeed(double armSpeed){
    armMotor.set(armSpeed);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
