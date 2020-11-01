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
            System.out.println(test.set(i,"0"));
        }
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        //AutoResizing
        for (int i = 0; i < 20; i++) {
            System.out.println(test.add("0"));
        }
    }
}