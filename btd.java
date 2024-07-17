import java.util.*;
public class btd {
  public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    int dec=0;
    int c=0;
    int bin=Sc.nextInt();
    for(int i=bin;i!=0;i/=10){
     int ld = i%10;
     dec= dec + (ld* (int)(Math.pow(2,c)));
     c++;
    }
    System.out.println(dec);
    Sc.close();
  }  
}
