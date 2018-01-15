/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4959.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	// ***** HID Controllers *****
	public static final int XBOX_PORT = 0;
	public static final int XBOX_TWO_PORT = 1;

	// ***** HID Controller Buttons/Joysticks *****
	public static final int LEFT_X_AXIS = 0;
	public static final int LEFT_Y_AXIS = 1;
	public static final int RIGHT_X_AXIS = 4;
	public static final int RIGHT_Y_AXIS = 5;

	public static final int LEFT_TRIGGER = 2;
	public static final int LEFT_BUMPER = 5;
	public static final int RIGHT_TRIGGER = 3;
	public static final int RIGHT_BUMPER = 6;

	public static final int BACK_BUTTON = 7;
	public static final int START_BUTTON = 8;

	public static final int A_BUTTON = 1;
	public static final int B_BUTTON = 2;
	public static final int X_BUTTON = 3;
	public static final int Y_BUTTON = 4;

	// ***** Motor/Speed Controller Ports *****
	public static final int FRONT_LEFT_DRIVE_MOTOR_PORT = 0;
	public static final int REAR_LEFT_DRIVE_MOTOR_PORT = 1;
	public static final int FRONT_RIGHT_DRIVE_MOTOR_PORT = 2;
	public static final int REAR_RIGHT_DRIVE_MOTOR_PORT = 3;

	public static final int BOTTOM_ARM_PORT = 4;
	public static final int TOP_ARM_PORT = 5;
}
