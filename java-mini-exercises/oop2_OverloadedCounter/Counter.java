package oop2_OverloadedCounter;

public class Counter {
    int value;

    public Counter(int startValue){
        value = startValue;
    }

    public Counter(){
        value = 0;
    }

    public int value(){
        return value;
    }

//    public void increase(){
//        value = value + 1;
//    }
//
//    public void decrease(){
//        value = value - 1;
//    }

    public void increase(int increaseBy){
        if(increaseBy >= 0){
            value = value + increaseBy;
        }
//        else{
//            value = value;
//        }

    }

    public void decrease(int decreaseBy){
        if(decreaseBy >= 0){
            value = value - decreaseBy;
        }
//        else{
//            value = value;
//        }
    }

    @Override
    public String toString() {
        return "Counter value: " + value;
    }
}
