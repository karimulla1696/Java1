class Mechanical
{
	String part1;
	String part2;
	String part3;
	String part4;
	public Mechanical(String part1, String part2, String part3, String part4) {
		super();
		this.part1 = part1;
		this.part2 = part2;
		this.part3 = part3;
		this.part4 = part4;
	}
	
	}
	

class Electrical
{
	String components1;
	String components2;
	String components3;
	public Electrical(String components1, String components2, String components3) {
		super();
		this.components1 = components1;
		this.components2 = components2;
		this.components3 = components3;
	}
	
}
class CarDataDetails
{
	String name;
	String s1;
	String s2;
	Mechanical mcom;
	Electrical ecom;
	public CarDataDetails(String name,String s1, String s2, Mechanical mcom, Electrical ecom) {
		super();
		this.name=name;
		this.s1 = s1;
		this.s2 = s2;
		this.mcom = mcom;
		this.ecom = ecom;
	}
	void getCar()
	{
		
		System.out.println("car has any one of below two enginee:");
		System.out.println(name);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Mechanical Components are:");
		System.out.println(mcom.part1+" ,"+mcom.part2+" ,"+mcom.part3+" ,"+mcom.part4);
		System.out.println("Electrical Components:");
		System.out.println(ecom.components1+" ,"+ecom.components2+" ,"+ecom.components3);
	}
}
public class Car {

	public static void main(String[] args) {
		Mechanical obj=new Mechanical("Clinderpistal","Valves","Connecting Rod","Oil Pump");
		Electrical obj1=new Electrical("Alternator","Stater Motor","Spark Plug");
		CarDataDetails obj2=new CarDataDetails("BMW","A/C Compression","Break Disk",obj,obj1);
                obj2.getCar();
	}

}
