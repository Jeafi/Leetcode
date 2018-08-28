/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode L1 = l1; ListNode L2 = l2; ListNode l3 = new ListNode(0) ;
        
        ListNode L3 = l3;
        
        while(L1 != null && L2 != null)
        {
            if(L1.val >= L2.val){
                L3.next = L2 ;
                L2 = L2.next;
        }else{
                L3.next = L1 ;
                L1 = L1.next;
            }
            L3 = L3.next;
        }
        
		L3.next = L1 != null ? L1 : L2; 
		return L3.next;

        
    }
}