/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.first.nested.classes.and.enums;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.joda.time.DateTime;
import org.joda.time.Days;


/**
 *
 * @author stasy
 */

public class CustomeDate {
    public int day, month, year;
    public CustomeDate(){
    }
    
    public CustomeDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        
    }
    
    public DayOfWeek getDayOfWeek(){
        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        return DayOfWeek.valueOf(c.get(Calendar.DAY_OF_WEEK));
    }
    
    public int getDayOfYear(){
        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        return c.get(Calendar.DAY_OF_YEAR);
    }
    
    public static  int daysBetween(Date firstTime, Date secondTime){
        return Days.daysBetween(new DateTime(firstTime), new DateTime(secondTime)).getDays();
    }
    
    public Date customeDateToDate(){
        return new Date(year, month, day);
    }
    
    
//    public static void main(String[] args) {
//        CustomeDate d1 = new CustomeDate(1, 2, 2014);
//        CustomeDate d2 = new CustomeDate(10, 4, 2015);
//        System.out.println(d1.getDayOfWeek());
//        System.out.println(d2.getDayOfWeek());
//        System.out.println(d1.getDayOfYear());
//        System.out.println(d2.getDayOfYear());
//        System.out.println(daysBetween(d1.customeDateToDate(), d2.customeDateToDate()));
//        System.out.println(new Month(d1.month).getDays(false));
//        System.out.println(new Year(d2.year).leapYear);
//    }
         
    public static class Day{
        public int day;
        public Day(int day){
            this.day = day;
        }
    }
    
    public static class Month{
        public int month;
        public Month(int month){
            this.month = month;
        }
        public int getDays(boolean leapYear){
            if(contains((new int[]{1, 3, 5, 7, 8, 10, 12}), month))
                return 31;
            else if(contains((new int[]{4, 6, 9, 11}), month))
                return 30;
            else if(month == 2 && leapYear)
                return 29;
            else
                return 28;
        }
        
        public static boolean contains(int[] array, int v) {
            for (int e : array)
                if (e == v)
                    return true;
            return false;
        }
    }
     
    public static class Year{
        public boolean leapYear;
        public int year;
        public Year(int year){
            leapYear = new GregorianCalendar().isLeapYear(year);
            this.year = year;
        }
        
    }
    
}
