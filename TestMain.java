class MyThread extends Thread
{
	//job of this thread
	public void run()
	{
		for (int i = 0; i <10; i++) {
			System.out.println("i is:"+i);
		}
	}
}
public class  TestMain{

	public static void main(String[] args) {
		MyThread obj=new MyThread();
		obj.run();
	
		//job of main method
		for (int j = 0; j < 10; j++) {
			System.out.println("j is:"+j);
		}

	}

}
