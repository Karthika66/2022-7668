package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
	public static void main(String[] args) {
		      Queue<Integer> q = new LinkedList<>();
		      for(int i=8;i<15;i++)
		    	  
		      q.add(i);
		   
		      System.out.println("Element of queue: " + q);
		      int num1 = q.remove();
		System.out.println("The element deleted from the head is: " + num1);
		System.out.println("The queue after deletion is: " + q);
		int head = q.peek();
		System.out.println("The head of the queue is: " + head);
		System.out.println("Removed Element: " +q.remove());
		int size = q.size();
		System.out.println("The size of the queue is: " + size);
		boolean contains9 = q.contains(9);
		System.out.println("If it contains 9"+contains9);
		q.clear();
		 System.out.println("Element of queue: " + q);
		}
		}
