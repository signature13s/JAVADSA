public class bubblesort {
    // more optimized approach if array is already sorted
    public static void bubblesorting(int arr[]) {
        int c=0;
        int swap = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            // checking if array is already sorted
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.println(c++);
                if (arr[j] > arr[j + 1]) {
                     swap=swap+1;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
                
            }
            if (swap == 0) {
                System.out.println("array is already sorted");
                break;
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

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        bubblesorting(arr);
        printing(arr);
    }
}