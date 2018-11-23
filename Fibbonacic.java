
public class Fibbonacic {

	public static void main(String[] args) {
	  long n1=0;
	  long n2=1;
	  System.out.println(n1);
	  System.out.println(n2);
	  for (int i = 2; i < 50; i++) {
		 long n3=n1+n2;
		 n1=n2;
		 n2=n3;
		 System.out.println(n3);
	}
        
	}

}
