import java.util.Scanner;

public class ArrayCreationElements {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the place insterted");
		int n=scanner.nextInt();
		System.out.println("Enter the place deleted");
		int a=scanner.nextInt();
		int b[]=new int[10];
		int c[]= {1,2,3,4,5,6};
      for (int i = 0, j=0; i < b.length; i++,j++) {
		if(j>(c.length-1))
		{
			break;
		}
		else
		{
			b[i]=c[j];
		}
	}
      System.out.println("Enter Number to be insterted");
      int s=scanner.nextInt();
      for (int i=b.length-1; i>=n;i--) {
		b[i]=b[i-1];
	}
      b[n]=s;
      System.out.println("Array after insertion");
      for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
      System.out.println("Array After Deletion");
      for (int i =a; i < b.length-1; i++) {
		b[i]=b[i+1];
	}
      for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
	}

}
