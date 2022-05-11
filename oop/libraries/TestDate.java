/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.libraries;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CC-Student
 */
public class TestDate {

    public static void main(String[] args) {
        // Date    -   Calendar 
        Date todayDate = new Date();
        System.out.println(todayDate);   // override toString()
        // custom date   :   14/jan/2021  ;  year = 2021 - 1900 ;  month start from 0     
        Date customDate = new Date(121, 0, 14);
        System.out.println(customDate);
        System.out.println(todayDate.getMonth());
        //  todayDate.setMonth(2);
        System.out.println(todayDate);
        System.out.println(todayDate.after(customDate));
        System.out.println("--------------- Date Format ----------------");
        // 20/01/2022  : date format
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // dd/MMM/yyyy MMM MMMM
        // Convert from Date to String   -    sdf.format(todayDate)  كيفية التحويل من تاريخ الى نص
        System.out.println("-----  Convert from Date to String  ---");
        String s = sdf.format(todayDate);
        System.out.println("today formatted = " + s);

        // Convert From String to Date   -   17/05/2020
        System.out.println("------  Convert From String to Date   ----");
        String strDate = "17/05/2020";
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date newDate = sdf2.parse(strDate);

            System.out.println(newDate);

        } catch (ParseException ex) {
            Logger.getLogger(TestDate.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("+++++++++++++++ Calendar  class +++++++++++++++++++++++");

        GregorianCalendar gcToday = new GregorianCalendar();
        System.out.println(gcToday); /// print all data about today
        // Convert from Calendar to Date
        System.out.println("------ Convert from Calendar todate ---- ");

        System.out.println("Calendar today = " + gcToday.getTime());

        // Custom calendar   21/Jan/2020
        GregorianCalendar gcCustom = new GregorianCalendar(2020, 0, 21);
        System.out.println("custom alendar = " + gcCustom.getTime());

          /// today Calendar with format  SimpleDateFormat > Date 12/01/2020  
        // 1- Convert from Calendar to Date using getTime()
        // 2 use simpleDateformat object with format method 
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("today calendar formatteed = " + sdf3.format(gcToday.getTime()));

        // get Calendar
        System.out.println("year = " + gcToday.get(Calendar.YEAR));
        System.out.println("month = " + gcToday.get(Calendar.MONTH));

        System.out.println("Day = " + gcToday.get(Calendar.DAY_OF_MONTH));
        System.out.println("month = " + gcToday.get(Calendar.DAY_OF_WEEK));

        System.out.println("++++ add 3 months to calendar ++");
        gcToday.add(Calendar.MONTH, 3);
        System.out.println(gcToday.getTime());
        SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyy");
        System.out.println(sdf4.format(gcToday.getTime()));

          //task: Create object as a Date class with custom date = 17-April-1998 
        // add 3 years to this custom date then print it with foramtt  17-3-2001
                // topics - problems
        //  arraylist + generics : using for i loop + for each loop 
        //  methods :  parameters - return 
        // oop project 
        gcToday.setTime(new Date()); // reset gcToday to today date
        if (gcToday.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
            System.out.println("This is Tuesday");
        } else {
            System.out.println("It is not tuesday");
        }

      // big example : create a method
        // Find the date after 12 business days from a custom date
        // result = 10-2-2022
        int numberDays = 12;
        Date myDate = new Date();
        Date requiredDate = calcBusinessDays(myDate, numberDays);
        System.out.println("After Business days = " + requiredDate);

    } // end main

    public static Date calcBusinessDays(Date d, int businessDays) {
        // 1- Convert from Date to Calendar
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(d);

        for (int i = 0; i < businessDays; i++) {
            if (gc.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                gc.add(Calendar.DAY_OF_MONTH, 3);
            } else {
                gc.add(Calendar.DAY_OF_MONTH, 1);
            }
        }

        return gc.getTime();
    }

}
