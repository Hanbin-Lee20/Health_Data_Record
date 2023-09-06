package lab_assignment1;

/**
 * File name: Patient.java
 * Author: Hanbin Lee
 * Course: CST8284 - OOP
 * Assignment: Lab Assignment 1
 * Professor: Hesham Saadawi
 * Purpose: This file is for testing getBMI() using if statement.
 * Class list: Patient
 */

/**
 * This class has main method that executes 2 tests: 1. validate it's working 2. make an error deliberately
 * @author HanbinLee
 *
 */
public class MyHealthDataTest2 {
	
	/**
	 * The entry point for testing BMI method by comparing expected and actual value using if statement.
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		
		/**
		 * This is test1 to show a successful execution of your test with no errors.
		 */			
		Patient test1 = new Patient("Hanbin", "Lee", "Male", 2000, 5, 9, 65, 110);
		double expectedBMI = 18.3;
		double actualBMI = Math.round(test1.getBMI()*10)/10.0;
		
		/**
		 * These two BMI values are same so it is true.
		 */
		if(expectedBMI == actualBMI) {
			System.out.println("The test1 has passed successfully.");
		} else {
			System.out.println("The test1 has failed.");
		}

		/**
		 * This is test2 show a failed execution of your test (as a result of introducing an error into your code)
		 */
		Patient test2 = new Patient("Keanu", "Reeves", "Male", 1964, 9, 2, 73, 165);
		double expectedBMI2 = 21.8;
		
		/**
		 * This time value 1 has added to actual value to make an error deliberately.
		 */
		double actualBMI2 = Math.round(test1.getBMI()*10)/10.0 + 1;
		
		/**
		 * These two values are different so this test is fail.
		 */
		if(expectedBMI2 == actualBMI2) {
			System.out.println("The test2 has passed successfully.");
		} else {
			System.out.println("The test2 has failed.");
		}
	}
}


