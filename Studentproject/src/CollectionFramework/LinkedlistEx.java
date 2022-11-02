package CollectionFramework;
import java.util.*;
public class LinkedlistEx {
	
	     public static void main(String args[]) {

	       /* Linked List Declaration */
	       LinkedList<String> linkedlist = new LinkedList<String>();

	       /*add(String Element) is used for adding 
	        * the elements to the linked list*/
	       linkedlist.add("One");
	       linkedlist.add("2");
	       linkedlist.add("null");
	       linkedlist.add("Two");
	       linkedlist.add("Four");

	       /*Display Linked List Content*/
	       System.out.println("Linked List Content: " +linkedlist);

	       /*Add First and Last Element*/
	       linkedlist.addFirst("First Item");
	       linkedlist.addLast("Last Item");
	       System.out.println("LinkedList Content after addition: " +linkedlist);

	     
	       /*Remove first and last element*/
	       linkedlist.removeFirst();
	       linkedlist.removeLast();
	       System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

	       /* Add to a Position and remove from a position*/
	       linkedlist.add(0, "Newly added item");
	       linkedlist.remove(2);
		      
	       System.out.println("Final Content: " +linkedlist); 
	     }
	}
