package Arrays;

public class check_array_sorted {

    public static boolean isArraySorted(int[] arr) {
        // Iterate over the array and check if each element is less than or equal to the next
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // If any element is greater than the next, array is not sorted
            }
        }
        return true; // If no violations are found, the array is sorted
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 6, 7, 8, 2};
        System.out.println("Is sorted: " + isArraySorted(arr));  // Should return false

        int[] sortedArr = {1, 2, 3, 4, 5};
        System.out.println("Is sorted: " + isArraySorted(sortedArr));  // Should return true
    }
}
