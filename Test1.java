class E
{
	E(char k)
	{
		System.out.println("E is Character Class:"+k);
	}
}
class F extends E
{
	F(String s,char k)
	{
		super(k);
		System.out.println("F is String Class:"+s);
	}
}
class G extends F
{
	G(int x,String s,char k)
	{
		super(s,k);
		System.out.println("G is Integer Type:"+x);
	}
}
public class Test1 {

	public static void main(String[] args) {
		
     G obj=new G(10,"Karimulla",'k');
	}

}
