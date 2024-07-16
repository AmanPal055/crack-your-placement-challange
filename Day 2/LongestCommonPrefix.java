class Solution {
    public String longestCommonPrefix(String[] p) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(p);
        String first = p[0];
        String last = p[p.length-1];
        for(int i=0; i<Math.min(first.length(),last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return res.toString();
            }
            res.append(first.charAt(i));
        }
        return res.toString();
    }
}
