//time complexity=O(N)
//SPACE COMPLEXITY=O(N)


class Solution {
    int maxLen(int arr[]) {
      int n=arr.length;
      HashMap<Integer,Integer> map=new HashMap<>();//to store key and value
      int max=0;
      int sum=0;
      for(int i=0;i<n;i++){
           sum+=arr[i];
           if(sum==0){//if prefix sum is zero so length is i+1;which is to be return
               max=i+1; //because 0 to i sum zero h to uski length to i+1 hogi
           }
          if(map.containsKey(sum)){//if map contain the same element so 
              max=Math.max(max,i-map.get(sum)); //max=ab wha idx(i)-phele wala idx
          }
          
          else{
              map.put(sum,i);//if element is not present then store it
          }
      }
      return max;
    }
}
