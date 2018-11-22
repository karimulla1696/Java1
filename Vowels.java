
public class Vowels {

	public static void main(String[] args) {
		String s2="Karimulla";
		char ch[]=s2.toCharArray();
      for (int index = 0; index < ch.length; index++) {
		if(ch[index]=='a' || ch[index]=='e' || ch[index]=='i' || ch[index]=='o' || ch[index]=='u')
		{
			int z=s2.indexOf(ch[index]);
			System.out.println(z +" is Position of  Vowel " +ch[index]);
		}
	}
	}

}
