class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ind_1 = 0;
        int ind_2 = numbers.length-1;

        while(ind_1<=ind_2){
            if(numbers[ind_1]+numbers[ind_2] == target){
                return new int[]{ind_1+1 , ind_2+1};
            }
            else if(numbers[ind_1]+numbers[ind_2]>target){
                ind_2--;
            }
            else{
                ind_1++;
            }
        }
        return new int[]{-1,-1};
    }
}