import java.io.*;

public class CopyFile {

	public static void main(String[] args) {

		try {
			File in = new File(args[0]);
			File out = new File(args[1]);

			BufferedReader br = new BufferedReader(new FileReader(in));
			BufferedWriter bw = new BufferedWriter(new FileWriter(out));

			String st;
			while((st = br.readLine()) != null) {
				System.out.println(st);
				bw.write(st);
				bw.newLine();	
			}

			br.close();
			bw.close();
		}	
		catch (FileNotFoundException e) {
			System.out.println("No files");
		}
		catch (IOException e) {
			System.out.println("IO error");
		}
	}
}
