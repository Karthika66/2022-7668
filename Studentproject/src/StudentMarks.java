
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int RollNo=1245;
String studentName="Karthila";
int phy=90,che=80,ca=80;
String division;
int totalMarks=phy+che+ca;
double percentage=totalMarks/3;
System.out.println("RollNO is:"+RollNo);
System.out.println("Name is:"+studentName);
System.out.println("Scored in physics is:"+phy);
System.out.println("Scored in chemistry is:"+che);
System.out.println("Scored in computr application is:"+ca);
System.out.println("Total mark is"+totalMarks);
System.out.println("Percentage is"+percentage);
if(percentage>=80)
{
System.out.println("divisionfirst");
	}
else if(percentage>=70)
{
	System.out.println("divisionsecond");
	
}
	}
}
