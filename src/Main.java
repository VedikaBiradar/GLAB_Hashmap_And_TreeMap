import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

//        ExampleOneHashMap ex=new ExampleOneHashMap();
//        ex.exampleOneHashMap();

//         ExampleTwoHashMap ep = new ExampleTwoHashMap();
//         ep.exampleTwoHashMap();

//        ExampleOneTreeMap etm = new ExampleOneTreeMap();
//        etm.exampleOneTreeMap();

//         ExampleTwoTreeMap et=new ExampleTwoTreeMap();
//         et.exampleTwoTreeMap();
        // Creating a treemap with a customized comparator
        TreeMap<String, Integer> numbers = new TreeMap<>(new TreeMapComparator());

        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);


    }
}