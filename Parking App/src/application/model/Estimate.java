package application.model;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

public class Estimate {
	public String finalEstimate() throws IOException {
		File file = new File("src/data/PermitSelection.txt");
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
		//double latest;
		
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
		
		String split[] = selection.split(",", 3);
		
		permType = split[0];
		permPeriod = split[1];
		
		String split1[] = daysHours.split(",", 10);
		
		numDays = Integer.valueOf(split1[0]);
		earliest = Double.valueOf(split1[1]);
		//latest = Double.valueOf(split1[2]);
		scanner1.close();
		scanner2.close();
		scanner3.close();
		for(int i = 0; i < numDays; i++) {
			days.add(split1[3+i]);
		}
		
		if(status == "student" && permPeriod == "yearly") {
			if(permType.equals("surface") && (earliest >= 16.5)) {
				return "The most cost efficient permit for your schedule and prefrences is the Twilight Permit."+"\n"+"It costs $82 per academic year and allows parking in Unmarked Commuter Student spaces from 4:30 pm – 6:00 am weekdays & all day weekends.";
			}
			else if(permType.equals("surface") && (earliest < 16.5)) {
				return "The most cost efficient permit for your schedule and prefrences is the Commuter Student Permit."+"\n"+"It costs $170 per academic year and allows parking in Unmarked Commuter Student spaces anytime and Employee B spaces from 4:30 pm – 6:00 am weekdays & all day weekends.";
			}
		}
		else if(status == "student" && permPeriod == "day" && permType == "surface") {
			return "The most cost efficient permit for your schedule and prefrences is the Commuter Single-Use Daily Parking Permit."+"\n"+"It cost $7 per each permit and allows parking in Unmarked Commuter Student spaces.";
		}
		else if(status == "student" && permPeriod == "hourly" && permType == "garage") {
			return "The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.";
		}
		else if(status == "student" && permPeriod == "hourly" && permType == "surface") {
			return "The most cost efficient permit for your schedule and prefrences is the Commuter Single-Use Daily Parking Permit."+"\n"+"It cost $7 per each permit and allows parking in Unmarked Commuter Student spaces.";
		}
		else if(status == "student" && permPeriod == "day" && permType == "garage") {
			return "The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.";
		}
		else if(status == "student" && permPeriod == "year" && permType == "garage") {
			if(earliest >= 16.5) {
				return "The most cost efficient parking for your schedule and prefrences is to get a Night Only Permit for either the Xiemnes, Baurle, Tobin, or Downtown Campus garages."+"\n"+"Each costs only $264 per academic year.";
			}
			else {
				return "The most cost efficient parking for your schedule and prefrences is to get a Garage Permit for either the Xiemnes, Baurle, Tobin, or Downtown Campus garages."+"\n"+"Each costs only $864 per academic year.";
			}
		}
		else if(status == "staff" && permPeriod == "day" && permType == "surface") {
			return "The most cost efficient parking for your schedule and prefrences is to buy the Employee A Single-Use Daily Parking."+"\n"+"It costs only $7 per permit and allows parking in Employee A or Employee B  spaces and Unmarked Commuter Student spaces.";
		}
		else if(status == "staff" && permPeriod == "day" && permType == "garage") {
			return "The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.";
		}
		else if(status == "staff" && permPeriod == "hourly" && permType == "surface") {
			return "The most cost efficient parking for your schedule and prefrences is to buy the Employee A Single-Use Daily Parking."+"\n"+"It costs only $7 per permit and allows parking in Employee A or Employee B  spaces and Unmarked Commuter Student spaces.";
		}
		else if(status == "staff" && permPeriod == "hourly" && permType == "garage") {
			return "The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.";
		}
		else if(status == "staff" && permPeriod == "yearly" && permType == "surface") {
			return "The most cost efficient parking for your schedule and prefrences is to get the Employee B parking."+"\n"+"It costs $203 and allows parking in Employee B spaces, Unmarked Commuter Student spaces, and Employee A spaces spaces from 4:30 pm – 6:00 am weekdays & all day weekends";
		}
		else if(status == "staff" && permPeriod == "yearly" && permType == "garage") {
			if(earliest >= 16.5) {
				return "The most cost efficient parking for your schedule and prefrences is to get a Employee Night Only Garage Permit."+"\n"+"It costs $268 and are available for the Ximenes, Baurle, and Tobin garages.";	
			}
			else {
				return "The most cost efficient parking for your schedule and prefrences is to get an Employee Garage Permit."+"\n"+"It costs $858 and are available for the Ximenes, Baurle, and Tobin garages.";
			}
		}
		else if(status == "guest" && permType == "garage") {
			return "The most cost efficient parking for your schedule and prefrences is to park in either the Xiemnes, Baurle, Tobin, or Downtown Campus garages for only $2.50 per hour.";
		}
		else if(status == "guest" && permType == "day") {
			return "The most cost efficient permit for your schedule and prefrences is the Commuter Single-Use Daily Parking Permit."+"\n"+"It cost $7 per each permit and allows parking in Unmarked Commuter Student spaces.";
		}
		
		return "The most cost efficient permit for your schedule and prefrences is the Commuter Student Permit."+"\n"+"It costs $170 per academic year and allows parking in Unmarked Commuter Student spaces anytime and Employee B spaces from 4:30 pm – 6:00 am weekdays & all day weekends.";
		
	}
}