import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
class Std
{
	int no;
	int age;
	String name;
	public Std(int no, int age, String name) {
		this.no = no;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Std [no=" + no + ", age=" + age + ", name=" + name + "]";
	}
	
}
class Numbercomparator implements Comparator<Std>
{
	public int compare(Std s1,Std s2)
	{
		if(s1.no==s2.no)
		{
			return 0;
		}
		else if(s1.no>s2.no)
		{
			return 1;
		}
		else return -1;
	}
}
class Agecomparator implements Comparator<Std>
{
	public int compare(Std s1,Std s2)
	{
		if(s1.age==s2.age)
		{
			return 0;
		}
		else if(s1.age>s2.age)
		{
			return 1;
		}
		else return -1;
	}
}
class Namecomparator implements Comparator<Std>
{
	public int compare(Std s1,Std s2)
	{
	
      return (s1.name).compareTo(s2.name);
	}
}
public class Comparator2 {

	public static void main(String[] args) {
	ArrayList<Std> obj=new ArrayList();
	obj.add(new Std(20,9,"karimulla"));
	obj.add(new Std(10,26,"rohith"));
	obj.add(new Std(50,15,"ganesh"));
	obj.add(new Std(40,30,"mahesh"));
	for(Std s:obj)
	{
		System.out.println(s);
	}
	System.out.println();
	System.out.println();
	Collections.sort(obj,new Numbercomparator());
	{
		for(Std s:obj)
		{
			System.out.println(s);
		}
	}
	System.out.println();
	System.out.println();
	Collections.sort(obj,new Agecomparator());
	{
		for(Std s:obj)
		{
			System.out.println(s);
		}	
	}
	System.out.println();
	System.out.println();
	Collections.sort(obj,new Namecomparator());//NameComparator obj1=new NameComparator(); 
	{
		for(Std s:obj)
		{
			System.out.println(s);
		}	
	}
	}
	}


