package pkg1;

public class method {

	public void method1()
	{
		this.method4();
		System.out.println("default method");
	}
	public void method2()
	{
		this.method3();
		System.out.println("one parameterized method");
	}
	public void method3()
	{
		this.method5();
		System.out.println("two parameterized method");
	}
	public void method4()
	{
		System.out.println("three parameterized method");
	}
	public void method5()
	{
		this.method1();
		System.out.println("four parameterized method");
	}
	public static void main(String[] args) 
	{
	method obj=new method();
	obj.method2();
	}
	
}
