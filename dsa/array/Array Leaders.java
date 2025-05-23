//time complexity must be O(n)
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list=new ArrayList<>();
    int n=arr.length;
    int max=Integer.MIN_VALUE;
    for(int i=n-1;i>=0;i--){
        
        if(arr[i]>=max){
            list.add(arr[i]);
            max=arr[i];
        }
    }
    
    Collections.reverse(list);
    return list;
    }
}
