public class Hobbits {
    //declare a variable called name
    String name;
    public static void main(String[] args) {

        //create an array h, should hold 3 elements
        Hobbits[] h = new Hobbits[3];
        //go through each element in the array, create object refrences,
        //at index 1, assign a name "frodo" to that element
        //at index 2, assign a name "sam" to that element
        //the remaining is named "bilbo"
        //print "arrayName[i].name is a good hobbit name"
        int i = 0;
        while(i < h.length){
            h[i] = new Hobbits();
            h[i].name = "bilbo";
            if(i == 1){
                h[1].name = "frodo";
            }
            if(i == 2){
                h[2].name = "Sam";
            }


            System.out.println(h[i].name + " is a good hobbit name.");
            i++;
        }

    }
}
