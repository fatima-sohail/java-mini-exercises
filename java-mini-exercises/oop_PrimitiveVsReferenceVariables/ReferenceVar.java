package oop_PrimitiveVsReferenceVariables;

public class ReferenceVar {
    String name;

    public ReferenceVar(String namee) {
        name = namee;
    }

    public static void main(String[] args) {
        ReferenceVar lindy = new ReferenceVar("Lindy");
        System.out.println(lindy);
        //prints: ReferenceVar@65ab7765
        //it's a pointer (or reference) to the location in memory where the
        //actual object resides.
        //in order to print Lindy, toString() is used since it specifies what
        //the object print should look like

    }
}
