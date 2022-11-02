package Inheritance;
class Teacher {
	///Hybrid inheritance
	 void teach() {
	  System.out.println("Teaching subject");
	 }
	}
	class Student extends Teacher {
	 void listen() {
	  System.out.println("Listening");
	 }
	}
	class Student1 extends Student {
		 void write() {
		  System.out.println("Writing");
		 }
		}
	class Principal extends Student {
	 void evaluate() {
	  System.out.println("Evaluating");
	 }
	}
	 
public class Hybrid {
	public static void main(String argu[]) {
		  Principal p = new Principal();
		  Student1 s1=new Student1();
		  
		  p.teach();
		  p.listen();
		  s1.write();
		  p.evaluate();
		 
		  
		  // p.listen(); will produce an error
		 }
}
