package oop_Encapsulation_comparingObj1ToObj2;

//comparing apartments
public class Apartment {
    int rooms;
    int squares;
    int pricePerSquare;


    public Apartment(int roomss, int squaress, int pricePerSquaree){
        rooms = roomss;
        squares = squaress;
        pricePerSquare = pricePerSquaree;
    }

    public boolean largerThan(Apartment obj2){
        // Compare total area (squares) of the two apartments
        //if current objec squares is greater than obj2 squares, return true, else, return false
        if(squares > obj2.squares){
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment obj2){
        int price1 = squares * pricePerSquare;
        int price2 = obj2.squares * obj2.pricePerSquare;

        //return the absolute value

        return Math.abs(price1 - price2);

    }

    public boolean moreExpensiveThan(Apartment obj2){
        int price1 = squares * pricePerSquare;
        int price2 = obj2.squares * obj2.pricePerSquare;

        if(price1 > price2){
            return true;
        } else {
            return false;
        }

    }

}
