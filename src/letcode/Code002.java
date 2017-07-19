package letcode;

import java.util.List;

/**
 * Created by ZK on 2017/7/18.
 * You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class Code002 {

    public ListNode addTwoNumbers(ListNode l1,ListNode l2) {

        ListNode l3 = new ListNode(0);
        ListNode result = l3;
        int i = 0;
        while (l1 != null || l2 != null || i !=0) {
            ListNode l4 = new ListNode(0);
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            int sum = l1.val + l2.val + i;
            l4.val = sum % 10;
            i = sum / 10;
            l3.next = l4;
            l3 = l4;
            l1 = l1.next;
            l2 = l2.next;
        }
        return result.next;
    }
}
