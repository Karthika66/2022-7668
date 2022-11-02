package Abstraction;
 abstract class Employee
{
	abstract void getName(String name);
	abstract void getEmp_id(int id);
	abstract void getGender(String gender);
}
 class Details extends Employee
{
	public void getName(String name)
	{
		System.out.println("Name:"+name);
	}
	void getEmp_id(int id)
	{
		System.out.println("Emp_id:"+id);
	}
	void getGender(String gender)
	{
		System.out.println("Genger:"+gender);
	}
	void getDesignation(String designation)
	{
		System.out.println("Designation:"+designation);
	}
	void getSalary(int salary)
	{
		System.out.println("Salary:"+salary);
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Details();
		Details d=new Details();
e.getName("Karhika");
e.getEmp_id(116);
e.getGender("Female");
d.getDesignation("Java Developer");
d.getSalary(40000);
	}

}
