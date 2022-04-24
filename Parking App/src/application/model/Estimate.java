package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Estimate {
	public void finalEstimate(TextArea textfield) throws IOException {
		File file = new File("src/data/permitSelection.txt");
		File file2 = new File("src/data/Status.txt");
		File file3 = new File("src/data/DaysHours.txt");
		
		Scanner scanner1 = new Scanner(file);
		Scanner scanner2 = new Scanner(file2);
		Scanner scanner3 = new Scanner(file3);
		
		String status = "";
		String selection = "";
		String daysHours = "";
		String permType = "";
		String permPeriod = "";
		
		double earliest;
		double latest;
		
		int numDays;
		
		ArrayList<String> days = new ArrayList<>();
		
		while(scanner1.hasNextLine()) {
			selection = scanner1.nextLine();
		}
		
		while(scanner2.hasNextLine()) {
			status = scanner2.nextLine();
		}
		
		while(scanner3.hasNextLine()) {
			daysHours = scanner3.nextLine();
		}
		
		String split[] = selection.split(", ", 3);
		
		permType = split[0];
		permPeriod = split[1];
		
		String split1[] = daysHours.split(",", 10);
		
		numDays = Integer.valueOf(split1[0]);
		earliest = Double.valueOf(split1[1]);
		latest = Double.valueOf(split1[2]);
		
		for(int i = 0; i < numDays; i++) {
			days.add(split1[3+i]);
		}
		
		
		
		if(status.equals("student") && permPeriod.equals("year")) {
			System.out.println("IM IN");
			if(permType.equals("surface") && (earliest >= 16.5)) {
				textfield.setText("The most cost efficient permit for your schedule and prefrences is the Twilight Permit. It costs $82 per academic year and allows parking in Unmarked Commuter Student spaces from 4:30 pm – 6:00 am weekdays & all day weekends.");
				return;
			}
			else if(permType.equals("surface") && (earliest < 16.5)) {
				textfield.setText("The most cost efficient permit for your schedule and prefrences is the Commuter Student Permit. It costs $170 per academic year and allows parking in Unmarked Commuter Student spaces anytime and Employee B spaces from 4:30 pm – 6:00 am weekdays & all day weekends.");
				return;
			}
		}
		else if(status.equals("student") && permPeriod.equals("day") && permType.equals("surface")) {
			textfield.setText("The most cost efficient permit for your schedule and prefrences is the Commuter Single-Use Daily Parking Permit. It cost $7 per each permit and allows parking in Unmarked Commuter Student spaces.");
			return;
		}
		else if(status.equals("student") && permPeriod.equals("hourly") && permType.equals("garage")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.");
			return;
		}
		else if(status.equals("student") && permPeriod.equals("hourly") && permType.equals("surface")) {
			textfield.setText("The most cost efficient permit for your schedule and prefrences is the Commuter Single-Use Daily Parking Permit. It cost $7 per each permit and allows parking in Unmarked Commuter Student spaces.");
			return;
		}
		else if(status.equals("student") && permPeriod.equals("day") && permType.equals("garage")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.");
			return;
		}
		else if(status.equals("student") && permPeriod.equals("year") && permType.equals("garage")) {
			if(earliest >= 16.5) {
				textfield.setText("The most cost efficient parking for your schedule and prefrences is to get a Night Only Permit for either the Xiemnes, Baurle, Tobin, or Downtown Campus garages. Each costs only $264 per academic year.");
				return;
			}
			else {
				textfield.setText("The most cost efficient parking for your schedule and prefrences is to get a Garage Permit for either the Xiemnes, Baurle, Tobin, or Downtown Campus garages. Each costs only $864 per academic year.");
				return;
			}
		}
		else if(status.equals("staff") && permPeriod.equals("day") && permType.equals("surface")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to buy the Employee A Single-Use Daily Parking. It costs only $7 per permit and allows parking in Employee A or Employee B  spaces and Unmarked Commuter Student spaces.");
			return;
		}
		else if(status.equals("staff") && permPeriod.equals("day") && permType.equals("garage")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.");
			return;
		}
		else if(status.equals("staff") && permPeriod.equals("hourly") && permType.equals("surface")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to buy the Employee A Single-Use Daily Parking. It costs only $7 per permit and allows parking in Employee A or Employee B  spaces and Unmarked Commuter Student spaces.");
		}
		else if(status.equals("staff") && permPeriod.equals("hourly") && permType.equals("garage")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.");
			return;
		}
		else if(status.equals("staff") && permPeriod.equals("yearly") && permType.equals("surface")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to get the Employee B parking. It costs $203 and allows parking in Employee B spaces, Unmarked Commuter Student spaces, and Employee A spaces spaces from 4:30 pm – 6:00 am weekdays & all day weekends");
			return;
		}
		else if(status.equals("staff") && permPeriod.equals("yearly") && permType.equals("garage")) {
			if(earliest >= 16.5) {
				textfield.setText("The most cost efficient parking for your schedule and prefrences is to get a Employee Night Only Garage Permit. It costs $268 and are available for the Ximenes, Baurle, and Tobin garages.");	
				return;
			}
			else {
				textfield.setText("The most cost efficient parking for your schedule and prefrences is to get an Employee Garage Permit. It costs $858 and are available for the Ximenes, Baurle, and Tobin garages.");
				return;
			}
		}
		else if(status.equals("guest") && permType.equals("garage")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.");
			return;
		}
		else if(status.equals("guest") && permType .equals("day")) {
			textfield.setText("The most cost efficient permit for your schedule and prefrences is the Commuter Single-Use Daily Parking Permit. It cost $7 per each permit and allows parking in Unmarked Commuter Student spaces.");
			return;
		}
		
		scanner1.close();
		scanner2.close();
		scanner3.close();
		
	}
}
