
public class Employee {
	int id;
String Employee_name;
static  String Companyname="Captech";
Employee(int i,String e)
{
	id=i;
	Employee_name=e;

}
void display()
{
	System.out.println(id+"    " +Employee_name+  "    " +Companyname);
}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	Employee e1=new Employee(11, "Karthika");
	Employee e2=new Employee(12, "Renu");
	e1.display();
	e2.display();
		}

	}
