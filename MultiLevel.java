class Karishma
{
        int wheels=2;
		int tank=1;
		int chules=1;
		int brakes=2;
		void printKarishmaData()
		{
		System.out.println("No Of Wheels:"+wheels);
		System.out.println("No Of tank:"+tank);
		System.out.println("No of chules:"+chules);
		System.out.println("No of brakes:"+brakes);
		}
}
class Jupiter extends Karishma
{
	String color="White";
	int gears=0;
	void printJupiterData()
	{
		System.out.println("Jupiter Properties");
	    System.out.println("---------------------");
		System.out.println("No Of color:"+color);
		System.out.println("No of gears:"+gears);
	}
}
	
	class Apache extends Jupiter
	{
		String color="red";
		int gears=5;
		void printApacheData()
		{
			System.out.println("Apache Properties");
			System.out.println("------------------------");
			System.out.println("No of Color:"+color);
			System.out.println("No Of gears:"+gears);
		}
	}
	class Yamaha extends Apache
	{
		String color="blue";
		int gears=6;
		void printYamahaData()
		{
			System.out.println("Yamaha Properties");
			System.out.println("------------------------");
			System.out.println("No of Color:"+color);
			System.out.println("No Of gears:"+gears);
		}
	}


public class MultiLevel {

	public static void main(String[] args) {
	
   
     Yamaha obj1=new Yamaha();
     obj1.printYamahaData();
     obj1.printKarishmaData();
     obj1.printApacheData();
     obj1.printJupiterData();
	}

}
