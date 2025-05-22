// 1ST METHOD 
//   TIME COMPLEXITY=O(N^2)
//   SPACE COMPLEXITY=O(1)
  class Solution {
    public int maxSubArray(int[] nums) {
        
        int current=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                current=Math.max(sum,current);
            }
        }
        return current;
    }
}
// 2ND METHOD 
//   TIME COMPLEXITY=O(N)
//   SPACE COMPLEXITY=O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(currentsum+nums[i],nums[i]);
            maxsum=Math.max(maxsum,currentsum);
            if(currentsum<0){
                currentsum=0;
            }
        }
        return maxsum;
    }
}
