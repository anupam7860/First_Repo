package pkg2;

public class ClassA {
	public void sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println(" Class A Result is "+c);
	}
	public void sum(int a, int b, int c)
	{
		int e;
		e=a+b+c;
		System.out.println("Class A Result is "+e);
	}

public static void main(String[] args) {
	ClassA c=new ClassA();
	c.sum(12, 12);
	c.sum(12, 12, 12);
}
}
