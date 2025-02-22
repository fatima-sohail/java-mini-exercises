package inheritance_task3_abstract_class_different_kinds_of_boxes_3_parts;

import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> misplacedBoxList;

    public MisplacingBox(){
        misplacedBoxList = new ArrayList<>();
    }

    @Override
    public void add(Item item){

        misplacedBoxList.add(item);

    }

    public boolean isInBox(Item item){
        return false;
    }
}

