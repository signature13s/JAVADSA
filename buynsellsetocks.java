public class buynsellsetocks {
    public static int calculate(int prices[]) {
        int min = prices[0];
        int c = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                c = i;
            }
        }
        int max = 0;
        for (int i = c; i < prices.length; i++) {
            max = Math.max(prices[i], max);
        }
        if (max - min > 0) {
            return max - min;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int prices[] = { 7,6,5,4,3,2,1,0};
       if( calculate(prices) != 0) 
       { System.out.println(calculate(prices)+"it has this profit") ;}
       else{
        System.out.println(calculate(prices)+"it has zero profit") ;}
    }

}
