package application.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class SelectionModel {
	public void saveSelection(String type, String period) throws IOException {
		File file = new File("src/data/permitSelection.txt");
		FileWriter myWriter = new FileWriter(file , true);
		Random rand = new Random();
		int low = 100;
		int high = 1000;
		int parkingNum = rand.nextInt(high - low) + low;
		Scanner scanner = new Scanner(file);
		
		boolean repeat = false;
		
		if(scanner.hasNextLine() && scanner.hasNextInt()) {
			while (scanner.hasNextLine()) {
				int temp;
				
				temp = scanner.nextInt();
				
				if( temp == parkingNum) {
					parkingNum += (rand.nextInt(high-low) + low) % 1000;
				}
				
			}
		}
		myWriter.write(type + ", " + period + ", " + parkingNum + "\n");
		
		myWriter.close();
	}
}
