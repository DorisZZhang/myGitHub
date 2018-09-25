package com.leetcodeEasy;

public class Test01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01 test01 = new Test01();
		int[] nums = { 2, 5, 6, 3, 7, 9 };
		int[] num = test01.twoSum(nums, 9);
		System.out.println("[" + num[0] + "," + num[1] + "]");

	}

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("not found!");
	}

}
