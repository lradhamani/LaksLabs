package com.lint.code;

/*
 * Rotate an array to the right by k steps in-place without allocating extra space.
 * For instance, with k = 3, the array [0, 1, 2, 3, 4, 5, 6] is rotated to [4, 5, 6, 0, 1, 2, 3].
 * 
 */
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6};
		rotate(arr,3);
		printArray(arr);
	}

	public static void rotate(int[] s, int k) {
		int n = s.length;
		reverse(s,0,n);
		reverse(s,0,k);
		reverse(s,k,n);
	}

	private static int[] reverse(int[] arr, int begin, int end) {
		// TODO Auto-generated method stub
		for (int i = 0; i < (end - begin) / 2; i++) {
			int temp = arr[begin + i];
			arr[begin + i] = arr[end - i - 1];
			arr[end - i - 1] = temp;
		} 
		return arr;
	}
	
	private static void printArray(int[] arr) {
		System.out.print("{");
		for (int i= 0; i < arr.length; i++)
			System.out.print(arr[i] +",");
		System.out.print("}");
		System.out.println();
	}

}
