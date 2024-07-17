public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int curr=arr[i];
            int prevCurr=i-1;
            while(prevCurr>=0&& arr[prevCurr]> curr){
                //finding correct position
                arr[prevCurr+1]=arr[prevCurr];
                prevCurr--;
            }
            //insertion
            arr[prevCurr+1]=curr;
        }
    }

    public static void printing(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(" ] ");

    }
    public static void main(String[] args) {
        int arr[]={5,1,4,2,6};
        insertion(arr);
        printing(arr);
    }
}
