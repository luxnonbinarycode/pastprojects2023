package Mashayla_Kendrick_HW2_Q2;

public class BasicPair<T> implements PairInterface<T>{
    protected T firstBasicPairInput;

    protected T secondBasicPairInput;
    public BasicPair(T firstBasicPairAnswer, T secondBasicPairAnswer) {
            firstBasicPairInput = firstBasicPairAnswer;
            secondBasicPairInput = secondBasicPairAnswer;
    }

    public void setFirstInput(T firstBasicPairAnswer) {
        firstBasicPairInput = firstBasicPairAnswer;
    }

    public void setSecondInput(T secondBasicPairAnswer) {
        secondBasicPairInput = secondBasicPairAnswer;
    }

    public T getFirstInput() {
        return firstBasicPairInput;
    }

    public T getSecondInput() {
        return secondBasicPairInput;
    }

    public void print() {
        if ((firstBasicPairInput instanceof String &&
                secondBasicPairInput instanceof String) || (firstBasicPairInput
                instanceof Boolean && secondBasicPairInput instanceof Boolean) ||
                (firstBasicPairInput instanceof Integer && secondBasicPairInput
                instanceof Integer)) {
         System.out.print(firstBasicPairInput + " " + secondBasicPairInput);
        }

        else {
            System.out.printf("%.2f", firstBasicPairInput);
            System.out.print(" ");
            System.out.printf("%.2f", secondBasicPairInput);
        }
    }
}
