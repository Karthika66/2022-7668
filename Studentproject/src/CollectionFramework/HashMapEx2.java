package CollectionFramework;
import java.util.HashMap;
public class HashMapEx2 {
	
	  public static void main(String[] args) {

	    // create a hashmap
	    HashMap< Integer,String> languages = new HashMap<>();

	    // add elements to hashmap
	    languages.put(8,"Java");
	    languages.put(1,"JavaScript");
	    languages.put(3,"Python");
	    System.out.println("HashMap: " + languages);
	    
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);

	    
	    // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + languages.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + languages.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + languages.entrySet());

	    languages.replace(8, "C++");
	    System.out.println("HashMap using replace(): " + languages);
	  }
	}
