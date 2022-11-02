package CollectionFramework;
import java.util.*;  
public class VectorEx1 {

	
	       public static void main(String args[]) {  
	          //Create an empty vector with initial capacity 4  
	          Vector<String> vec = new Vector<String>(4);  
	          //Adding elements to a vector  
	          vec.add("Karthi");  
	          vec.add("Renu");  
	          vec.add("Merlin");  
	          vec.add("Padhu");  
	          //Check size and capacity  
	          System.out.println("Size is: "+vec.size());  
	          System.out.println("Default capacity is: "+vec.capacity());  
	          //Display Vector elements  
	          System.out.println("Vector element is: "+vec);  
	          vec.addElement("Subash");  
	          vec.addElement("Sundar");  
	          vec.addElement("Ruban");  
	          //Again check size and capacity after two insertions  
	          System.out.println("Size after addition: "+vec.size());  
	          System.out.println("Capacity after addition is: "+vec.capacity());  
	          //Display Vector elements again  
	          System.out.println("Elements are: "+vec);  
	          //Checking if karthi is present or not in this vector         
	            if(vec.contains("Karthi"))  
	            {  
	               System.out.println("Karthika is present at the index " +vec.indexOf("Karthi"));  
	            }  
	            else  
	            {  
	               System.out.println("Karthi is not present in the list.");  
	            }  
	          //Get the hashcode for this vector  
	            System.out.println("Hash code of this vector = "+vec.hashCode());  
	          //Get the element at specified index  
	            System.out.println("Element at index 5 is = "+vec.get(5));  
	          //Get the first element
	          System.out.println("The first animal of the vector is = "+vec.firstElement());   
	          //Get the last element  
	          System.out.println("The last animal of the vector is = "+vec.lastElement());
	          System.out.println("Remove element at index 4: " +vec.remove(4));  
	          //Remove the element at index 4  
	          System.out.println("Vector element is: "+vec);  
	       }  
	}  

