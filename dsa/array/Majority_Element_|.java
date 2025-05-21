// first understand it with hashmap
//   time complexity=O(N)
//   space complexity=O(N)
  class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for( int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
            if(map.get(num)>nums.length/2){
                return num;
            }
        }
        return -1;
    }
}
// secondly  understand it with MOORE ALGO
//   time complexity=O(N)
//   space complexity=O(1)
class Solution {
    public int majorityElement(int[] nums) {
      int count=1;
      int res=nums[0];
      for(int i=0;i<nums.length;i++){
        int num=res;
        if(res==nums[i]){
            count++;
        }
        else{
            count--;
        }
        if(count==0){
            res=nums[i];
            count=1;
        }
      }
      return res;
    }
}
