class Booking extends Thread
{
	int n=2;
	public void bookMyticket()
	{
	
			if( n>0)
			{
			n--;
			System.out.println("Waiting for payment"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("successfully booking:"+Thread.currentThread().getName());
			}
			else 
			{
				System.out.println("sorry Not Available:"+Thread.currentThread().getName());
				
			}
	
	}
}
	class Audiennce extends Thread 
	{
		Booking book;
		
		public Audiennce(Booking book) {
			
			this.book = book;
		}

		public void run()
		{
			book.bookMyticket();
	    }
}
public class Tickets {

	public static void main(String[] args) {
	Booking book=new Booking();
	Audiennce t1=new Audiennce(book);
	Audiennce t2=new Audiennce(book);
	Audiennce t3=new Audiennce(book);
	t1.start();
	t2.start();
	t3.start();
	}

}
