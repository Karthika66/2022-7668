package CollectionFramework;
import java.util.*;  
class SortArrayList{  
 public static void main(String args[]){  
  //Creating a list of names 
  List<String> list1=new ArrayList<String>();  
  list1.add("Karthika");  
  list1.add("Demi");  
  list1.add("Renu");  
  list1.add("Merlin");  
  //Sorting the list  
  Collections.sort(list1);  
      
  for(String fruit:list1)  
    System.out.println(fruit);  
      
 System.out.println("Sorting numbers...");  
  //Creating a list of numbers  
  List<Integer> list2=new ArrayList<Integer>();  
  list2.add(21);  
  list2.add(11);  
  list2.add(51);  
  list2.add(1);  
  //Sorting the list  
  Collections.sort(list2);  
   //Traversing list through the for-each loop  
  for(Integer number:list2)  
    System.out.println(number);  
 }  
   
}  