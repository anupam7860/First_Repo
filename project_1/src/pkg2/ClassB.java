package pkg2;

public class ClassB extends ClassA
{
	public void sub(int a, int b)
	{
	
		int c;
		c=a-b;
		System.out.println(" Class B Result is " +c);
	}
	
	public static void main(String[] args) {
		ClassB c=new ClassB();
		c.sub(12,12);
		c.sum(2, 3, 4);
		c.sub(33,122);
		
	}
}
