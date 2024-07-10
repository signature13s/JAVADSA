public class reverseanarray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int end = arr.length-1;
        for (int i =0;i<end;i++)
        {
            int temp = arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;
        }
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }    }
}
