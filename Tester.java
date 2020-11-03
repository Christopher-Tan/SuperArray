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
    }
}