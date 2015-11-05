import java.util.HashMap;

public class AnagramsHashTable
{
    public static void main(String[] args) {
        boolean result = false;
        HashMap<Character, Integer> array1 = getHashMap("one two");
        HashMap<Character, Integer> array2 = getHashMap("enowto");
        if (array1.equals(array2)) {
           result = true;
        }
        System.out.println(result);
    }

    public static HashMap<Character, Integer> getHashMap(String s) {
        char[] array1 = s.replaceAll("\\W","").toCharArray();
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (Character character : array1) {
            int current = 1;
            if (count.containsKey(character)) {
                current ++;
            }
            count.put(character, current);
        }
        return count;

    }
}
