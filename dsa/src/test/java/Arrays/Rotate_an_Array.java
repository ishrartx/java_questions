package Arrays;

import ArrayHelperClass.ArrayHelper;

public class Rotate_an_Array {

    public static int[] rotate_an_Array(int [] arr, int k ){
        int n =arr.length;
        k=k%n;
        int [] ans=new int[n];
        int j =0;
        for(int i = n-k;i<n;i++){
            ans[j++]=arr[i];
        }

        for(int i =0;i<n-k;i++){
            ans[j++]=arr[i];
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int [] reverse_Array=rotate_an_Array(arr,1);
        System.out.println("After rotating  the array is : ");
        for(int i =0;i<reverse_Array.length;i++){
            System.out.print(reverse_Array[i] + " ");
        }
        System.out.println(" ");

        int [] reverse_Array2=rotate_an_Array(arr,2);
        System.out.println("After rotating  the array is : ");
        ArrayHelper.printarray(reverse_Array2);


        int [] reverse_Array3=rotate_an_Array(arr,3);
        System.out.println("After rotating  the array is : ");
        ArrayHelper.printarray(reverse_Array3);
    }
}
