// 234. Palindrome Linked List
// Easy

// Given the head of a singly linked list, return true if it is a 
// palindrome
//  or false otherwise.

// Example 1:
// Input: head = [1,2,2,1]
// Output: true

// Example 2:
// Input: head = [1,2]
// Output: false

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
// -------------First Approach------------------
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int count=0;
        // Find the mid point
        while(temp!=null){
           temp=temp.next;
           count++;
        }
        temp=head;
        Stack<Integer> stack =new Stack<>();
        // push half of the list value to stack
        for(int i=0;i<count/2;i++){
              stack.push(temp.val);
              temp=temp.next;    
        }
        // if there are even number of  nodes
        if(count%2==0){
             for(int i=0;i<count/2;i++){
               if(temp.val==stack.peek()){ 
                   stack.pop();
                   temp=temp.next;
               }
               else return false;
             }
        }
        // if there are odd number of nodes
        else{
            temp=temp.next;
             for(int i=0;i<count/2;i++){
               if(temp.val==stack.peek()){ 
                   stack.pop();
                   temp=temp.next;
               }
               else return false;
             }
        }
        // check if stack empty or not
        if(stack.empty()){       
          return true;
        }
   return false;
    }
}

