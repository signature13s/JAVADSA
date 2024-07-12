public class newpattern{
    public static void main(String args[]){
        int n =10;
        for(int i =1;i<=n;i++){
            int c1=i;
            int c2=1;
            for(int j =1;j<=n;j++){
              if(c1<=n){
                System.out.print(c1+" ");
                c1++;
              }
              else{
                System.out.print(c2+" ");
                c2++;
              }
            }
            System.out.println();
        }
    }
}