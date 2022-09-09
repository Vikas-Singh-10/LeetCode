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
    public ListNode middleNode(ListNode head) {
        ListNode SlowPtr = head;
        ListNode FastPtr = head;
        while(FastPtr != null && FastPtr.next != null){
            SlowPtr = SlowPtr.next;
            FastPtr = FastPtr.next.next;
        }
        return SlowPtr;
    }
}