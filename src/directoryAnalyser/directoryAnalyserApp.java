package directoryAnalyser;

import java.io.File;
import java.util.Scanner;

public class directoryAnalyserApp {
	public static void main(String[] args) {
		
		System.out.println("----------DIRECTORY ANALYSER----------");
		System.out.println("Enter the directory path: ");
		
		Scanner directoryPath = new Scanner(System.in);
		String stringDirectoryPath = directoryPath.next();
		
		directoryPath.close();
		
		File file = new File(stringDirectoryPath);
		
		if(file.exists()) {
			System.out.println("Directory exists, below i list its content: ");
			String[] content = file.list();
			for(int i = 0; i < content.length; i++) {
				File file2 = new File(stringDirectoryPath+"/",content[i]);
				if (file2.isDirectory()) {
					System.out.println(content[i]+"+");
					String[] content2 = file2.list();
					for (int j = 0; j < content2.length; j++) {
						System.out.println(content2[j]);
					}
				} else {
					System.out.println(content[i]);
				}
			}
		}else {
			System.out.println("Incorrect directory path.");
		}
	}
}
