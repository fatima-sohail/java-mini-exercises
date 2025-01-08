package oop_encapsulation_retreive_heaviest_object_from_itemList_in_suitcase_from_suitcaseList_in_cargo_hold;

import java.util.ArrayList;

public class Hold {
    int maxWeight;
    ArrayList<Suitcase> suitcaseList;

    public Hold(int maxWeighttt) {
        maxWeight = maxWeighttt;
        suitcaseList = new ArrayList<>();
    }


    public int totalWeightHold() {
        int sum = 0;
        for (Suitcase suitcase : suitcaseList) {
            sum = sum + suitcase.totalWeightSuitecase();
        }
        return sum;
    }

    public void addSuitcase(Suitcase suitcase) {
        //use totalWeight() method from suitcase class
        if(totalWeightHold() + suitcase.totalWeightSuitecase() <= maxWeight) {
            suitcaseList.add(suitcase);
        }else{
            ;
        }

    }

    public String toString(){
        //if the list is empty, return null
        //output all the elements in the list
        //for proper english: if the list has one element, return: 1 item ( kg)
        //else, return 2 items ( total weight kg)
        if(suitcaseList.isEmpty()){
            return null;
        }

        if(suitcaseList.size() == 1){
            return suitcaseList.size() + " suitcase ( " + totalWeightHold() + " kg)";
        }else{
            return suitcaseList.size() + " suitcases ( " + totalWeightHold() + " kg)";
        }
    }

    public void printSuitcasesInHold(){
        //use printItems method from suitcase class
        for (Suitcase suitcase : suitcaseList) {
            suitcase.printItems();
        }

    }
}
