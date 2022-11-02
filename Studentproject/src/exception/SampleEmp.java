package exception;
class EmployeeException extends Exception
{
int id;
EmployeeException(int id)
{
	id=id;
}
void display()
{
	System.out.println(id);
}
public EmployeeException(String s)
{
super(s);
}
}
class SampleEmp
{
void empIDCheck(int EmpID) throws EmployeeException{
if(EmpID<=0 || EmpID>999){
	
throw new EmployeeException("Invalid Employee ID");
}
}
public static void main(String args[])
{
	EmployeeException e1=new EmployeeException(2322);
	System.out.println("Enter the id" );
	e1.display();
SampleEmp emp = new SampleEmp();
try
{
emp.empIDCheck(0);
}
catch (EmployeeException e)
{
System.out.println("Exception caught");
System.out.println(e.getMessage());
}
}
}