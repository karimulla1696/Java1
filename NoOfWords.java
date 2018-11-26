import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoOfWords {

	public static void main(String[] args) {
		int z=0;
		try
		{
			FileReader fileReader=new FileReader("F://java2/first1.txt");
			BufferedReader bufferReader=new BufferedReader(fileReader);
			String s;
			while((s=bufferReader.readLine())!=null)
			{	
				String s1[]=s.split(" ");
				String s2[]=s.split("");
				System.out.println(s);
				for(int i=0;i<s1.length;i++)
					{
					
					}
				System.out.println("No of words is:"+s1.length);
				System.out.println("No of characters is:"+s2.length);
				z++;
				
		    }
			
			System.out.println("No Of Lines:"+z);
		}
		catch(FileNotFoundException e)
		{
			System.out.println();
		}
		catch(IOException e)
		{
			
		}

	}

}
