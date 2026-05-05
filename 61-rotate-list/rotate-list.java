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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        int si = 0;
        ListNode te = head;
        while(te != null){
            si++;
            te = te.next;
        }
        k%=si;
        if(k == 0) return head;

        // System.out.print(si +" " + (k%si));
        ListNode fin = new ListNode();
        ListNode ans = fin;

        te = head;
        int v = 1;
        while(v++ < si-k){
            te = te.next;
        }

        ListNode temp = te.next; // new head
        te.next = null;          // break list

        fin.next = temp;
        while (fin.next != null) {
            fin = fin.next;
        }

        fin.next = head;

        return ans.next;
    }
}