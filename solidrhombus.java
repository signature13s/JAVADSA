public class solidrhombus {
    public static void main(String[] args) {
        int c=0;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 10-c; j++) {
                if (j <= i) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");

                }
                 }
            System.out.println();
            c++;
        }
    }
}
