package oop_encapsulation_object_as_a_methods_return_value_datingApp;

public class Main {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is: " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while(week <= 7){
            System.out.println("Friday after week " + week + " is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
            week++;
        }

        System.out.println("the date after 790 days from the examined Friday is: " + date.afterNumberOfDays(790));

        //difference b/w creating two different objs with same values ---> have same values but different locations
        //e.g `date` and `now`
        // vs
        //assigning value of one object to another ----> both objs points to same location &
        //changing one's value changes the other's value too since both objs point to the same value
        //e.g `now` and `afterOneWeek`
        SimpleDate now = new SimpleDate(13, 2, 2015);
        System.out.println(now);

        SimpleDate afterOneWeek = now;
        System.out.println(afterOneWeek); //prints same as now's above

        afterOneWeek.advance(7);
        //OR
        //now.advance(7) //prints same as below

        System.out.println("");
        System.out.println("now: " + now);
        System.out.println("after one week: " + afterOneWeek); //prints same as now's above


    }
}
