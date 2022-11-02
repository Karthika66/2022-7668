package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Comparator<String> stringLengthComparator=new Comparator<String>()
   {
	   public int compare(String s1, String s2)
	   {
		   return s1.length()-s2.length();
	   }
   };
   PriorityQueue<String> namePrioriytyQueue=new PriorityQueue<>(stringLengthComparator);
   namePrioriytyQueue.add("Karthi");
   namePrioriytyQueue.add("Renu");
   namePrioriytyQueue.add("Merlin");
   namePrioriytyQueue.add("Demi");
   namePrioriytyQueue.add("Padhu");
   
   while(!namePrioriytyQueue.isEmpty()) {
	   System.out.println(namePrioriytyQueue.remove());
   
   
	}

}
}
