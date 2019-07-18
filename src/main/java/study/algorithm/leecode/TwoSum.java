package study.algorithm.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author heqingqing
 * @Description: 两数之和$
 * @date 2019/6/29 0:15
 */
public class TwoSum{
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            Map<Integer,Integer> map = new HashMap();
            for(int j=0;j<nums.length;j++){
                int num = target-nums[j];
                if(map.containsKey(num) && j!=map.get(num)){
                    return new int[]{map.get(num),j};
                }
                map.put(nums[j],j);
            }
            throw new IllegalArgumentException("no two sum Exception");
        }
    }

    public static void main(String[] args) {
        Integer aa =2883;
        Integer bb = 9234;
        aa.equals(bb);

        String s = "aa";
        String b = "bb";
        s.equals(b);
    }

}
