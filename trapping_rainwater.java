public class trapping_rainwater{
    public static int calculatetrappedwater(int height[]){
        int len = height.length;
        //calculate leftmax with the help of auxillary arrays
        int leftmax[]= new int[len];
        leftmax[0]=height[0];
        for(int i=1;i<len;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }
        //calculate rightmax similarily 
        int rightmax[]= new int[len];
        rightmax[len-1]=height[len-1];
        for(int i=len-2;i>=0;i--){
         rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater=0;
          for(int i=0;i<len;i++){
              //calculate water level by minimum of rightmax and left max
            int waterlevel = Math.min(rightmax[i], leftmax[i]);
            // now calulate trapped water
            trappedwater += (waterlevel-height[i]);
          }

        return trappedwater;
    }
    public static void main(String args[]){
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(calculatetrappedwater(height));
    }
}