import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {
        //Create SuperArray
        SuperArray test = new SuperArray();
        System.out.println(test.size());
        //Add, Size
        String[] a = {"Hello", "Hi", "Hello!", "Hello-!"};
        for (int i = 0; i < a.length; i++) {
            System.out.println(test.add(a[i]));
            System.out.println(test.size());
        }
        //Get
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        //Set
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.set(i,"" + i));
        }
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        //AutoResizing
        for (int i = 0; i < 20; i++) {
            System.out.println(test.add("" + i));
        }
        //isEmpty and clear
        System.out.println(test.isEmpty());
        System.out.println(test);
        test.clear();
        System.out.println(test.isEmpty());
        System.out.println(test);
        //contains
        test.add("Hello");
        test.add("Hi");
        System.out.println(test);
        System.out.println(test.contains("He"));
        System.out.println(test.contains("Hi"));
        System.out.println(test.contains("Hello"));
        //New Constructor
        SuperArray tester = new SuperArray(100);
        //New add
        test.add(1,"Middle");
        System.out.println(test);
        test.add(1,"Second");
        System.out.println(test);
        System.out.println(test.remove(2));
        System.out.println(test);
        System.out.println(test.indexOf("Second"));
        System.out.println(test.indexOf("Hey"));
        System.out.println(Arrays.toString(test.toArray()));
        test.add("Second");
        //lastindexof
        System.out.println(test.lastIndexOf("Second"));
        System.out.println(test.lastIndexOf("None"));
        SuperArray k = new SuperArray();
        k.add("Hello");
        System.out.println(test.equals(k));
        k.add("Second");
        System.out.println(test.equals(k));
        k.add("Hi");
        System.out.println(test.equals(k));
        k.add("Second");
        System.out.println(test.equals(k));
        k.set(2,"H");
        System.out.println(test.equals(k));
        k.add("Added");
        System.out.println(test.equals(k));
        //Error Handling
        try {
            SuperArray t = new SuperArray(-1);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } 

        try {
            test.get(-5);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println(test);
            test.get(4);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        try {
            test.set(4,"Hi");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(test);

        try {
            test.add(4,"Hi");
            test.add(6,"Hi");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}