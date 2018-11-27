class MyThread2 extends Thread
{
	public void run()
	{
		for (int i = 0; i <4; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class TestMain3 {

	public static void main(String[] args) {
		MyThread2 t1=new MyThread2();
		  t1.setName("thread-1");
		MyThread2 t2=new MyThread2();
			t2.setName("thread-2");
          t1.start();
          t2.start();
          for (int j = 0; j <4; j++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
