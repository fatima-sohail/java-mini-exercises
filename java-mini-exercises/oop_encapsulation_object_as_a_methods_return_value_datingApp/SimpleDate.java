package oop_encapsulation_object_as_a_methods_return_value_datingApp;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean isEarlierThan(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(){
        //moves the date by one day, assume each month is of 30 days

        //move the day forward by 1
        this.day = this.day + 1;

        //if the day exceeds 30, reset the day to 1 and increase the month
        if(this.day > 30){
            this.day = 1;
            this.month = this.month + 1;
        }

        //if months exceed 12, reset it to 1 and increase the year
        if(this.month > 12){
            this.month = 1;
            this.year = this.year + 1;
        }

        public void advance(int howManyDays){
//            this.day = this.day + howManyDays;
//            if(this.day > howManyDays){
//                this.month = this.month + 1;
//                this.day = this.day - 30;
//            }
//            if(this.month > 12){
//                this.year = this.year + 1;
//                this.month = 1;
//            }
//            OR
            for(int i = 0; i < howManyDays; i++){
                advance();
            }
        }

        public SimpleDate afterNumberOfDays(int days){
            SimpleDate sdObj = new SimpleDate();
        }
    }
}

