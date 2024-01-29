import java.util.ArrayList;
import java.util.Random;
public class DominoPile {
    private ArrayList<Domino> pile;
    public DominoPile() {
        pile = new ArrayList<Domino>();
    }
    public ArrayList<Domino> getPile() {
        return pile;
    }
    public void newStack6() {
        int top;
        int bottom;
        for (int i = 0; i < 7; i++) {
            top = i;
            for (int j = i; j < 7; j++) {
                bottom = j;
                Domino temp = new Domino(top, bottom);
                pile.add(temp);
            }
        }
    }
    public void shuffle() {
        Random random = new Random();
        int loops = random.nextInt(15);
        Domino temp;
        for (int i = 0; i < loops; i++) {
            int chosen = random.nextInt(21);
            temp = pile.get(chosen);
            int chosen2 = random.nextInt(21);
            pile.set(chosen, pile.get(chosen2));
            pile.set(chosen2, temp);
        }
    }
}
