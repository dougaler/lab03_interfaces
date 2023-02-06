import java.util.ArrayList;

public class collector {

    public ArrayList <String> collectAllWord() {
        ArrayList<String> newList = new ShortLister().getWord();
        ArrayList<String> shortList = new ArrayList<>();
        for (int j = 0; j < newList.size(); j++) {
            boolean wordTrue = new ShortWordFilter().accept(newList.get(j));
            if (wordTrue) {
                shortList.add(String.valueOf(newList.get(j)));
            }
        }
        return shortList;
    }
    public ArrayList <String> collectAllRect() {
        ArrayList<Double> newList = new BigRectLister().getRectList();
        ArrayList<String> bigList = new ArrayList<>();
        for (int j = 0; j < newList.size(); j++) {
            boolean wordTrue = new BigRectangleFilter().accept(newList.get(j));
            if (wordTrue) {
                bigList.add(String.valueOf(newList.get(j)));
            }
        }
        return bigList;
    }

}
