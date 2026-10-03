package Arrays;

public class DigitCount2 {
	public static void findNum(int[] arr) {
		int evencount=0;
		for(int a : arr) {
		int len=String.valueOf(a).length();//convert int into the string 
		if(len%2==0) { //check the count of digit is even 
			evencount++;
		}
	}
		System.out.println(evencount); 
	}
	public static void main(String[] args) {
		
		int[] arr= {1010,1020,203,3201,2342,2587,1234};
		DigitCount2.findNum(arr);
	}

}
