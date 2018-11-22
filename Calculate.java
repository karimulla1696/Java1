
public class Calculate {

	public static void main(String[] args) {
		String s="Java is object oriented programming language developed by James gosling";
		String s1[]=s.split(" ");
	    String s2[]=s.split("");
        int c1=0;
        int c2=0;
        for (int i1 = 0; i1 < s1.length; i1++) {
			c1++;
		}
        for (int j1 = 0; j1 < s2.length; j1++) {
			c2++;
		}
        System.out.println("No Of Words :"+c1);
        System.out.println("No Of Characters: "+c2);
        System.out.println("No Of White spaces:"+(c1-1));
	}

}
