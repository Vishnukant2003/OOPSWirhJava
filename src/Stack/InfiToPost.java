import java.util.Stack;

class InfiToPost{
	public static int precedence (char c) {
		switch(c) {
		case'+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		return -1;
		}
	}
	
	
	public static String convert(String exp) {
		Stack<Character> stack = new Stack<>();
		StringBuffer result = new StringBuffer();
		
		for(int i=0; i<exp.length(); i++) {
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				result.append(c);
			}else if(c=='(') {
				stack.push(c);
			}else if(c==')') {
				while(!stack.isEmpty()&&stack.peek()=='(') {
					stack.pop();
					result.append(stack.pop());	
				}
			}
		}
		return exp.toString();  
	}
		
	public static void main(String[] args) {
		String infix = "a+b()*c";
		String postfix;
		System.out.println(convert(infix));
	}
}