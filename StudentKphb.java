import java.util.Scanner;
class Address
{
	int doorno;
	String street;
	String city;
	public Address(int doorno, String street, String city) {
	    this.doorno = doorno;
		this.street = street;
		this.city = city;
	}
	
}
class Student
{
	int regno;
	String name;
	Address addr;
	public Student(int regno, String name,Address addr) {
		this.regno = regno;
		this.name = name;
		this.addr=addr;
	}
	
}
public  class StudentKphb {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    System.out.println("Enter  No of Student");
    int n=scanner.nextInt();
    String s[]=new String[n];
    Student ar[]=new Student[n];
    
    for (int i = 0; i < s.length; i++) {
		System.out.println("Enter Student Details");
		int rollno=scanner.nextInt();
		String name=scanner.next();
		
	
		System.out.println("Enter the address details");
		int door=scanner.nextInt();
		String street=scanner.next();
		scanner.nextLine();
		String city=scanner.nextLine();
		//System.out.println("Reg No:"+x+"Name is:"+y+"DoorNo is:"+a+"Street name is:"+b+" City is:"+d);
		
		Address obj1=new Address(door,street,city);
		Student obj2=new Student(rollno,name,obj1);
		ar[i]=obj2;
	}
	  System.out.println("Regno    "+" "+"Name    " +"Doorno    "+"Street    "+"City    ");
	  System.out.println("===============================================================");
	  for (int j = 0; j < ar.length; j++) {
		System.out.println(ar[j].regno+"        "+ar[j].name+"      "+ar[j].addr.doorno+"      "+ar[j].addr.street+"          "+ar[j].addr.city);
	}
	}

}
