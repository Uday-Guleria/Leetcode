class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if (nums.length<2) return 0;

        int start=0;
        int end=1;
        int max = Integer.MIN_VALUE;

        while(end<nums.length){
            int gap = nums[end]-nums[start];
            if(gap>max){
                max=gap;
            }
            start++;
            end++;
        }

        return max;
        
    }
}