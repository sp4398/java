import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
public class LinkedHashset {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        TreeSet<String> ts = new TreeSet<String>();
        h.add("B");
        h.add("A");
        h.add("D");
        h.add("E");
        h.add("C");
        h.add("F"); 

        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");

        ts.add("2");
        ts.add("3");
        ts.add("1");
        ts.add("6");
        ts.add("5");
        ts.add("4");
        System.out.println(hs);
        System.out.println(h);
        System.err.println(ts);
    }
}
