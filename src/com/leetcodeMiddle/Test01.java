package com.leetcodeMiddle;

/**
 * ���������ǿ���������ʾ�����Ǹ�������λ����������ʽ�洢�����ǵ�ÿ���ڵ�ֻ�洢�������֡� ��������ӷ���һ���µ����� ʾ���� ���룺(2 -> 4 ->
 * 3) + (5 -> 6 -> 4) �����7 -> 0 -> 8 ԭ��342 + 465 = 807
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
		Test01 test = new Test01();
		ListNode newNode = test.addTwoNumbers(listNode1, listNode2);
		while(newNode != null){
			System.out.println(newNode.val);
			newNode = newNode.next;
		}

	}

	public ListNode add(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode p = l1, q = l2, fNode = head;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			// fNode = new ListNode();
			fNode.next = new ListNode(sum % 10);
			fNode = fNode.next;
			if (p.next != null)
				p = p.next;
			if (q != null)
				q = q.next;
			if (carry > 0) {
		        fNode.next = new ListNode(carry);
		    }

		}
		return head;
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}

}
