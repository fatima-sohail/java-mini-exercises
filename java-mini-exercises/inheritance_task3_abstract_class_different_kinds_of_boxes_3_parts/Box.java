package inheritance_task3_abstract_class_different_kinds_of_boxes_3_parts;

import java.util.ArrayList;

public abstract class Box {
    public abstract void add(Item item);

    public void add(ArrayList<Item> items){
        for(Item item: items){
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}
