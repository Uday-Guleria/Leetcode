class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }

        if(pivot==-1){
            for(int i=0,j=nums.length-1;i<j;i++,j--){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]= temp;
            }
            return;
        }


        for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        for(int i=pivot+1,j=nums.length-1;i<j;i++,j--){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        
    }
}