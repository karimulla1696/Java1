class Arthematic
{
	void operation1(int n)
	{
		for (int i = 1; i <=3; i++) {
			n++;
			System.out.println(n);
		}
	}
	void operation2(int n)
	{
		for (int i = 1; i <=3; i++) {
			n--;
			System.out.println(n);
		}
	}
}
class Inc extends Thread
{
	Arthematic obj;

	 Inc(Arthematic obj) {
		this.obj = obj;
	}
	public void run()
	{
		obj.operation1(10);
	}
	
}
class Dec extends Thread
{
	Arthematic obj;

	 Dec(Arthematic obj) {
		this.obj = obj;
	}
	public void run()
	{
		obj.operation2(10);
	}
	
}
public class IncOrDecThread {

	public static void main(String[] args) {
		Arthematic obj=new Arthematic();
		Inc in=new Inc(obj);
		Dec di=new Dec(obj);
		in.start();
		di.start();
	}

}
