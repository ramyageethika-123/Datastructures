package MyStack;
import java.util.*;
public class mystack {
	public static void main(String[] args) {
		Stack<String> trail_stack = new Stack <String>();
		boolean result = trail_stack.empty();
		System.out.println("Is the stack empty? " + result);  
		trail_stack.push("I");
		trail_stack.push("you");
		trail_stack.push("how");
		trail_stack.push("go");
		trail_stack.push("went");
		System.out.println(trail_stack);
		trail_stack.pop();
		trail_stack.pop();
		System.out.println("After pop operation" +trail_stack);
		System.out.println(trail_stack.peek());
		System.out.println(trail_stack.search("how"));
	}
}
