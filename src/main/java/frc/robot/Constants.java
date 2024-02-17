package frc.robot;

public final class Constants {
  public static class ControllerConstants {
    public static final int kDriverControllerPort = 1;
    public static final int kOperatorControllerPort = 0;
  }

  public static class IntakeConstants{
    public static final int IntakeSensorID = 0;

    public static final int rollerCANSparkID = 15;
    public static final int pivotCANSparkID = 13;

    public static final double kRollerInSpeed = -0.50;
    public static final double kRollerOutSpeed = 0.4;
    
    public static final double kArmUpSpeed = 0.2;
    public static final double kArmDownSpeed = -0.2;

    public static final double kDownPosition = 10;
    public static final double kUpPosition = 1;

  }

  public static class ShooterConstants{
    public static final int leftCANSparkID = 26;
    public static final int rightCANSparkID = 25;
    
    public static final double kShooterSpeed = 0.85;
  }

  public static class ClimberConstants{
    public static final int leftCANSparkID = 400;
    public static final int rightCANSparkID = 500;

    public static final double kClimberSpeed = 0.05;
    public static final double kClimberVoltage = 10.0;
  }

  public static class TransportConstants {
    public static final int leftCANSparkID = 16;
    public static final int rightCANSparkID = 17;

    public static final double kTransportSpeed = 0.85;
  }
}
