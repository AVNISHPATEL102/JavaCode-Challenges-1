import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class SecondLargest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputStream = null;
		try {
			inputStream = new Scanner( new FileInputStream("/Users/mr.a/Desktop/eclipse/Codechef/src/stuff.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File stuff .txt was not found");
			System.exit(0);
		}
		
		int t = inputStream.nextInt();
		for(int j =0 ; j<t;j++)
		{
		
			int s[] = new int[3];
			for(int i = 0 ; i<3;i++)
			{
				s[i] = inputStream.nextInt();
			}
			Arrays.sort(s);
			System.out.println(s[1]);
		}
	}
}