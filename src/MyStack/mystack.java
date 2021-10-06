package MyStack;
import java.util.*;
public class mystack {
	public static void main(String[] args) {
		Stack<String> trail_stack = new Stack <String>();
		boolean result = trail_stack.empty();
		System.out.println("Is the stack empty? " + result);  
		trail_stack.push("how");
		trail_stack.push("are");
		trail_stack.push("you");
		trail_stack.push("?");
		trail_stack.push(".......");
		System.out.println(trail_stack);
		trail_stack.pop();
		trail_stack.pop();
		System.out.println("After pop operation" +trail_stack);
		System.out.println(trail_stack.peek());
		System.out.println(trail_stack.search("how"));
	}
}
