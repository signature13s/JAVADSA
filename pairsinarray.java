public class pairsinarray {
public static void main(String[] args) {
    int arr[]={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
    int c=0;
    for (int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++)
        {
            System.out.print("("+arr[i]+","+arr[j]+")");
            c++;
        }
        System.out.println();
    }
    System.out.println("total number of pairs : "+c);
}
}
