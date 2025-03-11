package frc.robot.commands;

import static frc.robot.Constants.ElevatorConstants.ELEVATOR_REEF_1_POSITION;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.WaitUntilCommand;
import frc.robot.Constants;
import frc.robot.Constants.ElevatorConstants;
import frc.robot.Constants.ArmConstants;

import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.subsystems.EndEffector;
import frc.robot.subsystems.ArmSubsystem;

public class PivotPIDtesting extends SequentialCommandGroup {

    public PivotPIDtesting(ElevatorSubsystem elevatorSubsystem, ArmSubsystem armSubsystem, EndEffector endEffector) {
        addCommands(
            //PUT IN APTIL TAG AUTO ALLIGN HEREEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
            new InstantCommand(() -> armSubsystem.setArmPosition(Constants.ArmConstants.ARM_HUMAN_STATION)),
            new WaitUntilCommand(() -> (armSubsystem.isArmAtPosition(Constants.ArmConstants.ARM_HUMAN_STATION))),

            







            new InstantCommand(() -> elevatorSubsystem.setElevatorPosition(Constants.ElevatorConstants.ELEVATOR_REEF_1_POSITION)),
            new WaitUntilCommand(() -> (elevatorSubsystem.isElevatorAtPosition(Constants.ElevatorConstants.ELEVATOR_REEF_1_POSITION)))



            // new InstantCommand(() -> endEffector.runIntake(-1.0)),             
            // new WaitCommand(0.5),
            
            // new InstantCommand(() -> armSubsystem.setArmPosition(Constants.ArmConstants.ARM_STARTING_POSITION)),
            // new InstantCommand(() -> elevatorSubsystem.setElevatorPosition(Constants.ElevatorConstants.ELEVATOR_STARTING_POSITION)),


            // new WaitUntilCommand(() -> (armSubsystem.isArmAtPosition(Constants.ArmConstants.ARM_STARTING_POSITION))),
            // new InstantCommand(() -> elevatorSubsystem.setElevatorPosition(Constants.ElevatorConstants.ELEVATOR_STARTING_POSITION)),

            // new InstantCommand(() -> endEffector.stopIntake())

        );
    }
}
