public class ContainerMaxWater {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length-1;
        while(i<j){
         int prod = Math.min(height[i], height[j]) * (j-i);
         if(prod>max){
             max = prod;
         }if(height[i]<height[j]){
             i++;
         }else if (height[i]>height[j]){
             j--;
         }else{
             i++;
             j--;
         }
        }
        return max;
     }
}
