class Sony
{
	int screen=1;
	int remote=1;
	void printSonyData()
	{
		
		System.out.println("No Of screen:"+screen);
		System.out.println("No Of Remote:"+remote);
	}
}
class Model1 extends Sony
{
	String color="black";
	int size=34;
	void printModel1Data()
	{
		
		System.out.println("No Of Color:"+color);
		System.out.println("No Of size:"+size);
	}
	
}
class Model2 extends Sony
{
	String color="blue";
	int size=42;
	void printModel2Data()
	{
		
		System.out.println("No Of Color:"+color);
		System.out.println("No Of size:"+size);
	}
	
}
class Model3 extends Sony
{
	String color="red";
	int size=44;
	void printModel3Data()
	{
		
		System.out.println("No Of Color:"+color);
		System.out.println("No Of size:"+size);
	}
	
}
public class Hierarichal {

	public static void main(String[] args) {
		System.out.println("Model1 Details");
		System.out.println("----------------------");
		Model1 obj=new Model1();
		obj.printSonyData();
		obj.printModel1Data();
		System.out.println("Model2 Details");
		System.out.println("----------------------");
		Model2 obj2=new Model2();
		obj.printSonyData();
		obj2.printModel2Data();
		System.out.println("Model3 Details");
		System.out.println("----------------------");
		Model3 obj3=new Model3();
		obj.printSonyData();
		obj3.printModel3Data();
		
	}

}
