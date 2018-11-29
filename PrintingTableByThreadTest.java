class Table
{
	synchronized void printTable(int n)
	{
		for (int i = 1; i <=10; i++) {
			System.out.println(n+"x"+i+"="+(n*i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class T1 extends Thread
{
	Table obj;

	public T1(Table obj) {
		this.obj = obj;
	}
	public void run()
	{
		obj.printTable(2);
	}
	
}
class T2 extends Thread
{
	Table obj;

	public T2(Table obj) {
		this.obj = obj;
	}
	public void run()
	{
		obj.printTable(7);
	}
	
}
public class PrintingTableByThreadTest {

	public static void main(String[] args) {
		Table obj=new Table();
		T1 t1=new T1(obj);
		T2 t2=new T2(obj);
		t1.start();
		t2.start();
	}

}
