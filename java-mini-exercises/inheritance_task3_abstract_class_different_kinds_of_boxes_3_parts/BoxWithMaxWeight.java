package inheritance_task3_abstract_class_different_kinds_of_boxes_3_parts;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    ArrayList<Item> itemsInMaxBoxList;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        itemsInMaxBoxList = new ArrayList<>();
    }

    public int currentAmountWeight(){
        int sum = 0;
        for(Item each: itemsInMaxBoxList){
            sum = sum + each.getWeight();
        }

        return sum;
    }

    @Override
    public void add(Item item){
        if(currentAmountWeight() + item.getWeight() <= this.capacity){
            itemsInMaxBoxList.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return itemsInMaxBoxList.contains(item);
    }
}
