package oop_Encapsulation_ObjectAsInstanceVariable_Birthday;
//create a SimpleDate class with instance variables day, month and year
//contructor initializes the fields with given values
//The `toString()` method formats the output as 'dd. mm. year'
public class SimpleDate {
    int day;
    int month;
    int year;

    public SimpleDate(int dayy, int monthh, int yearr){
        day = dayy;
        month = monthh;
        year = yearr;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
