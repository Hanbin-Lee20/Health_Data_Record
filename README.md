# Health_Data_Record

In this repositiry, there's 3 different java files:

1. MyHealthDataTest
   Entry point for accepting user inputs: Full name, Gender, Date of birth, Height, Weight and Age.
  
2. Patient
   This class sets and gets all the user input. It also has 5 methods:
   1. getBMI() calculates actual BMI using height and weight.
   2. Age() calculates age using year of birth.
   3. MaximumHeartRate() calculates maximum heart rate by calling Age().
   4. targetHeartRateRange() displays heart rate range using value returned from MaximumHeartRate().
   5. displayMyHealthData() displays all the user input with specific format using printf.
