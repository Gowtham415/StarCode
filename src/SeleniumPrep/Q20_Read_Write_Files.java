package SeleniumPrep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q20_Read_Write_Files {
	static String readFilePath = System.getProperty("user.dir") + "\\Files\\Read.txt";
	static String WriteFilePath = System.getProperty("user.dir") + "\\Files\\Write.txt";

	public static void main(String[] args) {
		readFile(readFilePath);
		writeFile(WriteFilePath);
		readFile(WriteFilePath);
	}

	static void readFile(String filePath) {
		String line = null;
		try (BufferedReader bis = new BufferedReader(new FileReader(new File(filePath)))) {
			while ((line = bis.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void writeFile(String filePath) {
		try (BufferedWriter bos = new BufferedWriter(new FileWriter(new File(filePath), true))) {
			String str = "I am a software Developer";
			bos.write(str + "\n");
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
