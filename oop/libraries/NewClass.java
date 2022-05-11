/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.oop.libraries;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author CC-Student
 */
public class NewClass {
    public static void main(String[] args) {
        
        /*
        System.out.println("----------------------------------------------");
        
            Date todayDate = new Date ();
            System.out.println(todayDate.getDate());
            //todayDate.setMonth(5);
            //System.out.println("Set : "+todayDate.getMonth());
            System.out.println("Before : "+todayDate.before(todayDate));
            System.out.println("after : "+todayDate.after(todayDate));
            System.out.println("epqals : "+todayDate.equals(todayDate));
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Date to String : "+sdf.format(todayDate));
            
            String strDate = "17/05/2020";
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");
        try {
            Date newDate = sdf1.parse(strDate);
            System.out.println("String to Date : "+newDate);
        } catch (ParseException ex) {
            Logger.getLogger(TestDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.println(". . . "+sdf2.format());
        
        GregorianCalendar greDate = new GregorianCalendar();
        System.out.println("GregorianCalendar : "+greDate);
        System.out.println("Gre.getTime : "+greDate.getTime());
        
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Gre_Format : "+sdf3.format(greDate.getTime()));
        
        GregorianCalendar grDate1 = new GregorianCalendar(2022, 2, 16);
        System.out.println("user Constract : "+sdf3.format(grDate1.getTime()));
        
        System.out.println("Year : "+greDate.get(Calendar.YEAR));
        System.out.println("Month : "+greDate.get(Calendar.MONTH));
        System.out.println("Day of Month : "+greDate.get(Calendar.DAY_OF_MONTH));
        System.out.println("Week of Month : "+greDate.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Day of Week : "+greDate.get(Calendar.DAY_OF_WEEK));
        System.out.println("Minute : "+greDate.get(Calendar.MINUTE));
        System.out.println("Second : "+greDate.get(Calendar.SECOND));

        greDate.add(Calendar.YEAR, 5);
        System.out.println("Add Method : "+sdf3.format(greDate.getTime()));
        */
        
        System.out.println("---------------------------------------------");
        
        Date tDate = new Date(98, 3, 17);
        System.out.println("Date object : "+tDate);
        
        System.out.println("--------");
                
        GregorianCalendar tgr = new GregorianCalendar();
            tgr.setTime(tDate); // convert from Date [tDate] to Calendar tgr
        tgr.add(Calendar.YEAR, 3);
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
        System.out.println("Calendar object : "+sdf.format(tgr.getTime()));
        
        
        
    }
    
}
