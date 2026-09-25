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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode before = null;
        int pos = 1;
        ListNode t = head;
        while(pos<left){
            before = t ;
            t = t.next;
            pos++;
            continue;
        }
        if(pos==left){
            ListNode current = t;
            ListNode prev = null;
            int times = right-left+1;
            if(times==1){
                return head;
            }
            while(times>0){
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                times--;
            }
            if(before!=null){
                before.next = prev;
                t.next = current;
            }
            else{
                t.next = current;
                return prev;
            }


            
        }
        return head;
        

    }
}