// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
//import jdk.vm.ci.meta.Constant;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import frc.robot.RobotContainer;

public class tankDriveCommand extends CommandBase {
  /** Creates a new tankDriveCommand. */
  VictorSPX FRMotor, BRMotor,FLMotor, BLMotor;
  public tankDriveCommand() {
    // Use addRequirements() here to declare subsystem dependencies.

addRequirements(RobotContainer.mtankDrive);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
FRMotor = new VictorSPX(Constants.FRMotor);
BRMotor = new VictorSPX(Constants.BRMotor);
FLMotor = new VictorSPX(Constants.FLMotor);
BLMotor = new VictorSPX(Constants.BLMotor);

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {


    
double Left_Side = RobotContainer.mainController.getRawAxis(1);
double Right_Side = RobotContainer.mainController.getRawAxis(3);

RobotContainer.mtankDrive.setRaw(Right_Side, -Left_Side);


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
