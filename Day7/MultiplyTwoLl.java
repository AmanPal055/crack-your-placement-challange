class Solution {
    private static final int MOD = 1000000007;
    public long multiplyTwoLists(Node l1, Node l2) {
        long num1 = 0;
        long num2 = 0;
          
        while(l1 != null || l2 != null){
            if(l1!=null){
                num1=((num1*10)+l1.data)%MOD;
                l1 = l1.next;
            }if(l2!=null){
                num2=((num2*10)+l2.data)%MOD;
                l2=l2.next;
            }
        }
        return (num1*num2)%MOD;
    }
}
