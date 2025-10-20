class Solution {
    public int maxArea(int[] height) {
    int max=0;
    
    int start = 0;
    int end=height.length-1;

    while(start<end){
        int cont = Math.min(height[start],height[end]);
        int area = cont*(end-start);
        if(area>max){
            max=area;
        }
        int move = Math.max(height[start],height[end]);
        if(move==height[start]){
            end--;
        }else{
            start++;
        }
    }
       return max;
    }
}