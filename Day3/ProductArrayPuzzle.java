class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] p = new long[nums.length];
        for(int i=0; i<nums.length; i++){
            p[i] = 1;
        }
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i==j){
                    continue;
                }
                p[i] = p[i]*nums[j];
            }
        }
        return p;
	} 
} 
