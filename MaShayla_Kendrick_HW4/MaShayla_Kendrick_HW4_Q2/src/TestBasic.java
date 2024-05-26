


public class TestBasic {
    public static void main(String[] args) {

        ABList<String> testList = new ABList<>(5);
        testList.add("apple");
        testList.add("orange");
        testList.add("peach");
        testList.add("grape");
        testList.add("berry");

        System.out.println(testList.toString());

        testList.remove("apple");

        System.out.println(testList.toString());

        if (testList.contains("apple")) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        System.out.println(testList.get("grape"));

        System.out.println(testList.size());




    }
}
