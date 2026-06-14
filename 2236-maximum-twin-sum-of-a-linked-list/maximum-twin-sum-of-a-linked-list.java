/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev= null;
        ListNode curr = slow;
        ListNode next = null;

        ListNode tem = curr;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        int mx = 0;

        while(prev != null){
            int sum = head.val+prev.val;
            mx = Math.max(sum,mx);
            head = head.next;
            prev = prev.next;
        }

        return mx;

        
    }
}