package Arrays;

import ArrayHelperClass.ArrayHelper;


public class Rotate_an_array_without_extra_Space {

        // Method to reverse a sub-array from index i to j
        public static void reverse_An_array_Second_method(int[] arr, int i, int j) {
            int temp;
            // Swap elements until the middle is reached
            while (i < j) {
                temp = arr[i];   // Save current element in temp
                arr[i] = arr[j]; // Move element from j to i
                arr[j] = temp;   // Move element from temp (original i) to j
                i++; // Move start index towards the center
                j--; // Move end index towards the center
            }
        }

        // Method to rotate the array by k positions
        public static void rotate(int[] arr, int k) {
            int n = arr.length;    // Length of the array
            k = k % n;             // Ensure k is within the array length

            // Example: Rotate [1, 4, 6, 7, 8] by 1 position (k=1)
            // Step 1: Reverse the first part of the array (index 0 to n-k-1)
            // In this example, reverse [1, 4, 6, 7] → [7, 6, 4, 1]
            reverse_An_array_Second_method(arr, 0, n - k - 1);

            // Step 2: Reverse the second part of the array (index n-k to n-1)
            // In this example, reverse [8] (only one element, so it remains the same)
            reverse_An_array_Second_method(arr, n - k, n - 1);

            // Step 3: Reverse the entire array
            // Reverse [7, 6, 4, 1, 8] → [8, 1, 4, 6, 7]
            reverse_An_array_Second_method(arr, 0, n - 1);
        }

        public static void main(String[] args) {
            int[] arr = {1, 4, 6, 7, 8}; // Original array

            // Rotate the array by 1 position
            // Expected output: [8, 1, 4, 6, 7]
            rotate(arr, 1);

            System.out.println("After rotating the array is: ");
            ArrayHelper.printarray(arr); // Prints the rotated array
        }
    }
