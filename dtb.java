import java.util.*;

public class dtb {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int dec = Sc.nextInt();
        int bin = 0;
        // char ch;
        // String bin = "";
        // String nbin = "";
        // while (dec != 0) {

        // if (dec % 2 == 1) {
        // bin += "1";
        // } else {
        // bin += "0";

        // }
        // dec = dec / 2;
        // }
        // for (int i = 0; i < bin.length(); i++) {
        // ch = bin.charAt(i); // extracts each character
        // nbin = ch + nbin; // adds each character in front of the existing string
        // }

        // System.out.println(nbin);
        int pow = 0;
        while (dec != 0) {
            int rem = dec % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            dec /= 2;
        }
        System.out.println(bin);
    }
}
