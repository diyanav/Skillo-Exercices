package lab4;

import java.util.*;

public class examples {
    public static void main(String[] args) {

    //testArrayDeclarationElementInit();
    //testArrayDeclarationElementInit();
    //testArrayDeclaration();
    //testArrayElementValue();
    //testArrayForEach();
    //testMultidimensionalArray();
    //testArrayListDeclaration();
    //testArrayListOperations();
    //testLinkedListInit();
    //testLinkedListOperations();
    //testQueueInit();
    //testStack();
    //testHashSet();
    //testHashSetOperations();
    //testHashMap();
    //testHashMapOperations();
}

    public static void testArrayDeclarationElementInit() {
        String[] carBrands = {"Audi", "BMW", "Volvo", "Mercedes"};
        int[] evenNumbers = {2, 4, 6, 8, 10};
        double[] degrees = {0, 0.5, 1, 1.5, 2, 2.5};

        System.out.println(carBrands[0]);
        System.out.println(evenNumbers[2]);
        System.out.println(degrees[5]);

        System.out.println(carBrands.length);
        System.out.println(evenNumbers.length);
        System.out.println(degrees.length);

    }

    public static void testArrayDeclaration() {
        String[] carBrands = new String[4];
        carBrands[0] = "Audi";
        carBrands[1] = "BMW";
        carBrands[2] = "Volvo";
        carBrands[3] = "Mercedes";

        System.out.println(carBrands[1]);
        System.out.println(carBrands.length);
    }

    public static void testArrayElementValue() {
        String[] carBrands = {"Audi", "BMW", "Volvo", "Mercedes"};

        for (int i = 0; i < carBrands.length; i++) {
            System.out.println(carBrands[i]);
        }
    }

    public static void testArrayForEach() {
        String[] carBrands = {"Audi", "BMW", "Volvo", "Mercedes"};

        for (String brand : carBrands) {
            System.out.println(brand);
        }
    }

    public static void testMultidimensionalArray() {
        /*
        int[][] arr = new int[3][3];
        arr [0][0]=1;
        arr [0][1]=2;
        arr [0][2]=3;
        arr [1][0]=4;
        arr [1][1]=5;
        arr [1][2]=6;
        arr [2][0]=7;
        arr [2][1]=8;
        arr [2][2]=9;
        */

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.println(arr[row][column]);
            }
        }
    }

    public static void testArrayListDeclaration() {
        ArrayList<String> carBrands = new ArrayList<>();
        carBrands.add("Audi");
        carBrands.add("Mazda");
        carBrands.add("Ford");
        carBrands.add("Mercedes");

        System.out.println(carBrands);
        System.out.println(carBrands.get(0));
    }

    public static void testArrayListOperations() {
        ArrayList<String> carBrands = new ArrayList<>();
        carBrands.add("Audi");
        carBrands.add("Mazda");
        carBrands.add("Ford");
        carBrands.add("Mercedes");

        carBrands.set(1, "BMW");
        carBrands.remove(1);
        System.out.println(carBrands);
        carBrands.add(3, "Honda");
        carBrands.add(1, "Opel");
        System.out.println(carBrands);

        for (String carBrand : carBrands) {
            System.out.println(carBrand);
        }

        Collections.sort(carBrands);
        System.out.println(carBrands);
    }

    public static void testLinkedListInit() {
        LinkedList<String> carBrands = new LinkedList<>();
        carBrands.add("Audi");
        carBrands.add("Mazda");
        carBrands.add("Ford");
        carBrands.add("Mercedes");
        System.out.println(carBrands);
        System.out.println(carBrands.get(0));
    }

    public static void testLinkedListOperations() {
        LinkedList<String> carBrands = new LinkedList<>();
        carBrands.add("Audi");
        carBrands.addFirst("Mercedes");
        carBrands.addLast("Opel");
        carBrands.add(1, "Mazda");

        System.out.println(carBrands);
        System.out.println(carBrands.getFirst());
        System.out.println(carBrands.getLast());

        carBrands.remove(); //remove first elements
        System.out.println(carBrands);

        carBrands.removeFirst();
        System.out.println(carBrands);

        carBrands.removeAll(carBrands);
        System.out.println(carBrands);
        System.out.println(carBrands.size());
    }

    public static void testQueueInit() {
        Queue<Integer> queue = new PriorityQueue<>(); //PriorityQueue use natural ordering. new LinkedList<> would follow the order
        queue.add(10);
        queue.add(20);
        queue.add(15);

        int numElements = queue.size();

        System.out.println(numElements);

        System.out.println("Queue elements: " + queue);

        for (int i = 0; i < numElements; i++) {
            System.out.println("Remove elements: " + queue.poll());
        }
    }

    public static void testStack() {
        Stack<String> elements = new Stack<>();

        elements.push("Test1");
        elements.push("Test2");
        elements.push("Test3");
        elements.push("Test4");
        System.out.println("Stack elements: " + elements);

        System.out.println("Element removed: " + elements.pop());
        System.out.println("Stack elements: " + elements);

        elements.push("Test5");
        System.out.println("Stack elements: " + elements);
    }

    public static void testHashSet() {
        HashSet<String> set = new HashSet<>();

        set.add("One");
        set.add("Two");
        set.add("Three");

        System.out.println(set);

        for (String num : set) {
            System.out.println(num);
        }

        System.out.println(set.size());
    }

    public static void testHashSetOperations() {
        HashSet<String> names = new HashSet<>();

        names.add("Niki");
        names.add("Ivan");
        names.add("Dragan");

        names.remove("Ivan");
        System.out.println(names);

        HashSet<String> namesToBeAdded = new HashSet<>();
        names.add("Evi");
        names.add("Eli");

        names.addAll(namesToBeAdded);
        System.out.println(names);

        names.removeIf(s -> s.contains("rag"));
        System.out.println(names);

        names.clear();
        System.out.println(names);
    }

    public static void testHashMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Mango");
        map.put(1, "Banana");
        map.put(1, "Grapes");
        map.put(1, "Berries");

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (Integer keys : map.keySet()) {
            System.out.println(keys);
        }
    }

    public static void testHashMapOperations() {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(100, "Ivan");
        people.put(101, "Georgi");
        people.put(102, "Stoyan");

        for (Map.Entry entry : people.entrySet()) {
            System.out.println(entry.getValue());
        }

        people.replace(102, "Stoyan", "Anton");

        for (Map.Entry entry: people.entrySet()) {
            System.out.println("Keys: " + entry.getKey() + " value: " + entry.getValue());
        }
    }

}
