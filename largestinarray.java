// import java.util.*;
public class largestinarray {

    public static void main(String[] args) {
        int arr[]={4,5,8,9,5,4,2,5,651,454,6,1546,51541891,145445,754,4444,44,5,5};

        int largest=Integer.MIN_VALUE;
        System.out.println(largest);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
               largest=arr[i];

            }
        }
        System.out.println(largest);
    }
}