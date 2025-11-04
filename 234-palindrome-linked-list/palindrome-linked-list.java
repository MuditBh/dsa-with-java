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
    public boolean isPalindrome(ListNode head) 
    {
        // if LL contains 0 or 1 node
        if(head==null || head.next==null)
        {
            return true;
        }
        //Step 1 find mid(slow fast approach)
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;

        //step 2 (reverse right side of LL)
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;
        ListNode left = head;

        //step 3 (compare left and right half)
        while(right!=null)
        {
            if(left.val!=right.val)
            {
                return false;
            }
            right = right.next;
            left = left.next;
        } 
        return true;
    }
}