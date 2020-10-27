package array;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class CustomPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		/*pq.add(1);
		pq.add(9);
		pq.add(4);
		pq.add(8);
		pq.add(7); */
		pq.add(5);
		pq.add(4);
		pq.add(3);
		pq.add(2);
		pq.add(1);
		System.out.println(pq.toString());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.toString());

	}

}
