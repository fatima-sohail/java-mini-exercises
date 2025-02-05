package hash_map_updating_value_of_hashmap_as_counter_in_i_owe_you;

public class Main {
    public static void main(String[] args) {
        IOU mattOwes = new IOU();
        mattOwes.setSum("Arthur", 51.5);
        mattOwes.setSum("Micheal", 30);
        mattOwes.setSum("Arthur", 10.2);

        //The IOU does not care about old debt. When you set a new sum owed
        //to a person when there is some money already owed to the same person,
        //the old debt is forgotten
        System.out.println(mattOwes.howMuchDoIOweTo("Arthur"));
        System.out.println(mattOwes.howMuchDoIOweTo("J"));
    }
    
}
