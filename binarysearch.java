public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=25;
         int start=0;
         int end=arr.length-1;
         int found =-1;
         while (start <= end) {
         int mid= (start+end)/2;

            if(arr[mid]==key){
              found = mid;
              break;
            }
            if(arr[mid]>key){
                end=mid-1;    
            }
            if(arr[mid]<key){
                start=mid+1;
            }
         }
         if (found==-1){
            System.out.println("not found");
         }
         else{
            System.err.println("found at index "+found);
         }
    }
}
