package basics;
// Package name – helps organize classes into folders

public class Arrays {
// Class name (Arrays). This is your program container

    public static void main(String[] args) {
        // Main method – program execution starts here

        int[] a = new int[5];
        // Declares an integer array named 'a' with size 5
        // Default values of int array elements = 0
        // Index positions: 0, 1, 2, 3, 4

        a[4] = 55;
        // Assigns value 55 to the element at index 4 (last position)

        System.out.println(a);
        // Prints the array reference (memory address),
        // NOT the actual elements → output looks like [I@1a2b3c

        for (int i = 0; i < 5; i++) {
            // Traditional for loop
            // I start from 0 and goes till 4

            System.out.println(a[i]);
            // Prints each array element using index
        }

        for (int i : a) {
            // Enhanced for loop (for-each loop)
            // I directly stores each value of the array

            System.out.println(i);
            // Prints each element one by one
        }
    }
}
