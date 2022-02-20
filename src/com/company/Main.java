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

        int[] integers = new int[5];
        integers = getIntegers();
        printArray(integers);
        sortArray(integers);

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
