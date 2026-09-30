package Stack;


public class StackImpArray {
	
		static int top = -1;
		static int size=5;
		
		static int[] stack = new int[size];
		private static int value;
		static void push(int value){
			if(top==size-1) {
				System.out.println("stack overflow");
			}else {
				top++;
				stack[top]=value;
			}
		}
		
		static void pop() {
			if(top==-1) {
				System.out.println("stack underflow");
			}else {
				top--;
				stack[top]=value;
			}
		}
		static void peek() {
			if(top==-1) {
				System.out.println("stack underflow");
			}else {
				System.out.println("peek element from stack : "+stack[top]);
			}
		}
		static void display(){
			if(top==-1) {
				System.out.println("is empty");
			}else {
				System.out.println("stack element:");
				for(int i =top;i>=0;i--) {
					System.out.println(stack[i]);
				}
			}
		}
		public static void main(String[] args){
			
			StackImpArray.push(10);

			StackImpArray.push(20);

			StackImpArray.push(30);

			StackImpArray.push(40);
			
			StackImpArray.display();
			StackImpArray.peek();
			pop();
			StackImpArray.peek();
			pop();
			
			display();
			
	}
	
}
