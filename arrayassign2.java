public class arrayassign2 {
    public static int[] calculate(int arr[], int k){
          int auxarr[]= new int[arr.length];
          int c=0;
          for(int i =0; i<arr.length;i++){
            if(k<arr.length){
                auxarr[i]=arr[k];
                k++;
            }
            else{
                auxarr[i]= arr[c];
                c++;
            }
            System.out.print(auxarr[i]+" ");
          }
          System.out.println();
          return auxarr;
    }

    public static int binsearch(int arr[] , int target) {
       for(int i=0;i<arr.length;i++){
        if(target==arr[i]){
            return i;
        }
       }
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,4,5,6,7};
        int k=3;
        int target=3;
       
        System.out.println(binsearch(calculate(arr, k), target));
    }
}
