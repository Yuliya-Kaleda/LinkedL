import java.util.HashMap;

public class HashMapInterview
{
    public static void main(String[] args)
    {
        int[] initial = {1, 1, 1, 1, 2, 2, 3, 3, 5};
        HashMap<Integer, Integer> count = new HashMap();
        for (Integer in : initial) {
            if (count.containsKey(in)) {
                int current = count.get(in);
                count.put(in, current + 1);
            }
            else {
                count.put(in, 1);
            }
        }
        System.out.println(count);
    }

}
