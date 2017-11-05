package com.cluster;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class TimeZoneDemo7 {
	public static void main(String[] args) {
		
       Date date = new Date();
    
        // get the default time zone
     /*  TimeZone tz = TimeZone.getDefault();
        System.out.println("TimeZone details - " + tz);
        DateFormat formatter1 = new SimpleDateFormat("MMM dd HH:mm:ss zzz");
        
        // set the timezone to DateFormat and then format
        formatter1.setTimeZone(tz);
        String strDate1 = formatter1.format(date);
        
        System.out.println("Local time :- " + strDate1);
        System.out.println("Display name of default timezone :- " + tz.getDisplayName());
         
        System.out.println();
        System.out.println();*/
       
        
        //formatting the date and display according to various timezones. 
      String[] timeZoneIds = TimeZone.getAvailableIDs();
        System.out.println("No. of timezone ids :- " + timeZoneIds.length);
        System.out.println("-----------------------------------------");
       
        for (int i=0; i<timeZoneIds.length; i++) {
        	
        	TimeZone otherTimeZone = TimeZone.getTimeZone(timeZoneIds[i]);
        	System.out.print(timeZoneIds[i] + "         ");
            DateFormat formatter2 = new SimpleDateFormat("MMM dd HH:mm:ss zzz");
            formatter2.setTimeZone(otherTimeZone);
            String strDate2 = formatter2.format(date);
            System.out.print(strDate2 + "        ");
            System.out.println(otherTimeZone.getDisplayName());
       } 
	}

}
