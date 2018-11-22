
public class ReverseString {

	public static void main(String[] args) {
		String s="karimulla";
		char ch[]=s.toCharArray();
        char b[]=new char[ch.length];
        int j=0;
        for (int i=ch.length-1; i >=0; i--) 
        {
		b[j]=ch[i];
		j++;
	    }
      String s2=new String(b);
	  System.out.println("Reverse of a String is:"+ s2);
	}
	}

