/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Write your code here.
        ListNode slow = head;
        ListNode fast = head;


        //Detect cycle using Floyd's Tortoise and Hare algorithm
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            //If there's a cycle, the slow and fast pointers will meet 
            if(slow == fast){
                break;
            }
        }

        //If there's no cycle, return null
        if(fast == null || fast.next == null){
            return null;
        }

        //Move one pointer back to the head and continue until they meet at the cycle's start
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        //Return the node where the cycle begins
        return slow;
    }
}
