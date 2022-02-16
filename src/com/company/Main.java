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
        /* Challenge: Create a byte variable and set it to any valid byte number. Create a valid short variable and set it to any valid short number.
        Create an int variable, setting it to any valid int number. Lastly, then create a variable of type long, and make that equal to 50,000 plus 10 times the sum of the byte plus the short plus the integer values.
*/
        byte validByteVar = 8;
        short validShortVar = 16;
        int validIntVar = 32;
        long longVar = 50000L + (10L* (validByteVar + validShortVar + validIntVar));
     System.out.println(longVar);
    }
}
