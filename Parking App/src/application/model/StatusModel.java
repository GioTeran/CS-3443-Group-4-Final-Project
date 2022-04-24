package application.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StatusModel {
	public void saveStatus(String status) throws IOException {
		File file = new File("src/data/Status.txt");
		FileWriter myWriter = new FileWriter(file , true);
		
		myWriter.write(status + "\n");
		
		myWriter.close();
	}
}