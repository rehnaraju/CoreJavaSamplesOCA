/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejavasamplesoca;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Flow-User
 */
public class DateTimeExamples {
    public static void main(String[] args) {
        System.out.println("LocalDate "+LocalDate.now());
        System.out.println("LocalTime "+LocalTime.now());
        System.out.println("LocalDateTime "+LocalDateTime.now());
        System.out.println("--------------");
        LocalDate date1=LocalDate.of(1994,07,17);
        LocalDate date2=LocalDate.of(1889, Month.FEBRUARY,22);
        LocalTime time1=LocalTime.of(15,50);
        LocalTime time2=LocalTime.of(2,50, 10);
        LocalDateTime datetime1=LocalDateTime.of(date2, time2);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(datetime1);
        System.out.println("--------------");
        System.out.println(date1);
        date1=date1.plusDays(1);
        System.out.println(date1);
        System.out.println(datetime1);
        datetime1=datetime1.plusSeconds(50).minusHours(24);
        System.out.println(datetime1);
        System.out.println("--------------");
        LocalDate start=LocalDate.of(1994, Month.MARCH, 1);
        LocalDate end =LocalDate.of(1995, Month.MARCH, 31);
        display(start,end);
        Period period=Period.ofMonths(3);
        displayPeriod(start,end,period);
        System.out.println("------Epoch Methods--------");
        System.out.println(start.toEpochDay());
        System.out.println(datetime1.toEpochSecond(ZoneOffset.UTC));
        System.out.println("--------------");
        Instant e=Instant.now();
        int i = 0;
        while(i<100)
        {
            //System.out.println(i++);
            i++;
        }
        Instant s=Instant.now();
        System.out.println(Duration.between(e, s));
        LocalDate d5=LocalDate.of(2018, Month.OCTOBER, 28);
        LocalTime t5=LocalTime.of(2, 0);
        ZoneId z=ZoneId.of("Europe/Berlin");
        ZonedDateTime zdt=ZonedDateTime.of(d5, t5, z);
        System.out.println(zdt);
        zdt=zdt.plusHours(1);
        System.out.println(zdt);
        System.out.println("--------------");
        
        Date d6=new Date();
        System.out.println(d6);
        //DateTimeFormatter f1=DateTimeFormatter.ISO_DATE;
       // f1=DateTimeFormatter.ofPattern('dd.mm.yy');
       DateTimeFormatter f1=DateTimeFormatter.ofPattern("MMMM dd,yyyy,hh:mm");
        LocalDate date=LocalDate.now();
         //date=LocalDate.parse("20.09.05",f1);
        System.out.println(date);
        System.out.println(zdt.format(f1));
        DateTimeFormatter f2=DateTimeFormatter.ISO_TIME;
        f2=DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time0=LocalTime.now();
         time0=LocalTime.parse("06:08",f2);
        System.out.println(time0);
        
    }
    public static void display(LocalDate start,LocalDate end)
    {
        LocalDate temp=start;
        while(temp.isBefore(end))
        {
            System.out.println(temp);
            temp=temp.plusMonths(2);
        }
    }
    public static void displayPeriod(LocalDate start,LocalDate end,Period period)
    {
       LocalDate temp=start;
        while(temp.isBefore(end))
        {
            System.out.println(temp);
            temp=temp.plus(period);
        } 
    }
    
}
