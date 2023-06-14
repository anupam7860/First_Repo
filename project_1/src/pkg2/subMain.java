package pkg2;

public class subMain extends Main
{
public subMain() {
		
	
	this(1,2,3);
	
	System.out.println("Sub main Default Constructor");
	
}
public subMain(int a)
{
	
	this();
	System.out.println("Sub main 1 Parameterized Constructor");
}

public subMain(int a, int b)
{
	
	this(1);
	
	System.out.println("Sub main 2 Parameterized Constructor");
}
public subMain(int a, int b,int c)
{
	
	super(1,2);

	System.out.println("Sub main 3 Parameterized Constructor");
}

public static void main(String[] args) 
{
	subMain s=new subMain(1,2);
}
}
