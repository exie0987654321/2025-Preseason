// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.DriveConstants;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
  private final CommandXboxController driverController = new CommandXboxController(
      DriveConstants.DRIVER_CONTROLLER_PORT);

  public RobotContainer() {
    configureDriverBindings();
    configureOperatorBindings();
    configureDefaultCommands();
  }

  private void configureDefaultCommands() {

  }

  private void configureOperatorBindings() {

  }

  private void configureDriverBindings() {

  }
}
