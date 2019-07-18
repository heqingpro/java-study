package study.algorithm.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author heqingqing
 * @Description: 无重复字符的最长子串$
 * @date 2019/6/29 1:03
 */
public class LongestWithoutRepeatCharacters3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Map<Character,Integer> map = new HashMap<Character, Integer>();
            int max = 0;
            for(int j=0,i=0;j<s.length();j++){
                if(map.containsKey(s.charAt(j))){
                    i=Math.max(map.get(s.charAt(j)),i);
                }
                max = Math.max(max,j-i+1);
                map.put(s.charAt(j),j+1);
            }
            return max;
        }
    }
}
