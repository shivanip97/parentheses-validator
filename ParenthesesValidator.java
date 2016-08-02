import java.util.Scanner;
import java.util.Stack;

public class ParenthesesValidator {

	static Scanner scan = new Scanner(System.in);
    public static boolean checkParenthesesOrder(String string){
    	Stack<Character> stack = new Stack<Character>();
    	char character;
		for(int i = 0; i < string.length(); i++){
			character = string.charAt(i);
			if(character == '(' || character == '{' || character == '['){
			stack.push(character);
			}
			else if(character == ')'){
				if(stack.peek() == '(')
					stack.pop();
				else if(stack.empty())
					return false;
				else
			    	return false;
		}
			else if(character == '}'){
				if(stack.peek() == '{')
					stack.pop();
				else if(stack.empty())
					return false;
				else
				    return false;
		}
			else if(character == ']'){
				if(stack.peek() == '[')
					stack.pop();
			    else if(stack.empty())
					return false;
			    else
					return false;
			}
		}
		return stack.empty();
}

    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string: ");
	String input = scan.nextLine();
	System.out.println(checkParenthesesOrder(input));
}
}
