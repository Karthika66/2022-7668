package exception;
class InvalidMarksException extends Exception
{
	InvalidMarksException()
	{
		System.out.println("Invalid marks!!!!!");
	}
}
class Student
{
	int id;
	int marks;
	String name;
	Student(int i,String n,int m)
	{
		id=1;
		marks=m;
		name=n;
	}
	void Marks() throws InvalidMarksException
	{
		try {
			System.out.println("Roll no:"+id);
			System.out.println("Name   :"+name);
			if(marks<0  || marks>200)
			{
				throw new InvalidMarksException();
			}
			else
				System.out.println("Marks  :"+marks);
		}
		catch(InvalidMarksException e)
		{
			System.out.println("Invalid Marks!!!! Please enter marks between 0 to 100");
		}
	}
}
public class TestThrows {

	public static void main(String[] args) throws InvalidMarksException  {
		// TODO Auto-generated method stub
    Student s1=new Student(1,"Karthika",2500);
    s1.Marks();
    System.out.println();
    Student s2=new Student(1,"Karthika",200);
    s2.Marks();
    
    
	}

}
