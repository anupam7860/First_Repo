package pkg1;

public class child extends parent
{

public void m2()
{
System.out.println("i am the first son");	
}
public static void main(String[] args) {
	child c1=new child();
	c1.m2();
	c1.basePrice();
}

}
