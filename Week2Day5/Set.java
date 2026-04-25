
import java.util.HashSet;

public class Set {
   public static void main(String[] args) {
       HashSet<Integer> hs = new HashSet<Integer>();
       hs.add(101);
       hs.add(102);
       hs.add(103);
       hs.add(101);
       hs.add(104);
       hs.add(105);
       hs.add(102);
        System.out.println(hs);
   } 
}
