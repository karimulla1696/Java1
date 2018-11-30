class Atm
{
	int b=5000;
	int r;
	int p;
	synchronized public  void withdraw(int r)
	{
		this.r=r;
		if(b<r)
		{
			try {
				wait(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			deposit(p);
		}
		else
		{
			System.out.println("Collect your Cash Have a Nice day!");
			System.out.println("Balance drawn:"+r);
			System.out.println("Available Balance:"+(b-r));
			System.exit(0);
		}
	}
	synchronized  public void deposit(int p)
	{
		this.p=p;
		System.out.println(p+" has been deposited");
		b=b+p;
		System.out.println("Available Balance:"+b);
		withdraw(r);
	}
}
class Withdraw extends Thread
{
	Atm money;

	public Withdraw(Atm money) {
		
		this.money = money;
	}
	public void run()
	{
		money.withdraw(20000);
	}
}
class Deposit extends Thread
{
	Atm money;

	public Deposit(Atm money) {
		
		this.money = money;
	}
	public void run()
	{
		money.deposit(5000);
		notify();
	}
}

public class Account
{
	public static void main(String[] args) {
	Atm obj=new Atm();
	Withdraw t1=new Withdraw(obj);
	Deposit t2=new Deposit(obj);
	t1.start();
	t2.start();
	}




}
