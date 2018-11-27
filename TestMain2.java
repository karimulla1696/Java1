class MyThread1 extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("i is:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class TestMain2 {

	public static void main(String[] args) {
		MyThread1 obj=new MyThread1();
		obj.start();
		for (int j = 0; j < 10; j++) {
			System.out.println("j is:"+j);
		}

	}

}
