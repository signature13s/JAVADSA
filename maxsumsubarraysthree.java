//kadane's approach
public class maxsumsubarraysthree {
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int maxsum = Integer.MIN_VALUE;
        int currsum =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                currsum=0;
            }
            else{
                currsum+=arr[i];
            }
            if(currsum>maxsum){
             maxsum=currsum;}}
          System.out.println("max sum is "+ maxsum);
            
    }
}