package inheritance_task3_abstract_class_different_kinds_of_boxes_3_parts;

import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> oneItemBoxList;

    public OneItemBox(){
        oneItemBoxList = new ArrayList<>();
    }

    @Override
    public void add(Item item){
        if(this.oneItemBoxList.isEmpty()){
            this.oneItemBoxList.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item){
        return oneItemBoxList.contains(item);
    }
}
