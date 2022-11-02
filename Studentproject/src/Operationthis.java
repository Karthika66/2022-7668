
public class Operationthis {
int a=10;
int b=20;
Operationthis()
{
	System.out.println("add:"+(a+b));
}
Operationthis(int a)
{
	this();
	System.out.println("sub:"+(a-b));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Operationthis obj=new Operationthis(4);
	}

}
