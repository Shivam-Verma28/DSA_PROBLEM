//approach using SLIDING WINDOW TECHNIQUE
//time complexity 0(N)
//space complexity 0(N)

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        int max=0;
        int sum=0;
      int n=arr.length;
      for(int i=0;i<k;i++){
           sum=sum+arr[i];
      }
      max=sum;
      for(int i=1;i<n-k+1;i++){
          int prev=arr[i-1];
          int forward=arr[i+k-1];
          sum=sum-prev+forward;
          max=Math.max(max,sum);
      }
      return max;
    }
}
//2nd method
//time complexity 0(N^2)
//space complexity 0(N)


// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
       int max=0;
       int sum=0;
       int n=arr.length;
       for(int i=0;i<n-k+1;i++){  
        sum=0;
       for(int j=i;j<i+k;j++){
           sum=sum+arr[j];
       }
        max=Math.max(sum,max);
       }
       return max;
    }
}
