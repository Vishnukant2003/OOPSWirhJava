package Arrays;

public class DigitIsEven {
	
	public static boolean isEven(int number) {
		int digitcount=0;
		 while(number!=0) {
			number=number/10;
			digitcount++;//count the digits , for each iteration digitcount is + count the digit  
		}
		return digitcount%2==0;//return true if the digit count is even  then true and increse the count++ 
	}
	public static void main(String[] args) {
		int count=0;
		int[] num= {1233,4564,4546,4356,4783,4785,3};
		for(int i=0; i<num.length;i++) {
			if(isEven(num[i])) {
				count++;//if the arr[i] digit is even (means its four) then count++ 
					}
		System.out.println(count);
	}

}
}
