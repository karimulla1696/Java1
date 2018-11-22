class Area
{
	int a,b;
	void area(int a)
	{
		int area=a*a;
		System.out.println("Area of Square:"+area);
	}
	void area(int a,int b)
	{
		int area=a*b;
		System.out.println("Area of Rectangle:"+area);
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		Area obj=new Area();
		obj.area(2,89);
		obj.area(2);

	}

}
