//1st method with 
//time complexity 0(N^2)
//Space complexity 0(K)
//CODE
class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        ArrayList<Integer> list=new ArrayList<>();
      for(int i=0;i<n-k+1;i++){
            int flag=0;
            for(int j=i;j<k+i;j++){
                if(arr[j]<0){
                    flag=arr[j];
                    break;
                }
            }
            list.add(flag);
            
        }
        return list;
    }
}

//2st method with 
//time complexity 0(N)
//Space complexity 0(K)
//CODE

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int n=arr.length;
       
        int index=0;
        while(index<k){
            if(arr[index]<0){
                q.offer(arr[index]);
            }
            index++;
        }
        list.add(q.isEmpty()?0:q.peek());
        for(int  i=1;i<n-k+1;i++){
            if(arr[i-1]<0){
                q.poll();
            }
            if(arr[i+k-1]<0){
                q.offer(arr[i+k-1]);
            }
             list.add(q.isEmpty()?0:q.peek());
        }
       
        return list;
    }
}
