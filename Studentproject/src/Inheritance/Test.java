package Inheritance;
//Hierarchical inheritance
 class Product {
	void Snacks()
	{
		System.out.println("Snacks products");
	}
}
class product1 extends Product
{
void Cookies()
{
	System.out.println("A cookie is a baked or cooked snack");
}
}
class product2 extends Product
{
void Chocolate()
{
	System.out.println("Chocolate is a food product made from roasted and ground cacao ");
}
}
public class Test
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
product1 p1=new product1();
product2 p2=new product2();
p1.Snacks();
p1.Cookies();
p2.Chocolate();
	}
}

