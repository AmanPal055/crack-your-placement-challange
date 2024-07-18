class Solution {
    public int findPair(int n, int x, int[] arr) {
        Arrays.sort(arr);
        int l=0,r=1;
        while(l<n && r<n){
            if(l != r &&  arr[r]-arr[l]==x)
                return 1;
            else if(arr[r]-arr[l]<x)
                r++;
            else
                l++;
        }
        return -1;
    }
}
