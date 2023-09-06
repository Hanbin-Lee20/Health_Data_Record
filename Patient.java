package lab_assignment1;
import java.time.LocalDate;
import java.time.Year;
//23W CST8284
//Assignment 1: Patient.java
/**
 * File name: Patient.java
 * Author: Hanbin Lee
 * Course: CST8284 - OOP
 * Assignment: Lab Assignment 1
 * Professor: Hesham Saadawi
 * Purpose: Update the source code provided to work as instructed.
 * Class list: Patient
 */


//This system maintains important health information about a patient.
//Note: This class assumes values passed to the set methods are correct.
// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!
public class Patient {

//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

//START CODE
//END CODE
	
	/**
	 * patient's first name for recording health data
	 */
	private String firstName;
	
	/**
	 * patient's last name for recording health data
	 */
	private String lastName;
	
	/**
	 * patient's gender for recording health data
	 */
	private String gender;
	
	/**
	 * patient's year of birth for recording health data
	 */
	private int birthYear;
	
	/**
	 * patient's month of birth for recording health data
	 */
	private int birthMonth;
	
	/**
	 * patient's day of birth for recording health data
	 */
	private int birthDay;
	
	/**
	 * height of the patient in inches for recording health data
	 */
	private double height;
	
	/**
	 * weight of the patient in pounds for recording health data
	 */
	private double weight;
	
	
// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
//START CODE
	
	/**
	 * This is the default constructor without parameters
	 */
	public Patient() {
		
	}
	
	/**
	 * The constructor sets following parameters as passed
	 * @param firstName the first name of the patient
	 * @param lastName the last name of the patient
	 * @param gender the gender name of the patient
	 * @param birthYear the year of birth  of the patient
	 * @param birthMonth the month of birth of the patient
	 * @param birthDay the day of birth of the patient
	 * @param height the height of the patient in inches
	 * @param weight the weight of the patient in pounds
	 */
	public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay, double height, double weight) {
		
		this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.height = height;
        this.weight = weight;
	}
//END CODE
	


//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.
	
	/**
	 * Returns the first name of the patient
	 * @return firstName the first name of the patient
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the patient
	 * @param firstName the first name of the patient
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the last name of the patient
	 * @return lastName the last name of the patient
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the patient
	 * @param lastName the last name of the patient
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the gender of the patient
	 * @return gender the gender of the patient
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender of the patient
	 * @param gender the gender of the patient
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Returns the year of birth of the patient
	 * @return birthYear the year of birth of the patient
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * Sets the year of birth of the patient
	 * @param birthYear the year of birth of the patient
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * Returns the month of birth of the patient
	 * @return birthMonth the month of birth of the patient
	 */
	public int getBirthMonth() {
		return birthMonth;
	}
	
	/**
	 * Sets the month of birth of the patient
	 * @param birthMonth the month of birth of the patient
	 */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	/**
	 * Returns the day of birth of the patient
	 * @return the day of birth of the patient
	 */
	public int getBirthDay() {
		return birthDay;
	}
	
	/**
	 * Sets the day of birth of the patient
	 * @param birthDay the day of birth of the patient
	 */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	
	/**
	 * Returns height of the patient
	 * @return height the height of the patient
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Sets height of the patient
	 * @param height the height of the patient
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Returns weight of the patient
	 * @return weight the weight of the patient
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * Sets the weight of the patient
	 * @param weight the weight of the patient
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!
	
	/**
	 * Calculates patient's BMI value by following the formula below
	 * @return BMI value
	 */
	public double getBMI() {
	   return (getWeight() * 703) / (getHeight() * getHeight());
	} 

// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION
	
	/**
	 * Age() method calculates patient's age by subtracting the year of birth from current year
	 * @return age the age of the patient
	 */
	public int Age() {
		int currentYear = Year.now().getValue();
		int age = (currentYear - getBirthYear());
		return age;
	}
	
	/**
	 * MaximumHeartRate() method calculates maximum heart rate by subtracting age from 220
	 * @return numeric value which is maximum heart rate
	 */
	public int MaximumHeartRate() {
		return 220 - Age();
	}

	/**
	 * Range of targeted heart rate formatting prinf
	 */
	public void targetHeartRateRange() {
		System.out.printf("Target heart rate: %f ~ %f %n",(MaximumHeartRate() * 0.5) + " ~ " + (MaximumHeartRate() * 0.85));
	}
	
	/**
	 * This method records patient's health data and displays whole input data.
	 */
	public void displayMyHealthData() { 
	
	//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
	   
	// START CODE
	   System.out.printf("First name: %s %n", firstName);
	   System.out.printf("Last name: %s %n", lastName);
	   System.out.printf("Gender: %s %n", gender);
	   System.out.printf("Year of birth, month of birth, day of birth: %04d-%02d-%02d %n", birthYear, birthMonth, birthDay);
	   System.out.printf("Height: %.1f inches %n", height);
	   System.out.printf("Weight: %.1f pounds %n", weight);
       System.out.printf("Age: %d years old %n", Age());
       System.out.printf("Maximum heart rate: %d %n", MaximumHeartRate());
       
       double minTarget = MaximumHeartRate() / 2;
       double maxTarget = MaximumHeartRate() * 0.85;
       System.out.printf("Target heart rate: %.3f ~ %.3f %n", minTarget, maxTarget);
       
       double bmi = getBMI();
       System.out.printf("BMI: %.1f %n", bmi);
       System.out.println();
	//END CODE
	   
	//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!
	
	   System.out.println("BMI VALUES");
	   System.out.println("Underweight: less than 18.5");
	   System.out.println("Normal:      between 18.5 and 24.9");
	   System.out.println("Overweight:  between 25 and 29.9");
	   System.out.println("Obese:       30 or greater");   
	} 

} // end class Patient



