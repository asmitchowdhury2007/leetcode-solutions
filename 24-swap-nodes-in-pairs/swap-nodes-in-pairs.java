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
    public void reverse(ListNode left , int size){
        ListNode current = left;
        ListNode prev = null;
        while(size>0){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            size--;
        }
        return;
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode left = head;
        ListNode right ;
        int size = 2;
        ListNode prevLeft = null;
        ListNode nextLeft = null;
        ListNode res = null;
        while(true){
            right = left;
            for(int i=0;i<size-1;i++){
                if(right==null){
                    break;
                }
                else{
                    right = right.next;
                }
            }
            if(right!=null){
                nextLeft = right.next;
                reverse(left,size);
                if(res==null){
                    res=right;
                }
                if(prevLeft!=null){
                    prevLeft.next=right;
                }
                prevLeft = left;
                left=nextLeft;

                
            }
            else{
                if(prevLeft!=null){
                    prevLeft.next=left;
                
                }
                break;
            }
        }
        return res;
    }
}