package com.example.dell.application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTools {

	public static String toDateTime(long timestamp) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date(timestamp);
		return simpleDateFormat.format(date);
	}
}
