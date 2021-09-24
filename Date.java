import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    private final int minYear = 1;
    private final int maxYear = 9999;
    private int day = 11;
    private int year = 1400;
    private int month = 1;
    private final String[] months = {"farvardin", "ordibehesht", "khordad", "tir", "mordad", "shahrivar"
            , "mehr", "aban", "azar", "dey", "bahman", "esfand"};

    public Date(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public Date() {

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

}
