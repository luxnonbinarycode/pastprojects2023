package Mashayla_Kendrick_HW2_Q2;
import java.util.ArrayList;

public class ArrayPair<T> implements PairInterface<T> {

    protected ArrayList<T> arrayPair = new ArrayList<T>(2);



    public ArrayPair(T firstArrayPairAnswer, T secondArrayPairAnswer) {
        arrayPair.add(0,firstArrayPairAnswer);
        arrayPair.add(1,secondArrayPairAnswer);
    }

    public void setFirstInput(T firstArrayPairAnswer) {
        arrayPair.add(0,firstArrayPairAnswer);
    }

    public void setSecondInput(T secondArrayPairAnswer) {
        arrayPair.add(1,secondArrayPairAnswer);
    }

    public T getFirstInput() {
        return arrayPair.get(0);
    }

    public T getSecondInput() {
        return arrayPair.get(1);
    }

    public void print() {
        if ((arrayPair.get(0) instanceof String &&
                arrayPair.get(1) instanceof String) || (arrayPair.get(0)
                instanceof Boolean && arrayPair.get(1) instanceof Boolean) ||
                (arrayPair.get(0) instanceof Integer && arrayPair.get(1)
                        instanceof Integer)) {
            System.out.print(arrayPair.get(0) + " " + arrayPair.get(1));
        }

        else {
            System.out.printf("%.2f", arrayPair.get(0));
            System.out.print(" ");
            System.out.printf("%.2f", arrayPair.get(1));
        }
    }
}
