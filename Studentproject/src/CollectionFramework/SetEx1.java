package CollectionFramework;
import java.io.*;   
import java.util.*;   
import java.util.HashSet;

import java.util.Set;

import java.util.Iterator;
public class SetEx1 {
	
	
	    public static void main(String[] args) {
	        // Creating a set using the HashSet class
	        Set<Integer> set1 = new LinkedHashSet<>();

	        // Add elements to the set1
	        set1.add(0);
	        set1.add(1);
	        set1.add(2);
	        System.out.println("Set1: " + set1);

	        // Creating another set using the HashSet class
	        Set<Integer> newset2 = new LinkedHashSet<>();

	        // Add elements
	        newset2.add(1);
	        newset2.add(2);
	        newset2.add(3);
	        
	        System.out.println("Does data contains newData?: "+set1.containsAll(newset2));
	        System.out.println("The hash code value of set is:"+ newset2.hashCode());   
	        System.out.println("Is data empty?: "+ set1.isEmpty());      
	        Iterator newData = newset2.iterator();  
	        System.out.println("The NewData values are: ");   
	        while (newData.hasNext()) {   
	            System.out.println(newData.next());   
	        }  
	       
	          
	        set1.retainAll(newset2);      
	        System.out.println("data after retaining newset elements : " + newset2);    
	        set1.removeAll(newset2);
	        System.out.println("data after removing Newset elements : " + set1);    
	    }
	}


