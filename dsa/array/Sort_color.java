//1st method with 
//time complexity=O(N)
//Space complexity=0(1)
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(high>=mid){
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else{
                mid++;
            }
        }
    }
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}


//2nd method with 
//time complexity=O(N^2)
//Space complexity=0(1)
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
            if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
            }
            System.out.println(nums);

        }
        
    }
}
