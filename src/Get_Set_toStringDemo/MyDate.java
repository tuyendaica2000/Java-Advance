package Get_Set_toStringDemo;

import java.util.Objects;

public class MyDate {
    private int Day;
    private int Month;
    private int Year;

    public MyDate(int day, int month, int year) {
        if (day >= 1 && day<=30) {
            this.Day = day;
        } else {
            this.Day = 1;
        }

        if (month >= 1 && month <=12){
            this.Month = month;
        } else {
            this.Month = 1;
        }

        if (year >= 0) {
            this.Year = year;
        } else {
            this.Year = 1;
        }
    }
    //Get set


    public int getDay() {
        return this.Day;
    }

    public int getMonth() {
        return this.Month;
    }

    public int getYear() {
        return this.Year;
    }

    public void setDay(int d) {
        if (d>=1 && d<=31)
            this.Day = d;
    }

    public void setYear(int y) {
        if (y>=1)
            this.Year = y;
    }

    public void setMonth(int m) {
        if (m>=1 && m<=12)
            this.Month = m;
    }

    @Override
    public String toString() {
        return this.Day + "/" + this.Month + "/" + this.Year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyDate myDate = (MyDate) obj;
        return Day == myDate.Day && Month == myDate.Month && Year == myDate.Year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Day, Month, Year);
    }

}
