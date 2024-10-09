package Arrays;

public class find_duplicate_number {


    public static int findDuplicate(int [] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }

            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 6, 7, 8, 2};
        System.out.println("Duplicate elements: " + findDuplicate(arr));  // Should return false


        int[] arr2 = {4, 3, 5, 6, 7, 8, 2,5};
        System.out.println("Duplicate elements: " + findDuplicate(arr2));  // Should return false


    }
}
