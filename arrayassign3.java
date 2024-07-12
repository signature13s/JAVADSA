public class arrayassign3 {
    public static void calculate(int arr[]) {
        
        
        
      for (int i =0;i<arr.length;i++){
        for(int j =0;j<arr.length;j++){
            for(int k =0;k>arr.length;k++){
                if(i!=j&&i!=k&&j!=k&&i+j+k==0){
                   System.out.println(i+j+k);
                }
            }
        }
      }

    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        calculate(arr);
    }
}
