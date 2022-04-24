package application.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DaysHours {
	public double toMilitaryTime(String time) {
		int len = time.length();
		double min = 0;
		double hour = 0;
		double military = 0;
		String minStr = "";
		String hourStr = "";
		
		//conversion for pm times
		
		if(time.charAt(len-2) == 'p' || time.charAt(len - 2) == 'P') {
			if(len == 6) {
				hourStr = time.substring(0,1);
				hour = Double.valueOf(hourStr);
				
				minStr = time.substring(2,4);
				min = Double.valueOf(minStr);
				
				if(min == 0) {
					military = 12 + hour;
					return military;
				}
				else {
					min = min/60;
					military = 12 + hour + min;
					return military;
				}
				
				
			}
			else if(len == 7) {
				hourStr = time.substring(0,2);
				hour = Double.valueOf(hourStr);
				
				minStr = time.substring(3,5);
				min = Double.valueOf(minStr);
				
				if(min == 0) {
					military = 12 + hour;
					return military;
				}
				
				else {
					min = min/60;
					military = 12 + hour + min;
					return military;
				}
			}
		}
		
		else if (time.charAt(len-2) == 'a' || time.charAt(len - 2) == 'A') {
			if(len == 6) {
				
				hourStr = time.substring(0,1);
				hour = Double.valueOf(hourStr);
				
				minStr = time.substring(2,4);
				min = Double.valueOf(minStr);
				
				if(min == 0) {
					military = hour;
					return military;
				}
				
				else {
					min = min/60;
					military = hour + min;
					return military;
				}
			}
			
			else if(len == 7) {
				hourStr = time.substring(0,2);
				hour = Double.valueOf(hourStr);
				
				minStr = time.substring(3,5);
				min = Double.valueOf(minStr);
				
				if(min == 0) {
					military = hour;
					return military;
				}
				
				else {
					min = min/60;
					military = hour + min;
					return military;
				} 
			}
		}
		
		return -1;
	}
	
	public void saveDaysInfo(ArrayList<String> days, ArrayList<Double> startTimes, ArrayList<Double>endTimes) throws IOException {
		
		int total = startTimes.size();
		double earliest = startTimes.get(0);
		double latest = endTimes.get(0);
		

		int i = 0;
		File file = new File("src/data/DaysHours.txt");
		try (FileWriter myWriter = new FileWriter(file , true)) {
			String allDays = "";
			
			for(i = 0; i < total; i++) {
				if(startTimes.get(i) < earliest) {
					earliest = startTimes.get(i);
				}
				if(endTimes.get(i) > latest) {
					latest = endTimes.get(i);
				}
			}
			
			for( i = 0; i < total - 1; i ++) {
				allDays += days.get(i) + ",";
			}
			
			allDays += days.get(total - 1);
			
			myWriter.write(total + "," + earliest + "," + latest + "," + allDays + "\n");
			
			myWriter.close();
		}
	}
}