public class Demo {
    public static void removeDuplicates(SuperArray s) {
        for (int i = s.size() - 1; i > 0; i--) {
            if (s.indexOf(s.get(i)) == i) {
            } else {
                s.remove(i);
            }
        }
    }
    public static SuperArray findOverlap(SuperArray a, SuperArray b) {
        SuperArray result = new SuperArray();
        for (int i = 0; i < a.size(); i++) {
            if (b.contains(a.get(i))) {
                result.add(a.get(i));
            }
        }
        removeDuplicates(result);
        return result;
    }
    public static SuperArray zip(SuperArray a, SuperArray b) {
        SuperArray result = new SuperArray();
        for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
            if (i < a.size()) result.add(a.get(i));
            if (i < b.size()) result.add(b.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        SuperArray words = new SuperArray();
        //grouped to save vertical space
        words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
        words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
        words.add("una");    words.add("ebi");     words.add("toro"); 
    
        System.out.println(words);
        removeDuplicates(words);
        System.out.println(words);
        SuperArray m = new SuperArray();
        SuperArray n = new SuperArray();
        String[] c = {"9","1","2","2","3","4"};
        String[] d = {"0","4","2","2","9"};
        for (int i = 0; i < c.length; i++) {
            m.add(c[i]);
        }
        for (int i = 0; i < d.length; i++) {
            n.add(d[i]);
        }
        System.out.println(m);
        System.out.println(n);
        System.out.println(findOverlap(m,n));
        System.out.println(zip(m,n));
        System.out.println(zip(n,m));
    }
}