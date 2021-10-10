package MyStack;

import java.util.*;
public class queue_operations {
	public static void main(String args[]) {
		Queue<Integer> Queue_operator= new LinkedList<Integer>();
		Queue_operator.add(1);
		Queue_operator.add(2);
		Queue_operator.add(3);
		System.out.println("Top element"+Queue_operator.peek());
		System.out.println("Top element"+Queue_operator.poll());
		System.out.println("Top element"+Queue_operator.peek());
	}
}  
