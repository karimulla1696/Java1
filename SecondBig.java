
public class SecondBig {

	public static void main(String[] args) {
		int a[]= {10,155,156,36,160,120,135};
		int b=a[0];
		int second=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>b)
			{
				second=b;
				b=a[i];
			}
			else if(a[i]>second)
			{
				second=a[i];
			}
		}
           System.out.println(second+" is a Second Largest number");
	}

}
