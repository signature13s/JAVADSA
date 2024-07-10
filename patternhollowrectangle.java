public class patternhollowrectangle {
    public static void main(String args[]) {
        int totrow= 4;
        int totcol= 5;
        for (int i = 1; i <= totrow; i++) {
            for (int j = 1; j <= totcol ; j++) {
                if (i == 1 || i == totrow) {
                    System.out.print("*");
                    continue;
                } else {
                    if (j == 1 || j == totcol) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
          }  System.out.println();
        }
    }
}