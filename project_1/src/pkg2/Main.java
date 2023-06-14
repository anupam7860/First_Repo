package pkg2;

public class Main {
	public Main() 
	{
		this(1,2,3);
		System.out.println("Main Default Constructor");
		// TODO Auto-generated constructor stub
	}
	public Main( int a)
	{
		
		this();
		System.out.println("Main 1 Parameterized Constructor");
	}
	
	public Main (int a, int b)
	{
		this(1);
		System.out.println("Main 2 Parameterized Constructor");
		
	}
	public Main (int a,int b, int c)
	
	{
		System.out.println("Main 3 Parameterized Constructor");
	}
	
	

}
