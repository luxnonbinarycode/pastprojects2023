

public class TestIndexed {
    public static void main(String [] args) {
        ABList<String> testList = new ABList<>(5);
        testList.add(0,"apple");
        testList.add(1,"orange");
        testList.add(2,"peach");
        testList.add(3,"grape");
        testList.add(4,"berry");


        System.out.println(testList.toString());

        testList.set(0,"banana");

        System.out.println(testList.toString());

        System.out.println(testList.get(0));

        System.out.println(testList.indexOf("peach"));

        testList.remove(0);

        System.out.println(testList.toString());







    }
}
