package leetcode;
/*
    https://leetcode.com/problems/add-binary/description/
 */
public  class _67_Add_Binary {
    public static String addBinary(String a, String b) {
        if(a.length()< b.length()){
            String tmp = a;
            b=a;
            a=b;
        }
        int al = a.length()-1;
        int bl = b.length()-1;
        int carry =0;
        StringBuffer sb = new StringBuffer();
        for(;bl>=0;bl--,al--){
            int inta =a.charAt(al);
            int intb =b.charAt(bl);
            if(inta ==1 && intb==1){
                sb.insert(0,carry);
            }else if(inta ==0 && intb==0){
                sb.insert(0,carry);
                carry=0;
            }else{
                if(carry ==1){
                    sb.insert(0,0);
                }else{
                    sb.insert(0,1);
                    carry=0;
                }
            }
        }
        for(;al>=0;al--){
            int tmp =a.charAt(al)+carry;

            sb.insert(0,tmp%2);
            System.out.println(carry);
            carry = tmp/2;
        }

        if (carry==1){
            sb.insert(0,1);
        }
        return sb.toString();
    }

}
