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
    public int numComponents(ListNode head, int[] nums) {
      Set<Integer> set=new HashSet<>();
      for(int i=0;i<nums.length;i++)
      {
          set.add(nums[i]);
      }
      ListNode temp=head;
      int count=0;
      while(temp!=null)
      {
         if(set.contains(temp.val) && (temp.next==null || !set.contains(temp.next.val)))
         {
            count++;
         }
         temp=temp.next;
      }
      return count;
    }
}