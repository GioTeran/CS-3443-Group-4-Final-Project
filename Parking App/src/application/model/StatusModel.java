//model for Status.FXML file
package application.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StatusModel {
	/*
         * Name: saveStatus
         * Description: saves the user's status to Status.txt file
   	 * Parameters: status (String)
   	 * returns: nothing
       */
	public void saveStatus(String status) throws IOException {
		File file = new File("src/data/Status.txt");
		FileWriter myWriter = new FileWriter(file , true);
		
		myWriter.write(status + "\n");
		
		myWriter.close();
	}
}
