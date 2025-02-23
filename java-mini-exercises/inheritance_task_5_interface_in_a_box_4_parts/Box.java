package inheritance_task_5_interface_in_a_box_4_parts;

import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> itemListBox;
    private double maxCapacity;

    public Box(double maxCapacity){
        itemListBox = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public void addBookOrCDInList(Packable bookORcd){
        if(this.weight() + bookORcd.weight() <= maxCapacity){
            this.itemListBox.add(bookORcd);
        }
    }


    @Override
    public double weight(){
        double combinedWeight = 0;
        for(Packable item: itemListBox){
            combinedWeight = combinedWeight + item.weight();
        }

        return combinedWeight;
    }

    @Override
    public String toString(){
        return "Box: " + itemListBox.size() + ", total weight " + this.weight() + " kg";
    }

}
