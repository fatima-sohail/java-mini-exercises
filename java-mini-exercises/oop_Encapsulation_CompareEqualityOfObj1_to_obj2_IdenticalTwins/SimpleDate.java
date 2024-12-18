package oop_Encapsulation_CompareEqualityOfObj1_to_obj2_IdenticalTwins;

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
}
