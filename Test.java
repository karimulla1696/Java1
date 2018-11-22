class A
{
	A(int a)
	{
		System.out.println("A is Integer Value :"+a);
	}
}
class B extends A
{
	B(char c,double d,int a)
	{
		super(a);
		System.out.println("C is Character Class:"+c);
		System.out.println("d is Double Integer:"+d);
	}
}
public class Test {

	public static void main(String[] args) {
	B obj=new B('s',23.45,123);

	}

}
