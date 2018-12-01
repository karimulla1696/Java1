import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {

	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
		ArrayList<String> obj=new ArrayList();
		obj.add("one");
		obj.add("two");
		obj.add("three");
		obj.add("four");
		obj.add("five");
	    for (int i = 0; i <=7; i++) {
			System.out.println("Welcome");
			System.out.println("----------------");
			System.out.println("1.)Add");
			System.out.println("2.)Delete");
			System.out.println("3.)Search");
			System.out.println("4.)Sort");
			System.out.println("5.)Min");
			System.out.println("6.)Max");
			System.out.println("7.)Exit");
			System.out.println("Enter Your Choice:");
			int n=scanner.nextInt();
			switch(n)
			{
			case 1:System.out.println("Enter the index of element to Instert:");
			int a=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the string add:");
			String s=scanner.nextLine();
			obj.add(a,s);
			for(String s1:obj)
			{
				System.out.println("Data of the array after adding:"+s1);
				
			}
			break;
			case 2:System.out.println(" Enter the index of element to delete: ");
			int b=scanner.nextInt();
			obj.remove(b);
			for(String s2:obj)
			{
				System.out.println("Data of the array after delete:"+s2);
				
			}
			break;
			case 3:System.out.println(" Enter the string you want  Search ");
			scanner.nextLine();
			String str=scanner.nextLine();
			boolean c=obj.contains(str);
			if(c==true)
			{
				System.out.println("object is existed");
			}
			else
			{
				System.out.println("object is not existed");
			}
		
			break;
			case 4:Collections.sort(obj);
			       for(String s3:obj)
			       {
			    	   System.out.println("After sorting:"+s3);
			       }
				   break;
			case 5:Collections.min(obj);
		       for(String s4:obj)
		       {
		    	   System.out.println("The Min Object:"+s4);
		       }
				  break;
			case 6:Collections.max(obj);
		       for(String s5:obj)
		       {
		    	   System.out.println("The Max Object:"+s5);
		       }
				  break;
			case 7:System.exit(0);
			}
		}

	}

}
