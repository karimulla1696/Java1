class Bank1
{
	void bankData()
	{
		System.out.println("Every Bank has Interest");
	}
}
class Icici extends Bank1
{
	void bankData()
	{
		System.out.println("Rate Of Interset of Icici Bank is :18%");
	}
}
class Sbi extends Bank1
{
	void bankData()
	{
		System.out.println("Rate Of Interset of Sbi Bank is   :20%");
	}
}
class Andhra extends Bank1
{
	void bankData()
	{
		System.out.println("Rate Of Interset of Andhra Bank is:24%");
	}
}
class City extends Bank1
{
	void bankData()
	{
		System.out.println("Rate Of Interset of City Bank is  :13.5%");
	}
}
public class Bank {

	public static void main(String[] args) {
		Bank1 obj;
		obj=new Icici();
		obj.bankData();
        obj=new Sbi();
        obj.bankData();
        obj=new Andhra();
        obj.bankData();
        obj=new City();
        obj.bankData();
	}

}
