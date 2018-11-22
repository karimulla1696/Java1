class PermantAddress
{
	int doorno;
	String village;
	String city;
	long pincode;
	public PermantAddress(int doorno, String village, String city, long pincode) {
		this.doorno = doorno;
		this.village = village;
		this.city = city;
		this.pincode = pincode;
	}
	
	}

class TemporaryAddress
{
	int doorno;
	String area;
	String city;
	long pincode;
	public TemporaryAddress(int doorno, String area, String city, long pincode) {
		this.doorno = doorno;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	
}
class EmployeeData
{
	int empid;
	String name;
	double salary;
	PermantAddress paddress;
	TemporaryAddress taddress;
	public EmployeeData(int empid, String name, double salary, PermantAddress paddress, TemporaryAddress taddress) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.paddress = paddress;
		this.taddress = taddress;
	}
	void getPrintData()
	{
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+salary);
		System.out.println("Employee PermenatAddress:"+paddress.doorno+" ,"+paddress.village+" ,"+paddress.city+" ,"+paddress.pincode);
		System.out.println("Employee TemporaryAddress:"+taddress.doorno+" ,"+taddress.area+" ,"+taddress.city+" ,"+taddress.pincode);
	}
	
}
public class Employee {

	public static void main(String[] args) {
		PermantAddress obj=new PermantAddress(213,"chilakaluripet","Guntur",522616);
		TemporaryAddress obj1=new TemporaryAddress(534,"subhaninagar","ongole",522606);
		EmployeeData obj2=new EmployeeData(34,"Karimulla",20000,obj,obj1);
		obj2.getPrintData();

	}

}
