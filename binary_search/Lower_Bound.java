class Solution {
    int lowerBound(int[] arr, int target) {
     
    int low = 0, high = arr.length;

    while (low < high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }

    return low;
}

    }


//2nd solution O(N)
class Solution {
    int lowerBound(int[] arr, int target) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>=target){
                return i;
            }
        }
        return n;
    }
}
