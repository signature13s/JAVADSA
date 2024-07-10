public class hollowrhombus {
    public static void main(String args[]) {
        int n = 50;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == n) {
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            }
            else{
                System.out.print("*");
                for(int j= 1;j<=3;j++){
                System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            }

        }
    }

