// 206. Reverse Linked List
// Easy

// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Example 1:
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
  
// Example 2:
// Input: head = [1,2]
// Output: [2,1]
  
// Example 3:
// Input: head = []
// Output: []

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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
          return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=head.next;
        while(pres!=null && next!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            next=next.next;
        }
        pres.next=prev;
        prev=pres;
        return prev;
    }
}
