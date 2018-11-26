import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pledge {

	public static void main(String[] args) {
		try
		{
			FileWriter fileWriter=new FileWriter("F://java2/first1.txt");
			BufferedWriter bufferWriter=new BufferedWriter(fileWriter);
			bufferWriter.write("Indian Pledge");
			bufferWriter.newLine();
			bufferWriter.write("--------------------------");
			bufferWriter.newLine();
			bufferWriter.write("India is my country and all Indians are my brothers and sisters.");
			bufferWriter.newLine();
			bufferWriter.write("I love my country and I am proud of its rich and varied heritage. ");
			bufferWriter.newLine();
			bufferWriter.write("I shall always strive to be worthy of it.");
			bufferWriter.newLine();
			bufferWriter.write("I shall give my parents, teachers and all elders respect and treat everyone with courtesy.");
			bufferWriter.newLine();
			bufferWriter.write("To my country and my people, I pledge my devotion.");
			bufferWriter.newLine();
			bufferWriter.write("In their well-being and prosperity alone, lies my happiness.");
			bufferWriter.newLine();
			bufferWriter.flush();
			bufferWriter.close();
		}
            catch(IOException e)
		{
            	System.out.println("IOExecption Occured");
		}
		try
		{
			FileReader fileReader=new FileReader("F://java2/first1.txt");
			BufferedReader bufferReader=new BufferedReader(fileReader);
			String s;
			while((s=bufferReader.readLine())!=null)
			{
				System.out.println(s);
			}
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
