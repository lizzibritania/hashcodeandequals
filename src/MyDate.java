import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Lizzi on 14.11.2016.
 */
public class MyDate {
    private int year;
    private int month;
    private int day;
    private String[] strMonths={"Jan", "Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov" ,"Dec"};
    private String[] strDays={"Sunday", "Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday"};


    private int[] daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setDate(int day,int month,int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate nextDay()
    {if (day==daysInMonths[month-1])
    { nextMonth();
        day=1;}
        else
            day+=1;


        return this;}

    public boolean isLeapYear(int year){
        GregorianCalendar gregorianCalendar=new GregorianCalendar();
        return gregorianCalendar.isLeapYear(year);
    }

    public boolean isValidDate(int year, int month, int day){
   if ((year<3000)&&(month<=12)&&(month>0)&&(day<=daysInMonths[month-1])&&(day>0))
       return true;
        else
            return false;
    }
    public MyDate nextYear()
    { this.year+=1;

        return this;}
    public MyDate previousYear()
    { this.year-=1;

        return this;}


    public MyDate nextMonth()
    { if (this.month==12)
    {this.month=1;
        nextYear();}
        else
        this.month+=1;

        return this;}
    public MyDate previousMonth()
    { if (this.month==1)
    {this.month=12;
    previousYear();}
    else
        this.month-=1;
        return this;}

    public MyDate previousDay()
    {if (day==1)
    { previousMonth();
        day=daysInMonths[month-1];}
    else
        day-=1;


        return this;}

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof MyDate)) return false;

        MyDate myDate = (MyDate) o;

        if ((year==myDate.year)&&(day==myDate.day)&&(year==myDate.year))
            return true;
        else return false;

    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + month;
        result = 31 * result + day;
        return result;
    }

    public int getDayOfWeek(int year, int month, int day){
        Calendar newCal = new GregorianCalendar();

        newCal.set(year, month,day, 0, 0, 0);

// BUG fix in Calendar class!


        int dayofweek = newCal.get(Calendar.DAY_OF_WEEK);
        return dayofweek;


    }

    @Override
    public String toString() {
        return strDays[getDayOfWeek(this.year,this.month,this.day)-1] +
              " "+ day +" "+strMonths[month-1]+" "+year;
    }
}

