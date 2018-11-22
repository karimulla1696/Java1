
public class Split {

	public static void main(String[] args) {
		String s1="Hyderabad";
		String s2="Guntur";
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch1.length; j++) {
				if(ch[i]==ch1[j])
				{
					System.out.println("The Matched Character:"+ ch1[j]);
					System.out.println("The index of Matched:"+ j);
				}
			}
		}

	}

}
