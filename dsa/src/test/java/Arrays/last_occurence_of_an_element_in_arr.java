package Arrays;

public class last_occurence_of_an_element_in_arr {

    public static int lastoccurence(int [] arr, int number){
        int lastoccurence=-1;
        for(int i =0;i<arr.length;i++){
            if (arr[i]==number){
                lastoccurence=i;
            }
        }
        return lastoccurence;
    }

    public static void main(String[] args) {
        int [] arr={1,3,3,4,5,6,3,3,4};
        int number=4;
        int count=lastoccurence(arr,number);
        System.out.println("the last occurence of " +number+ " is : "+count);
    }
}
