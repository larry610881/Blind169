package leetcode;

/*
    https://leetcode.com/problems/first-bad-version/
 */
public class _278_First_Bad_Version {
    //在連續的false後找第一個ture 一樣用二分搜尋法
//    public int firstBadVersion(int n) {
//        int bad =0;
//        int first =1;
//        int last =n;
//        while (first<=last){
//            int mid =first+(last-first)/2;
//            if(isBadVersion(mid)){
//                bad =mid;
//                last =mid-1;
//            }else {
//                first =mid+1;
//            }
//        }
//        return bad;
//    }
}
