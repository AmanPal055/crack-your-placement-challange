class Solution {
    public String addBinary(String a, String b) {
        int n = a.length()-1;
        int m = b.length()-1;
        int c=0,base=2,sum;

        StringBuilder res = new StringBuilder();
        while(n>=0 || m>=0 ){
            int r1=0,r2=0;
            if(n>=0){
                r1=a.charAt(n--) - '0';
            }
            if(m>=0){
                r2=b.charAt(m--) - '0';
            }
            sum = r1+r2+c;
            if(sum>=base){
                c=1;
                sum=sum-base;
            }
            else
                c=0;
            res.append(sum);
        }
        if(c==1){
            res.append(c);
        }
        return res.reverse().toString();
    }
}
