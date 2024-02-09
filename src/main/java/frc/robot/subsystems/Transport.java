package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class Transport extends SubsystemBase {

    private CANSparkMax leftMotor;
    private CANSparkMax rightMotor;

    public Transport() {
        leftMotor = new CANSparkMax(Constants.TransportConstants.leftCANSparkID, MotorType.kBrushless);
        rightMotor = new CANSparkMax(Constants.TransportConstants.leftCANSparkID, MotorType.kBrushless);
    }

    public void setSpeed(double speed) {
        //Assuming Right Motor Needs To Spin In Negative Direction

        leftMotor.set(speed);
        rightMotor.set(-speed);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
