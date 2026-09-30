package Stack;

public class AssQ2 {

	    static int top = -1;
	    static char[] stack = new char[50];

	    
	    static void push(char ch) {
	    	if(top==stack.length-1) {
	    		System.out.println("stack overflow");
	    	}else {
	    		stack[top]=ch;
	    		top++;
	    	}
	    	
	    }
	    static char pop() {
	    	if(top == -1) {
	    		System.out.println("stack underflow");
	    		return '\0';
	    	}else {
	    		stack[top--];
	    	}
	    	return 0;
	    }

	    public static void main(String[] args) {

//	        String str = "HELLO";
	    	String str="DATASTRUCTURE";
	        String reverse = "";

	        // Push each character
	        for (int i = 0; i < str.length(); i++) {
	            push(str.charAt(i));
	        }

	        // Pop each character
	        while (top != -1) {
	            reverse +=pop();
	        }

	        System.out.println("Original String: " + str);
	        System.out.println("Reversed String: " + reverse);
	    }
	}