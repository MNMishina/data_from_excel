/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
package leetCode.explore;

import java.util.ArrayList;

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
public class MiddleOfLinkedList {
  private MiddleOfLinkedList next;

  public MiddleOfLinkedList middleNode(MiddleOfLinkedList head) {
    ArrayList<MiddleOfLinkedList> array = new ArrayList<>();
    int length = 0;
    while (head != null) {
      array.add(head);
      head = head.next;
      length++;
    }
    return array.get(length / 2);
  }
}


