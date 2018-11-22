
public class Frequency {

	public static void main(String[] args) {
		String s="aaaaabbaaabcccccc";
		int choice1=0;
		int choice2=0;
		int choice3=0;
		char ch[]=s.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
    	   if(ch[i]=='a')
    	   {
    		   choice1++;
    	   }
    	   else if(ch[i]=='b')
    	   {
    		   choice2++;
    	   }
    	   else
    	   {
    		   choice3++;
    	   }
       }
       System.out.println("char                Frequency");
       System.out.println("-----------------------------------------");
       System.out.println(" a                    "+choice1);
       System.out.println(" b                    "+choice2);
       System.out.println(" c                    "+choice3);
	}

}
