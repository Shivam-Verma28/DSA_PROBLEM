//complexity O(N)
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
    }
// WITH COMPLEXITY 0(NLOGN)
class Solution {
    public int searchInsert(int[] nums, int target) {
       int left=0;
       int right=nums.length;
       while(left<right){
        int mid=left+(right-left)/2;
       if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
       }
       return left;
    }
    }
