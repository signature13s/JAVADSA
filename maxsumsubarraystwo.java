// prefix array appraoch
public class maxsumsubarraystwo {

    public static void main(String args[]){
    int arr[]={2,4,6,8,10};
    int maxsum = Integer.MIN_VALUE;
    int currsum =Integer.MIN_VALUE;
    //creating prefix array
    int prefix[]= new int[arr.length];
    prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        prefix[i]=arr[i]+prefix[i-1];
    }
    for(int i =0;i<arr.length;i++){
    int start =i;
    for(int j =i;j<arr.length;j++){
    int end =j;
     
        currsum     = (start == 0) ?prefix[end]:prefix[end]-prefix[start-1];
        
        if(currsum>maxsum){
         maxsum=currsum;}}}
      System.out.println("max sum is "+ maxsum);
} }
