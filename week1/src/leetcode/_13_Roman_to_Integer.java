package leetcode;

import java.util.HashMap;

/*
    https://leetcode.com/problems/roman-to-integer/
 */
public class _13_Roman_to_Integer {
    public int romanToInt(String s) {
        // 建立羅馬數字字符和數值的對應關係
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentVal = map.get(s.charAt(i));
            // 如果當前字符比下一個字符所代表的數字小，則減去當前值
            if (i < n - 1 && currentVal < map.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }
}
