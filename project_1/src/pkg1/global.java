package pkg1;

public class global
{
int abc=123;
public void method1( int abc)
{
	this.abc=abc;
}
public static void main(String[] args) {
	global obj=new global();
	System.out.println("before changing " +obj.abc);
	obj.method1(12);
	System.out.println("after changing " +obj.abc);
}

}
