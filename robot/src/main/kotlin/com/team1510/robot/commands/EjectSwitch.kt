package com.team1510.robot.commands


import com.team1510.robot.subsystems.ArmPID
import com.team1510.robot.OI
import com.team1510.robot.config.*
import com.team1510.robot.subsystems.Drivetrain
import com.team1510.robot.subsystems.Intake
import com.team2898.engine.async.AsyncLooper
import com.team2898.engine.motion.CheesyDrive
import com.team2898.engine.motion.DriveSignal
import edu.wpi.first.wpilibj.command.Command
import edu.wpi.first.wpilibj.command.InstantCommand

open class EjectSwitch() : InstantCommand() {

    var loop = 0
    override fun initialize() {

        //reqDistance = distance * IN_TO_ENC
    }

    override fun execute() {
        ArmPID.setFrontSwitch() //some double between min: 0 and max: 2018


        //Intake.leftIntakeTalon.set(.75)
        //Intake.rightIntakeTalon.set(.75)


    }


    override fun end() {
        //Intake.stop()
    }


}