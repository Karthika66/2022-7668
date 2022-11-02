
public class Studentdetails {
	String name;
	int id;
	Studentdetails(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
public void display()
{
	System.out.print("Student name is:" +name+ "Id is:"+id);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Studentdetails s1=new Studentdetails("Karthika",066);
s1.display();
	}

}
