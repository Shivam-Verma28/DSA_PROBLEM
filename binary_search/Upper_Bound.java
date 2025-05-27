//0(N)
class Solution {
    int upperBound(int[] arr, int target) {
      for(int i=0;i<arr.length;i++){
          if(arr[i]>target){
              return i;
          }
      }
      return arr.length;
    }
}

//0(nlogn)
class Solution {
    int upperBound(int[] arr, int target) {
      int low=0;
      int high=arr.length;
      while(low<high){
          int mid=low+(high-low)/2;
          if(arr[mid]<=target){
              low=mid+1;
          }
          else{
              high=mid;
          }
      }
      return low;
    }
}
