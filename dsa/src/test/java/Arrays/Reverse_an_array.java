package Arrays;

public class Reverse_an_array {

    public static int[] reverseArrayFirstMethod(int [] arr){
        int [] ans =new int[arr.length];
        int j =0;
        for(int i =arr.length-1;i>=0;i--){
            ans[j++]=arr[i];
        }

        return ans;
    }

    // Second method to reverse the array in place (without using extra space)
    public static void reverse_An_array_Second_method(int[] arr) {
        int i = 0; // Use index 0 for the starting point
        int j = arr.length - 1; // Use the last index for the ending point
        int temp;

        // Swap elements until the middle is reached
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; // Move start index towards the center
            j--; // Move end index towards the center
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};

        int [] reverse_Array=reverseArrayFirstMethod(arr);
        System.out.println("After reversing the array is : ");
        for(int i =0;i<reverse_Array.length;i++){
            System.out.print(reverse_Array[i] + " ");
        }
        System.out.println();

        reverse_An_array_Second_method(arr);
        System.out.println("After reversing the array is : ");
        for(int i =0;i<reverse_Array.length;i++){
            System.out.print(reverse_Array[i] + " ");
        }

    }
}
