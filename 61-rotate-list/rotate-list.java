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
        if(head==null|| head.next==null||k==0){
            return head;

        }
        ListNode start = head;
        int length = 1;
        while(start.next!=null){
            start = start.next;
            length++;
        }
        k=k%length;
        ListNode tail = start;
        start=head;
        tail.next=head;
        int number_of_nodes = length-k;
        while(number_of_nodes>1){
            start=start.next;
            number_of_nodes--;
        }
        ListNode after_node = start.next;
        start.next=null;
        head=after_node;
        return head;
    }
}