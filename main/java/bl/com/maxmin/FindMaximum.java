package bl.com.maxmin;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaximum<T extends Comparable> {
    ArrayList<T> list = new ArrayList<T>();

    //constructor accept multiple argument
    public FindMaximum(T... inputs){
        for (T value : inputs){
            this.list.add(value);

        }
    }
    public T testMaximum(){
        return (T) FindMaximum.testMaximum(list);
    }
    public static <T extends  Comparable<T>> T testMaximum(ArrayList<T> list){
        //sort the list in ascending
        Collections.sort(list);

        //last position holds the max value
        T maxValue = list.get(list.size()-1);
        showMaxValue(list, maxValue);
        return maxValue;
    }
    public static <T> void showMaxValue(ArrayList<T> list, T maxValue){
        System.out.println("\nInput values :");
        for(T value : list){
            System.out.println(value + " ");
        }
        System.out.println("\nMaximum :" + maxValue);
    }

    public static void main(String[] args) {

        Float floatValue1 = 3.3f, floatValue2 = 3.5f, floatValue3 = 8.7f;

        new FindMaximum(floatValue1, floatValue2, floatValue3).testMaximum();
    }
}
