import java.util.ArrayList;

public class Max{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        int max = al.get(0);

        for (int num : al) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);

    }
}