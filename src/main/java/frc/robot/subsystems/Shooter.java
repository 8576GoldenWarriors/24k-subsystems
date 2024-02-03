// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  private CANSparkMax leftMotor; 
  private CANSparkMax rightMotor;
  private CANSparkMax pivotMotor; //not implemented yet
  /** Creates a new Shooter. */
  public Shooter() {
    leftMotor = new CANSparkMax(Constants.ShooterConstants.leftCANSparkID, MotorType.kBrushless);
    rightMotor = new CANSparkMax(Constants.ShooterConstants.rightCANSparkID, MotorType.kBrushless);
  }


  public void setSpeed(double speed){
    //ASSUMING RIGHT MOTOR NEEDS TO SPIN IN NEGATIVE DIRECTION
    leftMotor.set(speed);
    rightMotor.set(-speed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
