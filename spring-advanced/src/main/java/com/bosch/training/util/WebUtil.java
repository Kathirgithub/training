package com.bosch.training.util;

import java.util.HashMap;
import java.util.Map;

public class WebUtil {

	public static String getDayOfWeek(int dayOfWeekNbr) {
		Map<Integer, String> days = new HashMap<>();
		days.put(1, "Sunday");
		days.put(2, "Monday");
		days.put(3, "Tuesday");		
		days.put(4, "Wednesday");
		days.put(5, "Thursday");
		days.put(6, "Friday");
		days.put(7, "Saturday");
		
		return days.get(dayOfWeekNbr);
	}
}
