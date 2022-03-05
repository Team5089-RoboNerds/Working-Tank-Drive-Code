// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;



public class tankDrive extends SubsystemBase {
  /** Creates a new tankDrive. */

VictorSPX FLDrive, BLDrive, FRDrive, BRDrive;



  public tankDrive() {

FRDrive = new VictorSPX(Constants.FRMotor);
BRDrive = new VictorSPX(Constants.BRMotor);
FLDrive = new VictorSPX(Constants.FLMotor);
BLDrive = new VictorSPX(Constants.BLMotor);


  }

  public void setRaw(double Right, double Left){

FRDrive.set(ControlMode.PercentOutput, Right);
BRDrive.set(ControlMode.PercentOutput, Right);
FLDrive.set(ControlMode.PercentOutput, Left);
BLDrive.set(ControlMode.PercentOutput, Left);

  }




  @Override
  public void periodic() {
    // This method will be called once per scheduler run
 
 
 
 
  }




}
