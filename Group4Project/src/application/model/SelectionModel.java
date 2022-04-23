package application.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SelectionModel {
	public void saveSelection(String type, String period) throws IOException {
		File file = new File("src/data/permitSelection.txt");
		FileWriter myWriter = new FileWriter(file , true);
		
		myWriter.write(type + ", " + period + "\n");
		
		myWriter.close();
	}
}
