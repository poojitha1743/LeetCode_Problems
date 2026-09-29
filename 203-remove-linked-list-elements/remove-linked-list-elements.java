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
    public ListNode removeElements(ListNode head, int val) {
        //If linked list is empty
       
      if(head == null)
      {
        return null;
      }  
      //Stop at the node before target to make the removal
       ListNode temp = head;
      while(temp.next!=null)
      {
        if(temp.next.val==val)
        {
            temp.next = temp.next.next;
        }
        else
        {
            temp = temp.next;
        }
      }
      if(head!=null && head.val ==val)
      {
        head = head.next;
      }
      return head;
    }
}