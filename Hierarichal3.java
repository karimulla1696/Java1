class Teacher
{
	String subject="science";
	void printTeacherData()
	{
		
		System.out.println("No Of Subject:"+subject);
	}
}
class Standard1 extends Teacher
{
	int no=34;
	void printStandard1Data()
	{
		
		System.out.println("No Of Students:"+no);
	}
	
}
class  Standard2 extends Teacher
{
	int no=42;
	void printStandard2Data()
	{
		
		System.out.println("No Of Students:"+no);
	}
	
}
class Standard3 extends Teacher
{
	int no=44;
	void printStandard3Data()
	{
		
		System.out.println("No Of Students:"+no);
	}
	
}
class Standard4 extends Standard3
{
	String name="kalyan";
	void printStandard4Data()
	{
		
		System.out.println("Name Of Student:"+name);
	}
	
}
class Standard5 extends Standard4
{
	String name="krishna";
	void printStandard5Data()
	{
		
		System.out.println("No Of Students:"+name);
	}
	
}
class Standard6 extends Standard4
{
	String name="siva";
	void printStandard6Data()
	{
		
		System.out.println("No Of Students:"+name);
	}
	
}
public class Hierarichal3 {

	public static void main(String[] args) {
		System.out.println("Standard1 Details");
       System.out.println("-------------------------------------");
		Standard1 obj=new Standard1();
        obj.printTeacherData();
        obj.printStandard1Data();
        
        System.out.println("Standard2 Details");
        System.out.println("--------------------------------------");
        Standard2 obj2=new Standard2();
        obj.printTeacherData();
        obj2.printStandard2Data();
        System.out.println("Standard3 Details");
        System.out.println("--------------------------------------");
        Standard3 obj3=new Standard3();
        obj3.printTeacherData();
        obj3.printStandard3Data();
        System.out.println("Standard4 Details");
        System.out.println("--------------------------------------");
        Standard4 obj4=new Standard4();
        obj4.printTeacherData();
        obj4.printStandard3Data();
        obj4.printStandard4Data();
        System.out.println("Standard5 Details");
        System.out.println("--------------------------------------");
        Standard5 obj5=new Standard5();
        obj5.printTeacherData();
        obj4.printStandard4Data();
        obj5.printStandard5Data();
        System.out.println("Standard6 Details");
        System.out.println("--------------------------------------");
        Standard6 obj6=new Standard6();
        obj6.printTeacherData();
        obj4.printStandard4Data();
        obj6.printStandard6Data();
	}

}

