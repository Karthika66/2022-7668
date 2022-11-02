package CollectionFramework;
import java.util.TreeSet;;
public class TreeSetEx3 {

	    public static void main(String[] args) {
	        TreeSet<Integer> evenNumbers = new TreeSet<>();
	        evenNumbers.add(2);
	        evenNumbers.add(4);
	        System.out.println("TreeSet1: " + evenNumbers);

	        TreeSet<Integer> primenumbers = new TreeSet<>();
	        primenumbers.add(1);
	        primenumbers.add(2);
	        primenumbers.add(3);
	        System.out.println("TreeSet2: " + primenumbers);

	        // Union of two sets
	        primenumbers.addAll(evenNumbers);
	        System.out.println("Union is: " + primenumbers);
	        boolean result = primenumbers.containsAll(primenumbers);
	        System.out.println("Is TreeSet2 subset of TreeSet1? " + result);
	        primenumbers.removeAll(evenNumbers);
	        System.out.println("Difference is: " + primenumbers);
	    }
	   
	}

