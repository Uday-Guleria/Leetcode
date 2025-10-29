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
       post=0;
       negt=0;

       int i=0;

       while(i<nums.length){
        arr[i]=pos[post];
        i++;
        post++;
        arr[i] = neg[negt];
        i++;
        negt++;
       }

       return arr;
    }
}