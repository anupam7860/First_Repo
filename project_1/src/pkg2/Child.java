package pkg2;

public  class Child extends Parent

{
	public void m0()
	{
		
		this.m1();
		System.out.println("Child Default method");
	}
	public void m1()
	{
		this.m2();
		System.out.println("Child 1 parameterized method");
	}
	public void m2()
	{
		super.m3();
		super.m2();
		super.m1();
		super.m0();
		System.out.println("Child 2 parameterized method");
	}
	public void m3()
	{
		this.m0();
		System.out.println("Child 3 parameterized method");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.m3();
		
	}

}
