#Floyd cycle
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
#find intersection of cycle
        int slow2 = 0;
        do{
            slow = nums[slow];
            slow2 = nums[slow2];
            if(slow == slow2)
                return slow;
        }while(slow != slow2);
        return -1;
    }
}
