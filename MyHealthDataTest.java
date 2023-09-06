package lab_assignment1;

/**
 * File name: Patient.java
 * Author: Hanbin Lee
 * Course: CST8284 - OOP
 * Assignment: Lab Assignment 1
 * Professor: Hesham Saadawi
 * Purpose: This file accepts user input and displays all the data with formatted template.
 * Class list: Patient
 */

import java.util.Scanner;

/**
 * This class accepts user inputs and display those data using displayMyHealthData().
 * @author HanbinLee
 *
 */
public class MyHealthDataTest {
	
	/**
	 * The entry point for displaying the health data
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		
		/**
		 * object of Patient
		 */
		Patient patient = new Patient();
		Scanner sc = new Scanner(System.in);
		
		/**
		 * String value type of health data
		 */
		String firstName,lastName, gender;
		
		/**
		 * int value type of health data
		 */
		int birthYear, birthMonth, birthDay;
		
		/**
		 * double value type of health data
		 */
		double height,weight;
		
		/**
		 * Prompt the user to input first name and set the value
		 */
		System.out.print("First name: ");
		firstName = sc.next();
		patient.setFirstName(firstName);
		
		/**
		 * Prompt the user to input last name and set the value
		 */
		System.out.print("Last name: ");
		lastName = sc.next();
		patient.setLastName(lastName);
		
		/**
		 * Prompt the user to input gender and set the value
		 */
		System.out.print("Gender: ");
		gender = sc.next();
		patient.setGender(gender);
		
		/**
		 * Prompt the user to input year of birth and set the value
		 */
		System.out.print("Year of birth: ");
		birthYear = sc.nextInt();
		patient.setBirthYear(birthYear);
		
		/**
		 * Prompt the user to input month of birth and set the value
		 */
		System.out.print("Month of birth: ");
		birthMonth = sc.nextInt();
		patient.setBirthMonth(birthMonth);
		
		/**
		 * Prompt the user to input day of birth and set the value
		 */
		System.out.print("Day of birth: ");
		birthDay = sc.nextInt();
		patient.setBirthDay(birthDay);
		
		/**
		 * Prompt the user to input height and set the value
		 */
		System.out.print("Height: ");
		height = sc.nextDouble();
		patient.setHeight(height);
		
		/**
		 * Prompt the user to input weight and set the value
		 */
		System.out.print("Weight: ");
		weight = sc.nextDouble();
		patient.setWeight(weight);
		
		/**
		 * displays patient's health data
		 */
		System.out.println();
		patient.displayMyHealthData();
		
		
	}
}
