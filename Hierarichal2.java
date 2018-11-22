class Iphone
{
	int screen=1;
	int battery=1;
	void printIphoneData()
	{
		
		System.out.println("No Of screen:"+screen);
		System.out.println("No Of battery:"+battery);
	}
}
class Version1 extends Iphone
{
	String color="black";
	float size=3.5f;
	int ram=512;
	void printVersion1Data()
	{
		
		System.out.println("No Of Color:"+color);
		System.out.println("No Of size:"+size);
		System.out.println("No Of Ram Size:"+ram);
		
	}
	
}
class Version2 extends Iphone
{
	String color="blue";
	int size=4;
	int ram=2;
	void printVersion2Data()
	{
		
		System.out.println("No Of Color:"+color);
		System.out.println("No Of size:"+size);
		System.out.println("No Of Ram Size:"+ram);
		
	}
	
}
class Version3 extends Version2
{
	String color="red";
	int size=5;
	int ram=4;
	void printVersion3Data()
	{
		
		System.out.println("No Of Color:"+color);
		System.out.println("No Of size:"+size);
		System.out.println("No Of Ram Size:"+ram);
		
	}
	
}

public class Hierarichal2 {

	public static void main(String[] args) {
		System.out.println("Version1 Details");
		System.out.println("----------------------");
		Version1 obj=new Version1();
		obj.printIphoneData();
		obj.printVersion1Data();
		System.out.println("Version2 Details");
		System.out.println("----------------------");
		Version2 obj2=new Version2();
		obj2.printIphoneData();
		obj2.printVersion2Data();
		System.out.println("Version3 Details");
		System.out.println("----------------------");
		Version3 obj3=new Version3();
		obj2.printVersion2Data();
		obj3.printVersion3Data();

	}

}
