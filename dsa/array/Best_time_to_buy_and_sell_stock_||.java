//time complexity=0(n)

class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length-1;
        int profit=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[i+1]){
                profit+=nums[i+1]-nums[i];
            }
        }
        return profit;
    }
}
