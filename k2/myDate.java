package k2;             //随便写写，我理解能力比较差，题目貌似没看懂。。。
import  java.util.*;
import java.text.*;
public class myDate {            //随便写写，我理解能力比较差，题目貌似没看懂。。。
    private int year,month,day;
    private long ms;
    public myDate(){
        Calendar c1 = Calendar.getInstance();
        this.year = c1.get(Calendar.YEAR);
        this.month = c1.get(Calendar.MONTH);
        this.day = c1.get(Calendar.DATE);
    }
                                    //随便写写，我理解能力比较差，题目貌似没看懂。。。
    public myDate(long ms){
        Date d1 = new Date();
        this.ms = d1.getTime();
        System.out.println(this.ms);
    }

    public myDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public static void setyear(myDate d,int year){
        d.year=year;
    }

    public static void setmonth(myDate d,int month){
        d.month=month;
    }

    public static void setday(myDate d, int day){
        d.day=day;
    }

    public static void get(myDate d){
        System.out.println(d.year+"年"+d.month+"月"+d.day+"日");

    }

    public static void setDate(myDate d,int year,int month,int day){
        d.year+=year;
        d.month+=month;
        d.day+=day;
        while(d.day>30){
            d.day-=30;
            d.month++;
        }
        while(d.month>11){
            d.month-=11;
            d.year++;
        }

    }

    public static void main(String[] args) {
        myDate d1 = new myDate();
        new myDate(1);
        myDate d2 = new myDate(2003,06,17);
        get(d2);
        setday(d2,15);
        get(d2);
        setDate(d2,2,3,22);
        get(d2);
    }

}
