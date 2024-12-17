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



    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }

    //if one person object is older than another person, return true
    public boolean isEarlierThan(SimpleDate object2){
        //compare years, if years are same, compare months and then days
        //if current(object) year is earlier(less than) than object2, return true,
        //that means current(0bject) is older than object2

        // First compare the years
        if (year < object2.year) {
            return true;  // Current date is earlier
        } else if (year > object2.year) {
            return false; // Current date is later
        }

        // If the years are the same, compare the months
        if (month < object2.month) {
            return true;  // Current date is earlier
        } else if (month > object2.month) {
            return false; // Current date is later
        }

        // If both year and month are the same, compare the days
        if (day < object2.day) {
            return true;  // Current date is earlier
        }

        return false; // If day is the same or later, return false
    }
}
