/*206. Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
  
Example 2:
Input: head = [1,2]
Output: [2,1]
  
Example 3:
Input: head = []
Output: []
 
Constraints:
The number of nodes in the list is the range [0, 5000].-5000 <= Node.val <= 5000*/
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
        if(head==null){
            return null;
        }
        else if(head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode temp2=null;
        while(temp!=null){
            if(temp2==null){
               temp2=temp;
               temp=temp.next;
               temp2.next=null;
            }
            else{
                ListNode temp3=temp; 
                temp=temp.next;
                temp3.next=temp2;
                temp2=temp3;
            }     
        }
        return temp2;
        
    }
          
}
 
