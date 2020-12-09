package queues;
import java.util.*;
//program inside queue package 
public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<String> adq = new ArrayDeque<String>();
		
		adq.push("A");
		adq.push("B");
		adq.push("C");
		adq.push("D");
		adq.push("E");
		
		System.out.print("Popping the stack:");
		
		while(adq.peek()!=null) 
			System.out.print(adq.pop()+" ");
		
		System.out.println();
		
	}

}
