package leetcode;
/*
    https://leetcode.com/problems/add-binary/description/
 */
public  class _67_Add_Binary {
    public String addBinary(String a, String b) {
        if(a.length()< b.length()){
            String tmp = a;
            a=b;
            b=tmp;
        }
        int al = a.length()-1;
        int bl = b.length()-1;
        int carry =0;
        StringBuffer sb = new StringBuffer();
        for(;bl>=0;bl--,al--){
            int tmp =b.charAt(bl)-'0'+a.charAt(al)-'0'+carry;
            sb.insert(0,tmp%2);
            carry = tmp/2;
        }
        for(;al>=0;al--){
            int tmp =a.charAt(al)-'0'+carry;
            sb.insert(0,tmp%2);
            carry = tmp/2;
        }
        if (carry==1){
            sb.insert(0,carry);
        }
        return sb.toString();
    }
}
