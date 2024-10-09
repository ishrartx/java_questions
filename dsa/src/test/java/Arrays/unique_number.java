package Arrays;

public class unique_number {

    public static int uniquenumber(int [] arr){
        for(int i =0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }

        int unique_number=-1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                unique_number=arr[i];
            }
        }
        return unique_number;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};
        System.out.println("unique number in the array is: " + uniquenumber(arr));  // Should return false

    }
}
