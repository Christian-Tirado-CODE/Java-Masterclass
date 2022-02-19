package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
            Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.

            Write the following methods (instance methods):

            *Method named getFirstName without any parameters, it needs to return the value of the firstName field.
            *Method named getLastName without any parameters, it needs to return the value of the lastName field.
            *Method named getAge without any parameters, it needs to return the value of the age field.
            *Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
            *Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
            *Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
            *Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
            *Method named getFullName without any parameters, it needs to return the full name of the person.
                *In case both firstName and lastName fields are empty, Strings return an empty String.
                *In case lastName is an empty String, return firstName.
                *In case firstName is an empty String, return lastName.

            To check if s String is empty, use the method isEmpty from the String class. For example, firstName.isEmpty() returns true if the String is empty or in other words, when the String does not contain any characters.


            TEST EXAMPLE

            TEST CODE:

            Person person = new Person();
            person.setFirstName("");   // firstName is set to empty string
            person.setLastName("");    // lastName is set to empty string
            person.setAge(10);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setFirstName("John");    // firstName is set to John
            person.setAge(18);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setLastName("Smith");    // lastName is set to Smith
            System.out.println("fullName= " + person.getFullName());

            OUTPUT

            fullName=
            teen= false
            fullName= John
            teen= true
            fullName= John Smith


            NOTE: All methods should be defined as public NOT public static.

            NOTE: In total, you have to write 8 methods.

            NOTE: Do not add the main method to the solution code.

         */

        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());




          /*
    A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers, and i is a solution of the equation x2 = −1. Because no real number satisfies this equation, i is called an imaginary number. For the complex number a + bi, a is called the real part, and b is called the imaginary part. To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts. For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.

Write a class with the name ComplexNumber. The class needs two fields (instance variables) with name real and imaginary of type double. It represents the Complex Number.

The class needs to have one constructor. The constructor has parameters real and imaginary of type double and it needs to initialize the fields.

Write the following methods (instance methods):
* Method named getReal without any parameters, it needs to return the value of real field.
* Method named getImaginary without any parameters, it needs to return the value of imaginary field.
* Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
* Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the corresponding instance variables.
* Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields, in other words, it needs to do a complex number subtract operation as described above.
* Method named subtract with one parameter other of type ComplexNumber. It needs to subtract the other parameter from this complex number.


TEST EXAMPLE

→ TEST CODE:

ComplexNumber one = new ComplexNumber(1.0, 1.0);
ComplexNumber number = new ComplexNumber(2.5, -1.5);
one.add(1,1);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
one.subtract(number);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
number.subtract(one);
System.out.println("number.real= " + number.getReal());
System.out.println("number.imaginary= " + number.getImaginary());

→ OUTPUT

one.real= 2.0
one.imaginary= 2.0
one.real= -0.5
one.imaginary= 3.5
number.real= 3.0
number.imaginary= -5.0


NOTE: Try to avoid duplicated code.

NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 6 methods.

NOTE: Do not add a main method to the solution code.

     */

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    /*
    Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.

Write the following methods (instance methods):
* Method named getWidth without any parameters, it needs to return the value of width field.
* Method named getHeight without any parameters, it needs to return the value of height field.
* Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
* Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
* Method named getArea without any parameters, it needs to return the area of the wall.


TEST EXAMPLE

→ TEST CODE:

1 Wall wall = new Wall(5,4);
2 System.out.println("area= " + wall.getArea());
3
4 wall.setHeight(-1.5);
5 System.out.println("width= " + wall.getWidth());
6 System.out.println("height= " + wall.getHeight());
7 System.out.println("area= " + wall.getArea());

→ OUTPUT:

area= 20.0
width= 5.0
height= 0.0
area= 0.0


NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 5 methods and 2 constructors.

NOTE: Do not add a main method to the solution code.

     */
//         Wall wall = new Wall(5,4);
//         System.out.println("area= " + wall.getArea());
//         wall.setHeight(-1.5);
//         System.out.println("width= " + wall.getWidth());
//         System.out.println("height= " + wall.getHeight());
//         System.out.println("area= " + wall.getArea());

         Outlander outlander = new Outlander(36);
         outlander.accelerate(30);
        outlander.accelerate(20);

        /*
        Create a single room of a house using composition.
        Think about the things that should be included in the room.
        Maybe physical parts of the house but furniture as well.
        Add at least one method to access an object via a getter and then access via a public method that object that was returned from the getter.
        Also, add at least one method to hide the object completely(not using a getter but to access the object used in composition within the main class).

         */
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
