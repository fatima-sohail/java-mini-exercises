package oop_Encapsulation_ObjectAsObjectVariable_Birthday;

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
