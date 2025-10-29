class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] pos = new int[nums.length/2];
       int[] neg = new int[nums.length/2];

       int[] arr = new int[nums.length];
       int post = 0;
       int negt=0;

       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            pos[post]=nums[i];
            post++;
        }
        else{
            neg[negt]=nums[i];
            negt++;
        }
       }
       

       int in=0;

       for(int i=0;i<pos.length;i++){
        arr[in]=pos[i];
        in++;
        arr[in]=neg[i];
        in++;
       }

       return arr;
    }
}