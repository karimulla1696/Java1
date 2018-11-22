
public class Big {

	public static void main(String[] args) {
		int a[]= {10,20,40,80,100};
		int k=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(k<a[i])
			{
				k=a[i];
			}
		}
		System.out.println(k+" is Big Number in array");

	}

}
