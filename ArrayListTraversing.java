import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListTraversing {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        System.out.println("Loop through an ArrayList using a for loop");
        for(int i=0;i<numbers.size();i++)
        {
            System.out.println(numbers.get(i));
        }
        System.out.println("Loop through an ArrayList using a while loop");
        int i=0;
        while(numbers.size()>i)
        {
            System.out.println(numbers.get(i));
            i++;
        }
        System.out.println("Loop through an ArrayList using a "
        + "advanced for loop");
        for(Integer in:numbers)
        {
            System.out.println(in);
        }
        System.out.println("Loop through an ArrayList using iterator");
        Iterator it=numbers.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

