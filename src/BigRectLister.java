import java.util.ArrayList;
import java.util.Random;

public class BigRectLister {

    public ArrayList<Double> getRectList() {
        ArrayList<Double> rectList = new ArrayList<>();
        ArrayList<Double> smallRectList = new ArrayList<>();
        ArrayList<Double> largeRectList = new ArrayList<>();
        Random rand = new Random();
        //Next is to generate 5 random numbers. 5 smaller 5 bigger. This is just used to prove the program works and
        //is not useful to the actual program
        do{
            double randPerimeter = rand.nextInt(10);
                smallRectList.add(randPerimeter);
        }while(smallRectList.size()<5);
        do{
            double randPerimeter = rand.nextInt(20);
            if(randPerimeter>10){
                largeRectList.add(randPerimeter);
            }
        }while(largeRectList.size()<5);
        for(int i = 0; i < 5; i++){
            rectList.add(largeRectList.get(i));
            rectList.add(smallRectList.get(i));
        }
        System.out.println("Original List: " + rectList);
        return rectList;
    }
}
