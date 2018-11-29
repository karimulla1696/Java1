class MyThread3 extends Thread
{
	public void run()
	{
		for (int i = 0; i <10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class TestMain4 {

	public static void main(String[] args) {
		MyThread3 obj=new MyThread3();
		obj.setName("Karimulla");
		MyThread3 obj1=new MyThread3();
		obj1.setName("Kalyan Gara");
		MyThread3 obj2=new MyThread3();
		obj2.setName("Anil Kumar");
        obj.start();
        obj1.start();
        try {
			obj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        obj2.start();
        for (int j = 0; j <10; j++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
   
}
