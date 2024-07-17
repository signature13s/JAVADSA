public class countingsort {
    public static void counting(int arr[]) {
        int length = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            length = Math.max(arr[i], length);
        }
        int count[] = new int[length + 1];
        // frequency counting
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0; i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++; 
                count[i]--;
            }
        }

    }
    public static void printing(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(" ] ");

    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 6, 8, 1, 5, 7, 9, 5, };
        counting(arr);
        printing(arr);
    }
}