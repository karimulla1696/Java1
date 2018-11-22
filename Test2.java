class P
{
	P(String s2)
	{
		System.out.println("P is String Character:"+s2);
	}
}
class Q extends P
{
	Q(String s2)
	{
		super(s2);
		System.out.println("Q is String Character:"+s2);
	}
}
class R extends Q
{
	R(int z,String s2)
	{
		super(s2);
		System.out.println("R is Integer Value:"+z);
	}
}
class T extends Q
{
	T(String s2,double j)
	{
		super(s2);
		System.out.println("T is Double Value:"+j);
	}
}
public class Test2 {

	public static void main(String[] args) {
		
      R obj=new R(124,"Mulla");
      T Obj1=new T("Mahesh",24.52);
	}

}
