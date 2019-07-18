package study.algorithm.leecode;

/**
 * @author heqingqing
 * @Description: 链表计算两数相加$
 * @date 2019/6/29 0:34
 */
public class AddTwoNumbers2 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            int extent = 0;
            ListNode next = head;
            while (null != l1 || null !=l2 || extent!=0){
                int val1 = null==l1?0:l1.val, val2 = null == l2?0:l2.val;
                int sum = extent + val1 +val2;
                next.next = new ListNode(sum % 10);
                next = next.next;
                extent = sum / 10;
                l1 = null == l1?null:l1.next;
                l2 = null == l2?null:l2.next;
            }
            return head.next;
        }
        public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            int extent = 0;
            ListNode next = head;
            while (null != l1 || null !=l2){
                int val1 = null==l1?0:l1.val, val2 = null == l2?0:l2.val;
                int sum = extent + val1 +val2;
                next.next = new ListNode(sum % 10);
                next = next.next;
                extent = sum / 10;
                l1 = null == l1?null:l1.next;
                l2 = null == l2?null:l2.next;
            }
            if(extent>0){
                next.next = new ListNode(extent);
            }
            return head.next;
        }
    }
}
