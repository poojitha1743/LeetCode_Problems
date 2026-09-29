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
       /* int length = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            length++;
        }
        int middle = length/2;
        temp =head;
        while(middle>0){
            temp = temp.next;
            middle--;
        }
        return temp;
        */
        

        // implementation using Hare and Tortoise Algorithm (Fast & slow)
        ListNode slow,fast;
        slow = head;
        fast = head;
        while(fast!=null && fast.next!=null)
        {
            //Move the slow pointer 1 step at a time
            slow = slow.next;
            //Move the fast pointer 2 steps at a time
            fast = fast.next.next;
        }
        return slow;
        
    }
}