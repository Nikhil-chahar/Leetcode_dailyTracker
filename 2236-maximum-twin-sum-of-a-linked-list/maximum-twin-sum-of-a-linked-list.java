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
        List<Integer> ll = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            ll.add(temp.val);
            temp = temp.next;
        }
        int mx = 0;

        int le=0;
        int ri = ll.size()-1;

        while(le< ri){
            int sum = ll.get(le)+ll.get(ri);
            mx = Math.max(sum,mx);
            le++;
            ri--;
        }
        return mx;
    }
}