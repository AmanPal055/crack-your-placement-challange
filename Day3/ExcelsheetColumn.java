class Solution {
    public String convertToTitle(int c) {
        StringBuilder sb = new StringBuilder();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(c<27){
            return String.valueOf(alpha.charAt(c-1));
        }
        while(c>26){
            int temp = c%26;
            if(temp>0){
                sb.append(alpha.charAt(temp-1));
                c=c/26;
            }
            else{
                sb.append('Z');
                c/=26;
                c-=1;
            }
        }
        sb.append(alpha.charAt(c-1));
        return String.valueOf(sb.reverse());
    }
}
