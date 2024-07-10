//Brute force
public class maxsumsubarrays {
    public static void main(String args[]){
    int arr[]={2,4,6,8,10};
    int maxsum = Integer.MIN_VALUE;
    int currsum =Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++){
    int start =i;
    for(int j =i;j<arr.length;j++){
    int end =j;
     int sum=0;
      for(int k = start;k<=end;k++){
         sum +=arr[k];
         }
        currsum=sum;
         System.out.println(currsum);
        if(currsum>maxsum){
         maxsum=currsum;}}}
      System.out.println("max sum is "+ maxsum);
}
           
}

