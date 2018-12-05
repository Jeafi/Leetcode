/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode as = new ListNode(0);
//         ListNode l1l = l1 ,l2l = l2 ,asl = as;
//         int flag = 0;
//         while(l1l != null || l2l !=null){
//             int x = (l1l != null) ? l1l.val : 0;
//             int y = (l2l != null) ? l2l.val : 0;
//             int sum = x + y + flag;
//             flag  = sum / 10;
//             asl.next = new ListNode(sum % 10);
//             asl = asl.next;
//             if(l1l.next != null){l1l = l1l.next;}
//             if(l2l.next != null){l2l = l2l.next;}
//         }
//         if(flag > 0){asl.next = new ListNode(flag);}
//         return as.next;
// }
// }

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
}}