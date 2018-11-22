class Hero
{
        int wheels=2;
		int tank=1;
		int chules=1;
		int brakes=2;
		void printHeroData()
		{
		System.out.println("No Of Wheels:"+wheels);
		System.out.println("No Of tank:"+tank);
		System.out.println("No of chules:"+chules);
		System.out.println("No of brakes:"+brakes);
		}
}
class Activa extends Hero
{
	String color="White";
	int gears=0;
	void printActivaData()
	{
		System.out.println("Activa Properties");
	    System.out.println("---------------------");
		System.out.println("No Of color:"+color);
		System.out.println("No of gears:"+gears);
	}
}
public class Bike {

	public static void main(String[] args) {
	
	Activa obj=new Activa();
	
	obj.printActivaData();
	obj.printHeroData();

	}

}
