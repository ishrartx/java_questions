package Arrays;

public class largest_element {

    public static int largestElement(int[] arr){
        int largest=arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        return largest;
    }

    public static int secondlargestelemet(int [] arr){
        int largest=largestElement(arr);
        int secondlargest=-1;
        for (int i = 0; i < arr.length; i++) {
            // Fix: Compare with largest to find second largest
            if (arr[i] != largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }


    public static void main(String[] args) {
        int [] arr ={1,4,5,10,45,35};
        int largesy=largestElement(arr);
        System.out.println("the largest element is " +largesy);

        int secondlargesy=secondlargestelemet(arr);
        System.out.println("the largest element is " +secondlargesy);
    }
}
