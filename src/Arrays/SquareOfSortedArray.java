package Arrays;

import java.util.Arrays;

public class SquareOfSortedArray {

	public static void Sortarray(int[] arr) {
		int first[] = new int[arr.length];
		
		for(int i =0;i< arr.length;i++) {
				first[i]=arr[i]*arr[i];		
				}
		
		Arrays.sort(first);
		System.out.print( Arrays.toString(first));
	}
	public static void main(String[] args) {
		int[] arr= {-1,-2,-3,4,5,6};
		SquareOfSortedArray.Sortarray(arr);
	}
}
