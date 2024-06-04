package util;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CommonUtil {
	/**
	 * StringをLocalDateに変換
	 * @param str
	 * @return
	 */
	public static LocalDate convStrToLocalDate(String str) {
		return LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

	public static int convStrToInt(String str) {
		return Integer.parseInt(str);
	}

	public static Date convLocalDateToSqlDate(LocalDate date) {
		return Date.valueOf(date);
	}

	public static LocalDate convSqlDateToLocalDate(Date date) {
		return date.toLocalDate();
	}

	public static String formatPriority(int i) {
		String p = "";
		switch (i) {
			case 1:
				p = "低";
				break;
			case 2:
				p = "中";
				break;
			case 3:
				p = "高";
				break;
		}
		return p;
	}
	
	public static String formatLimitDate(LocalDate date){
		return date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
	}
}
