package CollectionFramework;
import java.util.Stack;
public class StackEx3 {
	    public static void main(String[] args) {
	    	//generic type
	        Stack<String> s= new Stack<>();

	        // Add elements to Stack
	        s.push("Welcome to");
	        s.push("Full");
	        s.push("Stack");
	       s.push("JAVA");
	       

	        System.out.println("Stack: " + s);
	        String element =s.pop();
	        System.out.println("Removed Element: " + element);
	        System.out.println("Stack: " + s);
	        String element1 = s.peek();
	        System.out.println("Element at top: " + element1);
	        s.push("COURSE");
	        System.out.println("Stack: " + s);
	        //from top it calculate position
	        int position = s.search("Stack");
	        System.out.println("Position of Stack: " + position);
	        
	        // Check if stack is empty
	        boolean result = s.empty();
	        System.out.println("Is the stack empty? " + result);

	    }
	}

