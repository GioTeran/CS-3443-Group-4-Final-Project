package application.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Estimate {
	public void finalEstimate(TextArea textfield, ListView<String> list) throws IOException {
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
		
		System.out.println(status+" "+permPeriod+ " " +permType+"\n" + (status.equals("student") && permPeriod.equals("year") && permType.equals("garage")));
		
		if(status.equals("student") && permPeriod.equals("year")) {
			if(permType.equals("surface") && (earliest >= 16.5)) {
				textfield.setText("The most cost efficient permit for your schedule and prefrences is the Twilight Permit. It costs $82 per academic year and allows parking in Unmarked Commuter Student spaces from 4:30 pm – 6:00 am weekdays & all day weekends.");
				list.getItems().add("Commuter Student - $170\nAllows parking in Unmarked Commuter Student spaces anytime and Employee B spaces from 4:30 pm – 6:00 am\n"
				+ "on weekdays & all day weekends.");
				return;
			}
			else if(permType.equals("surface") && (earliest < 16.5)) {
				textfield.setText("The most cost efficient permit for your schedule and prefrences is the Commuter Student Permit. It costs $170 per academic year and allows parking in Unmarked Commuter Student spaces anytime and Employee B spaces from 4:30 pm – 6:00 am weekdays & all day weekends.");
				list.getItems().add("Twilight - $82\nAllows parking in Unmarked Commuter Student spaces from 4:30 pm – 6:00 am on weekdays & all day weekends.");
				return;
			}
		}
		if(status.equals("student") && permPeriod.equals("day") && permType.equals("surface")) {
			textfield.setText("The most cost efficient permit for your schedule and prefrences is the Commuter Single-Use Daily Parking Permit. It cost $7 per each permit and allows parking in Unmarked Commuter Student spaces.");
			return;
		}
		if(status.equals("student") && permPeriod.equals("hourly") && permType.equals("garage")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.");
			return;
		}
		if(status.equals("student") && permPeriod.equals("hourly") && permType.equals("surface")) {
			textfield.setText("The most cost efficient permit for your schedule and prefrences is the Commuter Single-Use Daily Parking Permit. It cost $7 per each permit and allows parking in Unmarked Commuter Student spaces.");
			return;
		}
		if(status.equals("student") && permPeriod.equals("day") && permType.equals("garage")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.");
			return;
		}
		if(status.equals("student") && permPeriod.equals("year") && permType.equals("garage")) {
			System.out.println("IM HERE");
			if(earliest >= 16.5) {
				textfield.setText("The most cost efficient parking for your schedule and prefrences is to get a Night Only Permit for either the Xiemnes, Baurle, Tobin, or Downtown Campus garages. Each costs only $264 per academic year.");
				list.getItems().add("Student Ximenes Avenue Garage (XAG) - $846\nAllows parking in the Ximenes Avenue Garage and Downtown Campus Garage anytime,\n"
						+ "Unmarked Commuter Student spaces anytime, and Employee B spaces from 4:30 pm – 6:00 am weekdays & all day weekends.");
				list.getItems().add("Student Tobin Avenue Garage (TAG) - $846\nAllows parking in the Tobin Avenue Garage and Downtown Campus Garage anytime,\n"
						+ "Unmarked Commuter Student spaces anytime, and Employee B spaces from 4:30 pm – 6:00 am weekdays & all day weekends.");
				list.getItems().add("Student Bauerle Road Garage (BRG) - $846\nAllows parking in the Bauerlr Road Garage and Downtown Campus Garage anytime,\n"
						+ "Unmarked Commuter Student spaces anytime, and Employee B spaces from 4:30 pm – 6:00 am weekdays & all day weekends.");
				return;
			}
			else {
				textfield.setText("The most cost efficient parking for your schedule and prefrences is to get a Garage Permit for either the Xiemnes, Baurle, Tobin, or Downtown Campus garages. Each costs only $864 per academic year.");
				list.getItems().add("Ximenes Avenue Garage (XAG) – Night Only - $264\nAllows parking in the Ximenes Avenue Garage and Downtown Campus Garage from 4:30 pm – 6:00 am weekdays & all day weekends.");
				list.getItems().add("Tobin Avenue Garage (TAG) – Night Only – Night Only - $264\nAllows parking in the Tobin Avenue Garage and Downtown Campus Garage from 4:30 pm – 6:00 am weekdays & all day weekends.");
				list.getItems().add("Bauerle Road Garage (BRG) – Night Only – Night Only - $264\nAllows parking in the Bauerle Road Garage and Downtown Campus Garage from 4:30 pm – 6:00 am weekdays & all day weekends.");
				return;
			}
		}
		if(status.equals("staff") && permPeriod.equals("day") && permType.equals("surface")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to buy the Employee A Single-Use Daily Parking. It costs only $7 per permit and allows parking in Employee A or Employee B  spaces and Unmarked Commuter Student spaces.");
			return;
		}
		if(status.equals("staff") && permPeriod.equals("day") && permType.equals("garage")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.");
			return;
		}
		if(status.equals("staff") && permPeriod.equals("hourly") && permType.equals("surface")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to buy the Employee A Single-Use Daily Parking. It costs only $7 per permit and allows parking in Employee A or Employee B  spaces and Unmarked Commuter Student spaces.");
		}
		if(status.equals("staff") && permPeriod.equals("hourly") && permType.equals("garage")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.");
			return;
		}
		if(status.equals("staff") && permPeriod.equals("year") && permType.equals("surface")) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to get the Employee B parking. It costs $203 and allows parking in Employee B spaces, Unmarked Commuter Student spaces, and Employee A spaces spaces from 4:30 pm – 6:00 am weekdays & all day weekends");
			list.getItems().add("Employee A - $378\nAllows parking in Employee A and Employee B spaces and Unmarked Commuter Student spaces.");
			list.getItems().add("Employee Reserved - $723\nAllows parking in Reserved spaces,Employee A, Employee B, and unmarked Commuter Student spaces.");
			return;
		}
		if(status.equals("staff") && permPeriod.equals("year") && permType.equals("garage")) {
			if(earliest >= 16.5) {
				textfield.setText("The most cost efficient parking for your schedule and prefrences is to get a Employee Night Only Garage Permit. It costs $268 and are available for the Ximenes, Baurle, and Tobin garages.");	
				list.getItems().add("Employee Ximenes Avenue Garage (XAG) - $858\nAllows parking in the Ximenes Avenue Garage and Downtown Campus Garage,\n"
						+ "Employee A, Employee B, unmarked Commuter Student spaces, and Reserved spaces in Resident Lot 2, Resident Lot 5, Business\n"
						+ "Services Annex Lot, Center for Archeological Research Lot, Central Receiving Warehouse Lot, and the Science Research\n"
						+ "Laboratories Lot.");
				list.getItems().add("Employee Tobin Avenue Garage (XAG) - $858\nAllows parking in the Tobin Avenue Garage and Downtown Campus Garage,\n"
						+ "Employee A, Employee B, unmarked Commuter Student spaces, and Reserved spaces in Resident Lot 2, Resident Lot 5, Business\n"
						+ "Services Annex Lot, Center for Archeological Research Lot, Central Receiving Warehouse Lot, and the Science Research\n"
						+ "Laboratories Lot.");
				list.getItems().add("Employee Bauerle Road Garage (XAG) - $858\nAllows parking in the Bauerle Road Garage and Downtown Campus Garage,\n"
						+ "Employee A, Employee B, unmarked Commuter Student spaces, and Reserved spaces in Resident Lot 2, Resident Lot 5, Business\n"
						+ "Services Annex Lot, Center for Archeological Research Lot, Central Receiving Warehouse Lot, and the Science Research\n"
						+ "Laboratories Lot.");
				return;
			}
			else {
				textfield.setText("The most cost efficient parking for your schedule and prefrences is to get an Employee Garage Permit. It costs $858 and are available for the Ximenes, Baurle, and Tobin garages.");
				list.getItems().add("Employee Ximenes Avenue Garage (XAG) – Night Only - $268\nAllows parinking in Ximenes Avenue Garage and Downtown Campus Garage from 4:30pm-6:00am weekdays and all day weekends.");
				list.getItems().add("Employee Tobin Avenue Garage (XAG) – Night Only - $268\nAllows parinking in Tobin Avenue Garage and Downtown Campus Garage from 4:30pm-6:00am weekdays and all day weekends.");
				list.getItems().add("Employee Ximenes Avenue Garage (XAG) – Night Only - $268\nAllows parinking in Bauerle Road Garage and Downtown Campus Garage from 4:30pm-6:00am weekdays and all day weekends.");
				return;
			}
		}
		if(status.equals("guest") && (permType.equals("garage") || permType.equals("hourly"))) {
			textfield.setText("The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.");
			return;
		}
		if(status.equals("guest") && permType.equals("day")) {
			textfield.setText("The most cost efficient permit for your schedule and prefrences is the Commuter Single-Use Daily Parking Permit. It cost $7 per each permit and allows parking in Unmarked Commuter Student spaces.");
			return;
		}
		
		scanner1.close();
		scanner2.close();
		scanner3.close();
		
	}
}
