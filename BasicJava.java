import java.util.*;

// Print 1-255
// Write a method that prints all the numbers from 1 to 255.

public class BasicJava {
    public void print1to255(){
        for (int i = 0; i<256; i++){
            System.out.println(i);
        }
    }

// Print odd numbers between 1-255
// Write a method that prints all the odd numbers from 1 to 255.
    
    public void printOdd(){
        for (int i=0; i<256; i++){
            if (i%2 == 1){
                System.out.println(i);
            }
        }
    }

// Print Sum
// Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far. For example, your output should be something like this:

// New number: 0 Sum: 0
// New number: 1 Sum: 1
// New number: 2 Sum: 3
// New number: 3 Sum: 6
// ...
// New number: 255 Sum: ___
// Do NOT use an array to do this exercise.

    public void printSum(){
        int sum = 0;
        for (int i=0;i<256;i++){
            sum +=i;
            // System.out.println("New number : "+i+" Sum: "+sum);
            System.out.println(String.format("New number : %s Sum: %s", i, sum));
        }
    }

// Iterating through an array
// Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.

    public void iteratingArray(int[] myArray){
        for (int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }

// Find Max
// Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.

    public void findMax(int[] myArray){
        int max = myArray[0];
        for (int i=1;i<myArray.length;i++){
            if (max<myArray[i]){
                max = myArray[i];
            }
        }
        System.out.println("Max Number in Array = "+max);
    }

// Get Average
// Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.

    public void findAvg(int[] myArray){
        double avg;
        int sum = 0;
        for (int i=0;i<myArray.length;i++){
            sum += myArray[i];
        }
        avg = sum/myArray.length;
        System.out.println("Average number in Array = "+avg);
    }

// Array with Odd Numbers
// Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].

    public ArrayList arrayOddNumber(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=1;i<256;i++){
            if (i%2==1){
                myArray.add(i);
            }
        }
        return myArray;
    }

// Greater Than Y
// Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).

    public int greaterThanY(int[] myArray, int y){
        int count =0;
        for (int i=0;i<myArray.length;i++){
            if (myArray[i]>y){
                count ++;
            }
        }
        return count;
    }

// Square the values
// Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].

    public int[] squareValue(int[] myArray){
        for(int i=0;i<myArray.length;i++){
            int square = (int)Math.pow(myArray[i],2); 
            //without (int)Math would have an error: incompatible types: possible lossy conversion from double to int
            myArray[i] = square;
        }
        return myArray;
    }

// Eliminate Negative Numbers
// Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].

    public int[] eliminateNegative(int[] myArray){
        for (int i=0; i<myArray.length;i++){
            if (myArray[i]<0){
                myArray[i] = 0;
            }
        }
        return myArray;
    }

// Max, Min, and Average
// Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]

    public int[] maxMinAvg(int[] myArray){
        int max = myArray[0];
        int min = myArray[0];
        int sum = 0;
        for (int i=0;i<myArray.length;i++){
            if (myArray[i]>max){
                max = myArray[i];
            }else if (myArray[i]<min){
                min = myArray[i];
            }
            sum += myArray[i];
        }
        int[] result = {max, min, sum/myArray.length};
        return result;
    }

// Shifting the Values in the Array
// Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.

    public int[] shiftingValue(int[] myArray){
        for (int i=1;i<myArray.length;i++){
            myArray[i-1]= myArray[i];
        }
        myArray[myArray.length-1] = 0;
        return myArray;
    }
}