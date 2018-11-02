import java.io.*;

public class Print {

	public static void main(String[] args) {

		try {
			File file = new File(args[0]);

			BufferedReader br = new BufferedReader(new FileReader(file));

			String st;
			while((st = br.readLine()) != null)
				System.out.println(st);
		}
		catch (FileNotFoundException e) {
			System.out.println("No file");
		}
		catch (IOException e) {
			System.out.println("IO error");
		}
	}
}
