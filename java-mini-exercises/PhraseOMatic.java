/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
//Make three sets of words to choose from
//findout how many words are in each list
//generate three random numbers
//now build a phrase
//print the phrase
public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = { "fantastic", "smart", "frontend", "dynamic" };
        String[] wordListTwo = { "empowered", "outside of the box", "targerted", "accelerated" };
        String[] wordListThree = { "process", "solutions", "mission", "portal" };

        int listOneLength = wordListOne.length;
        int listTwoLength = wordListTwo.length;
        int listThreeLength = wordListThree.length;

        int random1 = (int) (Math.random() * listOneLength);
        int random2 = (int) (Math.random() * listTwoLength);
        int random3 = (int) (Math.random() * listThreeLength);

        String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " "
                + wordListThree[random3];
        System.out.println(phrase);
    }
}
