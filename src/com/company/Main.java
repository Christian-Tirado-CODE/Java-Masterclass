package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	PRIMITIVE TYPES
     1. WHOLE NUMBERS:
       - byte = 8 bits
       - short = 16 bits
       - int = 32 bits
       - long = 64 bits

     2. Floating-point numbers:
       - float = single precision
       - double = double precision occupies more memory.

     3. Boolen: true / false

     4. Char:

     Note:
        - It's good to know that each variation of a primitive holds differents amount of memory.
        - The most common data types used are int double, boolean.
	*/
        /* Challenge 1: Create a byte variable and set it to any valid byte number. Create a valid short variable and set it to any valid short number.
        Create an int variable, setting it to any valid int number. Lastly, then create a variable of type long, and make that equal to 50,000 plus 10 times the sum of the byte plus the short plus the integer values.
*/
        byte validByteVar = 8;
        short validShortVar = 16;
        int validIntVar = 32;
        long longVar = 50000L + (10L* (validByteVar + validShortVar + validIntVar));
     System.out.println(longVar);

     // Casting = Converting from one data type to another.
        short  shortVar = (short)(validShortVar + validIntVar);

        // Operations that consist of whole numbers will be converted to int.
        // Real Numbers when will be converted to double.

        /* CHALLENGE 2: So the challenge here is to convert a given number of pounds to kilograms. So here are the steps that you'll need to take. Firstly, you'll need to create a variable
                        with the appropriate type to store the number of pounds that we want to convert into kilograms. Then you wanna calculate the result of that.
                        So, i.e. the number of kilogrammes based on the contents of the variable above, then you wanna store that result
                        into a second variable with the appropriate type. And third, we wanna print out the result of your calculation.
                        Hint: one pound is equal to 0.45359237 of a kilogram.


                        */
        float pounds = 156.8F;
        double kilograms = pounds * 0.45359237D;
        System.out.println(kilograms);

        /*
            Create a method called calcFeetAndInchesToCentimeters.
            It needs to have two parameters.Feet is the first parameter and inches is the 2nd one.
            You should validate that the first parameter feet is >= 0;
            You should validate that the second parameter feet is >= 0 and <= 12;
            If both are valid, calculate how many centimeters comprise the feet and inches passed to this method and return that value.
            Overload that method by passing only one parameter inches.
            Validate that it is greater than 0. return -1 if it is not true else calculate how many feet are in the inches.
            Call the first method passing the correct feet and inches.
            // 1 inch = 2.54cm; 1 foot = 12 inches.
         */

       System.out.println("6ft 2inches = " + calcFeetAndInchesToCentimeters(6, 2) + "cm");

    }


    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
       if(feet <= 0 || inches < 0 ||  inches > 12){
           return -1;
       }
       double feetConvertedToCentimeters = (feet * 12) * 2.54;
       double inchesConvertedToCentimeters = inches * 2.54;
        return feetConvertedToCentimeters + inchesConvertedToCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if(inches < 0 ||  inches > 12){
            return -1;
        }

        int inchesToFeet = inches / 12;
        return calcFeetAndInchesToCentimeters(inchesToFeet, inches);
    }
}




