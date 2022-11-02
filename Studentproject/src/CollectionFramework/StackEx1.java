package CollectionFramework;

import java.util.*;

public class StackEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack s=new Stack();
     //non generic
     s.push(10);
     s.push(20);
     s.push(30);
     s.push(40);
     System.out.println("content of s:"+s);
     System.out.println("Size of s:"+s.size());
     System.out.println("Capacity of s:"+s.capacity());
     System.out.println("Is empty:"+s.empty());
     System.out.println("Delete element:"+s.pop());
     System.out.println("Content of s after pop:"+s);
     System.out.println("Top most element:"+s.peek());
     System.out.println("Content of s after peek:"+s);
     int srp=s.search(10);
     System.out.println("Stack relative pos.of 10 is:"+srp);
     int srp1=s.search(100);
     System.out.println("Stack relative pos.of 100 is:"+srp1);
	}

}
