package pkg1;

public class child2 extends parent
{
public void c2()
{
	System.out.println("i am second child");
}
public static void main(String[] args) {
	child2 c=new child2();
	c.c2();
	c.m1();
	
}
}
