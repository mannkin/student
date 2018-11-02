import java.io.*;

public class PrintFile {

	public static void main(String[] args) {

		try {
			File file = new File(args[0]);

			BufferedReader br = new BufferedReader(new FileReader(file));

			String st;
			int count = 1;
			while((st = br.readLine()) != null) {
				System.out.print(count + " ");
				System.out.println(st);
				count++;
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("No file");
		}
		catch (IOException e) {
			System.out.println("IO error");
		}
	}
}
