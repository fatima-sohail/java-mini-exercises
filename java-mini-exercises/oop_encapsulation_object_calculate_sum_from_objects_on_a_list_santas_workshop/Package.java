package oop_encapsulation_object_calculate_sum_from_objects_on_a_list_santas_workshop;

import java.util.ArrayList;

public class Package {
    ArrayList<Gift> giftList;

    public Package(){
        giftList = new ArrayList<>();
    }

    public void addGift(Gift gift){
        giftList.add(gift);
    }

    public int totalWeight(){
        int sum = 0;
        for(Gift gift: giftList){
            sum = sum + gift.getWeight();
        }

        return sum;
    }

}
