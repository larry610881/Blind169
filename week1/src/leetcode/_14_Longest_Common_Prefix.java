package leetcode;
/*
    https://leetcode.com/problems/longest-common-prefix/
 */
public class _14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==1) return  strs[0];
        int min =Integer.MAX_VALUE;
        for(String s :strs){
            min = Math.min(min,s.length());
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<min;i++){
            Character c = strs[0].charAt(i);
            boolean sam = true;
            for (String s :strs){
                if(c != s.charAt(i)){
                    sam =false;
                    break;
                }

            }
            if(sam){
                sb.append(c);
            }else{
                break;
            }
        }
        return sb.toString();
    }
}
