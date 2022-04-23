package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Estimate {
	public String finalEstimate() throws IOException {
		File file = new File("src/data/permitSelection.txt");
		File file2 = new File("src/data/Status.txt");
		File file3 = new File("src/data/DaysHours.txt");
		
		Scanner scanner1 = new Scanner(file);
		Scanner scanner2 = new Scanner(file2);
		Scanner scanner3 = new Scanner(file3);
		
		String status;
		String selection = "";
		String daysHours = "";
		String permType = "";
		String permPeriod = "";
		
		while(scanner1.hasNextLine()) {
			selection = scanner1.nextLine();
		}
		
		while(scanner2.hasNextLine()) {
			status = scanner2.nextLine();
		}
		
		while(scanner3.hasNextLine()) {
			daysHours = scanner3.nextLine();
		}
		
		String split[] = selection.split(",", 3);
		
		permType = split[0];
		permPeriod = split[1];
		
		String split1[] = daysHours.split(",", 10);
	}
}
