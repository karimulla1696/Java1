import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOperation {

	public static void main(String[] args) {
		try {
			FileWriter fr=new FileWriter("F://java2/second.txt");
			BufferedWriter br=new BufferedWriter(fr);
			br.write("Districts Of Telanga");
			br.newLine();
			br.write("--------------------------");
			br.newLine();
			String s[]= {"\r\n" + 
					"Telangana Districts (31)\r\n" + 
					"Adilabad\r\n" + 
					"Bhadradri Kothagudem\r\n" + 
					"Hyderabad\r\n" + 
					"Jagtial\r\n" + 
					"Jangaon\r\n" + 
					"Jayashankar Bhupalpally\r\n" + 
					"Jogulamba Gadwal\r\n" + 
					"Kamareddy\r\n" + 
					"Karimnagar\r\n" + 
					"Khammam\r\n" + 
					"Kumuram Bheem\r\n" + 
					"Mahabubabad\r\n" + 
					"Mahabubnagar\r\n" + 
					"Mancherial\r\n" + 
					"Medak\r\n" + 
					"Medchal\r\n" + 
					"Nagarkurnool\r\n" + 
					"Nalgonda\r\n" + 
					"Nirmal\r\n" + 
					"Nizamabad\r\n" + 
					"Peddapalli\r\n" + 
					"Rajanna Sircilla\r\n" + 
					"Rangareddy\r\n" + 
					"Sangareddy\r\n" + 
					"Siddipet\r\n" + 
					"Suryapet\r\n" + 
					"Vikarabad\r\n" + 
					"Wanaparthy\r\n" + 
					"Warangal (Rural)\r\n" + 
					"Warangal (Urban)\r\n" + 
					"Yadadri Bhuvanagiri"};
			for (int i = 0; i < s.length; i++) {
				br.write(s[i]);
				br.flush();
		}
	     br.close();
	     fr.close();
	

	}
		catch(IOException e)
		{
			System.out.println("Exception Occured");
		}

}
}