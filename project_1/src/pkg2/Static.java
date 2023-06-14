package pkg2;

public class Static 
{
	static int a;
	public static  void abc ()
{
	
		System.out.println("i am static method");
}
public static void main(String[] args) {
	Static.abc();
	Static.a=420;
	System.out.println(Static.a);
}
}
