public class selectionsort {
    public static void selectionsorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minspos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minspos] > arr[j]) {// if you want decreasingly sorted array just reverse this arrow operator
                    minspos = j;
                }

            }
            int temp = arr[minspos];
            arr[minspos] = arr[i];
            arr[i] = temp;
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
        int arr[] = { 5, 1, 4, 2, 6 };
        selectionsorting(arr);
        printing(arr);
    }
}