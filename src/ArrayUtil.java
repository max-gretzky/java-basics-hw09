import java.util.HashSet;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        // TODO fill in code here
        HashSet<String> set = new HashSet<>();

        for (String i : array1) {
            for (String j : array2) {
                if (i.equals(j)) {
                    set.add(j);
                }
            }
        }
        return set.toArray(new String[0]);
    }
}