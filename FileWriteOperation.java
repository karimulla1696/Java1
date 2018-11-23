import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOperation {

	public static void main(String[] args) {
		try
		{
			FileWriter fr=new FileWriter("F://java2/first.txt");
			BufferedWriter br=new BufferedWriter(fr);
			br.write("Districts Of Telanga");
			br.newLine();
			br.write("--------------------------");
			br.newLine();
			br.write("Adilabad ");
			br.newLine();
			br.write("Bhadradri Kothagudem ");
			br.newLine();
			br.write("Hyderabad");
			br.newLine();
			br.write("Jagtial");
			br.newLine();
			br.write("Jangaon");
			br.newLine();
			br.write("Jayashankar Bhupalpally");
			br.newLine();
			br.write("Jogulamba Gadwal");
			br.newLine();
			br.write("Kamareddy");
			br.newLine();
			br.write("Karimnagar");
			br.newLine();
			br.write("Khammam");
			br.newLine();
			br.write("Kumuram Bheem");
			br.newLine();
			br.write("Mahabubabad");
			br.newLine();
			br.write("Mahabubnagar");
			br.newLine();
			br.write("Mancherial");
			br.newLine();
			br.write("Medak");
			br.newLine();
			br.write("Medchal");
			br.newLine();
			br.write("Nagarkurnool");
			br.newLine();
			br.write("Nalgonda");
			br.newLine();
			br.write("Nirmal");
			br.newLine();
			br.write("Nizamabad");
			br.newLine();
			br.write("Peddapalli");
			br.newLine();
			br.write("Rajanna Sircilla");
			br.newLine();
			br.write("Rangareddy");
			br.newLine();
			br.write("Sangareddy");
			br.newLine();
			br.write("Siddipet");
			br.newLine();
			br.write("Suryapet");
			br.newLine();
			br.write("Vikarabad");
			br.newLine();
			br.write("Wanaparthy");
			br.newLine();
			br.write("Warangal (Rural)");
			br.newLine();
			br.write("Warangal (Urban)");
			br.newLine();
			br.write("Yadadri Bhuvanagiri");
			br.newLine();
            br.flush();
            br.close();
		}
            catch(IOException e)
		{
            	System.out.println("IOExecption Occured");
		}
	}

}
