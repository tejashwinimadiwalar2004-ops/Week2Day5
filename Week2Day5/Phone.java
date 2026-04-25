import java.util.HashMap;

public class Phone {
   public static void main(String[] args) {
       HashMap<String,Integer> hs = new HashMap<>();
       hs.put("Teja", 15648845);
       hs.put("Vaishu", 15498446);
       hs.put("vaibha", 2654612);
       System.out.println(hs.get("Teja"));
   } 
}
