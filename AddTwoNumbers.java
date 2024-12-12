class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode(0);
      ListNode curr = dummy;
      int carry = 0;

      
      while (l1 != null || l2 != null || carry > 0) {
          if (l1 != null) {
              carry += l1.val;
              l1 = l1.next;
          }
          if (l2 != null) {
              carry += l2.val;
              l2 = l2.next;
          }
          curr.next = new ListNode(carry % 10);
          carry /= 10;
          curr = curr.next;
      }

      return dummy.next;
  }
}

public class AddTwoNumbers {
  public static void main(String[] args) {
      ListNode l1 = new ListNode(2);
      l1.next = new ListNode(4);
      l1.next.next = new ListNode(3);

      ListNode l2 = new ListNode(5);
      l2.next = new ListNode(6);
      l2.next.next = new ListNode(4);

      Solution solution = new Solution();
      ListNode result = solution.addTwoNumbers(l1, l2);

      while (result != null) {
          System.out.print(result.val);
          if (result.next != null) {
              System.out.print(" -> ");
          }
          result = result.next;
      }
  }
}
