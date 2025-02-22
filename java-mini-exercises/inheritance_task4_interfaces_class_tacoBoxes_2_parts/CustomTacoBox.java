package inheritance_task4_interfaces_class_tacoBoxes_2_parts;

public class CustomTacoBox implements TacoBox{
    private int tacos;

    public CustomTacoBox(int tacos){
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if (this.tacos >= 1) {
            this.tacos--;
        }
    }
}
