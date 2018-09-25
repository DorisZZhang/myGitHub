package com.leetcodeMiddle;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。 将两数相加返回一个新的链表。 示例： 输入：(2 -> 4 ->
 * 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
 * 
 * @author miniNereus
 *
 */

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listNode1 = new ListNode(2);
		listNode1.next = new ListNode(4);
		listNode1.next.next = new ListNode(3);
		ListNode listNode2 = new ListNode(5);
		listNode2.next = new ListNode(6);
		listNode2.next.next = new ListNode(4);

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode lNode = new ListNode(0);
		ListNode p = l1, q = l2,headNode = lNode;
		int carry = 0;
		if (l1 != null || l2 != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			carry = (x + y > 10) ? 1 : 0;
			int sum = carry + x + y;
			lNode.val = sum % 10;
			lNode = lNode.next;
			if(p.next!=null)
				p = p.next;
			if(q!=null)
				q = q.next;

		}
		return headNode;
	}

}
