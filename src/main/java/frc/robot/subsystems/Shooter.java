package frc.robot.subsystems;

import java.util.function.BooleanSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

    public Command setShooterSpeed(double speed) {
        return Commands.none();
    }

    public BooleanSupplier isShooterAtSpeed(double speed) {
        return () -> false;
    }
}
