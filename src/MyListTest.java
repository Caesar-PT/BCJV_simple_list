public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> lisInteger = new MyList<Integer>();

        lisInteger.add(1);
        lisInteger.add(2);
        lisInteger.add(3);
        lisInteger.add(3);
        lisInteger.add(4);

        System.out.println("element 4: " + lisInteger.get(4));
        System.out.println("element 1: " + lisInteger.get(1));
        System.out.println("element 2: " + lisInteger.get(2));

        lisInteger.get(-1);
        System.out.println("element -1: " + lisInteger.get(-1));
    }
}
