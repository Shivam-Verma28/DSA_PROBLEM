//1st method with 
//TIME COMPLEXITY 0(N^2)
//SPace COMPLEXITY 0(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}
//2st method with 
//TIME COMPLEXITY 0(N)
//SPace COMPLEXITY 0(N)
//use of HASHMAP 
class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        int n=nums.length;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        int diff=target-nums[i];
        if(map.containsKey(diff)){
            return new int[]{map.get(diff),i};

        }
        map.put(nums[i],i);
       }
return new int[0];
    }
}
