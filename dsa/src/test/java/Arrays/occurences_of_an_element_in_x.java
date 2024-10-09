package Arrays;

public class occurences_of_an_element_in_x {

    public static int countOccureneces(int []arr, int x){
        int count =0;
        for(int i =0;i<arr.length;i++){
            if (arr[i]==x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
     int [] arr={1,3,3,4,5,6,3,3};
     int number=3;
     int count=countOccureneces(arr,3);
        System.out.println("the count of " +number+ " is : "+count);
    }
}
