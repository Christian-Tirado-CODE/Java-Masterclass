package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Create a program using arrays that sorts a list of integers in descending order(highest to lowest).
        Set up the program so that the numbers to sort are read from the keyboard.
        Implement the following methods: getIntegers, printArray and sortIntegers.
        getIntegers() returns an array of entered integers from keyboard.
        sortIntegers should sort the array and return a new array containing the sorted numbers.
        you will have to figure out how to copy the array elements from the passed array into a new array and sort them and return the new sorted array.

         */

//        int[] integers = new int[5];
//        integers = getIntegers();
//        printArray(integers);
//        sortArray(integers);

        /*
            Create a program that implements a simple mobile phone with the following capabilities.
            Able to store, modify, remove and query contact names.
            You will want to create a separate class for Contacts (name and phone number).
            Create a master class (MobilePhone) that holds the ArrayList of Contacts.
            The MobilePhone class has the functionality listed above.
            Add the menu of options that are available.
            Options: Quit, print list of contacts, add new contact, update existing contact, remove contact.
            Be sure not to expose the inner workings of the ArrayList to MobilePhone.
            MobilePhone should do everything with Contact objects only.
         */
         MobilePhone phone = new MobilePhone();
         boolean quit = false;
         Scanner scanner = new Scanner(System.in);
         int option;
         do {

              System.out.println("Options: 1. Quit, 2. print list of contacts, 3.add new contact, 4. update existing contact, 5. remove contact.");
              option = scanner.nextInt();
              String inputName;
              String inputPhoneNumber;
              switch (option){
                  case 1:
                       quit = true;
                       break;
                  case 2:
                       phone.printContacts();
                       break;
                  case 3:
                       System.out.println("Enter name: ");
                        inputName = scanner.next();
                      System.out.println("Enter phone number: ");
                        inputPhoneNumber = scanner.next();
                       phone.storeContact(inputName, inputPhoneNumber);
                       break;
                  case 4:
                      System.out.println("Enter the name of the contact you wish to update: ");
                       inputName = scanner.next();
                       if(phone.hasContact(inputName)){
                           System.out.println("Enter phone number: ");
                           inputPhoneNumber = scanner.next();
                           phone.modifyContact(inputName, inputPhoneNumber);
                       }

                        break;
                  case 5:
                      System.out.println("Enter name: ");
                      inputName = scanner.next();
                      phone.removeContact(inputName);
                      break;
              }
         }while (!quit);

        scanner.close();
    }

    public static int[] getIntegers(){
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[5];
        for(int i=0; i < 5; i++){
            System.out.println("Enter value for index " + i  + ": ");
            integers[i] = scanner.nextInt();

        }
        scanner.close();
        return integers;
    }
    public static void printArray(int[] array){
        for(int i=0; i < array.length; i++){
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }

    public static int[] sortArray(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i=0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println("=== Sorted List ====");
        printArray(sortedArray);
     return sortedArray;
    }
}
