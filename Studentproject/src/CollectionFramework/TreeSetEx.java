package CollectionFramework;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             TreeSet<String> students=new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
             System.out.println(students.add("Karthika"));
             System.out.println(students.add("KARTHIKA"));
             students.add("Renu");
             students.add("Merlin");
             students.add("Padhu");
             System.out.println("Students TreeSet:"+students);
             System.out.println("Number of elements in the TreeSet:"+students.size());
             String name="Karthika";
             if(students.contains(name))
             {
            	 System.out.println("TreeSet contains the element:"+name);
           }
             else
             {
            	 System.out.println("TreeSet does not contains the elements"+name);
             }
             System.out.println("First element:"+students.first());
             System.out.println("Last element:"+students.last());
             name="Renu";
             System.out.println("Element just greater than" +name+ ":"+students.higher(name));
             System.out.println("Element just lower than" +name+ ":"+students.lower(name));
	}

}
