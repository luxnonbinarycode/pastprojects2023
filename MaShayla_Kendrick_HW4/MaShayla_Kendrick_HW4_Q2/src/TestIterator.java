import java.util.Iterator;

public class TestIterator {
    public static void main(String [] args) {
        ABList<String> testList = new ABList<>(5);
        testList.add("apple");
        testList.add("orange");
        testList.add("peach");
        testList.add("grape");
        testList.add("berry");

        Iterator<String> iter;

        iter = testList.iterator();

        int listSize = testList.size();

        for (int i = 0; i < listSize; i++) {
            if (iter.hasNext()) {
                System.out.println("true");
                break;
            }
        }

        System.out.println(iter.next());

        iter.remove();

        System.out.println(testList.toString());
    }
}
