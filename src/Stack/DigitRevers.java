package Stack;

public class DigitRevers {
//	private static final int value = 0;
	static int top = -1;
	static int[] stack= new int[5];
	private static int value;
	//stack initialization
	static void push(int value) {
		if(top== stack.length-1) {
			System.out.println("stack overflow");
			
		}else {
			top++;
			stack[top] = value;
		
		}
		
	}
	static int pop() {
		if(top== -1) {
			System.out.println("stack underflow");
			return -1;
		}else {
			stack[top] = value;
			top--;
		}
		return top;
	}
	public static void main(String[] args) {
		int number = 12345;
		int revers= 0;
		int num =0;
		for(int i =0 ; i<stack.length;i++) {
			num =number%10;
//			revers = revers*10+num;
			num=number/10;
			revers=num;
			push(revers);
		}
		
		
		System.out.println(number);
		while(top!=-1) {
			revers+=pop();
		}
		System.out.println(revers);
	}
	
}
