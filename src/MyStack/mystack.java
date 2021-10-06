package MyStack;
import java.util.*;
public class mystack {
	public static void main(String[] args) {

			Queue<Integer> q = new LinkedList<>();
		    for (int i = 0; i < 5; i++)
		           q.add(i);
		    // Display contents of the queue.
		    System.out.println("Elements of queue "+ q);
		    // To remove the head of queue.
		    int removed_element = q.remove();
		    System.out.println("removed element-"+ removed_element);
		    System.out.println(q);
		    // To view the head of queue
		    int head = q.peek();
		    System.out.println("head of queue-"+ head);
		    int size = q.size();
		    System.out.println("Size of queue-"+ size);
	}
}
