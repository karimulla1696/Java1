
public class Dupicate18 {

	public static void main(String[] args) {
		String stringWithDuplicate="Yasin is a good boy";
		char characters[]=stringWithDuplicate.toCharArray();
		boolean found[]=new boolean[256];
		StringBuilder sb=new StringBuilder();
		System.out.println("String with duplicates : " + stringWithDuplicate);
        for(char c:characters)
        {
        	if(!found[c])
        	{
        		found[c]=true;
        		sb.append(c);
        	}
        }
        System.out.println("String after duplicates removed : " + sb.toString());
	}

}
