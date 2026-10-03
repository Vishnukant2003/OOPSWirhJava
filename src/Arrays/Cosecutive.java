package Arrays;

public class Cosecutive {
	public static void main(String[] args) {
		int count=0;
		int seen=0;
		int[] arr={0,1,0,1,1,1,0,0};
		
		for(int i =0; i<arr.length; i++) {
		
		if(arr[i]==1) {
		 count+=1;
		}else {
			seen=Math.max(seen,count);
			count =0;
		}
		}

		System.out.println(Math.max
				(seen,count));
	}//time complexity is Big O(log n)
	//space complexity is Big O(1)

}
